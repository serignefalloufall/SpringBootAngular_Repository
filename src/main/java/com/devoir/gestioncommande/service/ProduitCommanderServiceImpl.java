package com.devoir.gestioncommande.service;

import com.devoir.gestioncommande.dao.CommandeRepository;
import com.devoir.gestioncommande.dao.ProduitCommanderRepository;
import com.devoir.gestioncommande.model.ProduitCommander;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitCommanderServiceImpl implements IProduitCommanderService{
    @Autowired
    private ProduitCommanderRepository produitCommanderRepository;

    @Override
    public ProduitCommander save(ProduitCommander produitCommander) {
        return produitCommanderRepository.save(produitCommander);
    }

    @Override
    public List<ProduitCommander> findAll() {
        return produitCommanderRepository.findAll();
    }
}
