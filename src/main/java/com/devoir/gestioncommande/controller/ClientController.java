package com.devoir.gestioncommande.controller;

import com.devoir.gestioncommande.model.Client;
import com.devoir.gestioncommande.service.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/client")
@CrossOrigin
public class ClientController {

    @Autowired
    private ClientServiceImpl clientService;

    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @GetMapping("/all")
    public @ResponseBody List<Client> findAll(){
        return clientService.findAll();
    }
}
