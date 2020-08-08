package com.devoir.gestioncommande.controller;

import com.devoir.gestioncommande.config.JwtTokenUtil;
import com.devoir.gestioncommande.model.ErrorResponse;
import com.devoir.gestioncommande.model.JwtRequest;
import com.devoir.gestioncommande.model.ResponseJwt;
import com.devoir.gestioncommande.service.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin
public class JwtAuthenticationController {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private UserDetailsServiceImpl userDetailsService;


//    private void authenticate(String username, String password) throws Exception {
//        try {
//            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
//        } catch (DisabledException e) {
//
//            throw new Exception("USER_DISABLED", e);
//        } catch (BadCredentialsException e) {
//            throw new Exception("INVALID_CREDENTIALS", e);
//        }
//    }
    @PreAuthorize("hasAuthority('ROLE_CLIENT') or hasAuthority('ROLE_ADMIN')")
    @RequestMapping(value = "/roles", method = RequestMethod.GET, consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_FORM_URLENCODED_VALUE })
    public List<String> getUserRoles(@RequestParam("username") String username) throws Exception {
        final UserDetails userDetails = userDetailsService
                .loadUserByUsername(username);

        return userDetails.getAuthorities().stream()
                .map(u->((GrantedAuthority) u)
                        .getAuthority()).collect(Collectors.toList());
    }

    @PostMapping("/login")
    public ResponseEntity<?> authenticateUser(@RequestBody JwtRequest authenticationRequest) {

        final UserDetails details = userDetailsService
                .loadUserByUsername(authenticationRequest.getUsername());
        Authentication authentication = null;
        try {
            authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword()));
            SecurityContextHolder.getContext().setAuthentication(authentication);

            String jwt = jwtTokenUtil.generateToken(details);
            UserDetails userDetails = (UserDetails) authentication.getPrincipal();
            if(userDetails != null)
                return ResponseEntity.ok(new ResponseJwt(jwt, userDetails.getUsername(), userDetails.getAuthorities()));
            return ResponseEntity.ok(new ErrorResponse("INVALID_CREDENTIALS"));
        } catch (DisabledException e) {
            return ResponseEntity.ok(new ErrorResponse("USER_DISABLED"));
        } catch (BadCredentialsException e) {
            return ResponseEntity.ok(new ErrorResponse("INVALID_CREDENTIALS"));
        }

    }
}
