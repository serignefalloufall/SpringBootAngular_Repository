package com.devoir.gestioncommande.service;

import com.devoir.gestioncommande.dao.CategorieRepository;
import com.devoir.gestioncommande.dao.CommandeRepository;
import com.devoir.gestioncommande.model.Commande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeServiceImpl implements ICommandeService{

    @Autowired
    private CommandeRepository commandeRepository;

    @Override
    public Commande save(Commande commande) {
        return commandeRepository.save(commande);
    }

    @Override
    public List<Commande> findAll() {
        return commandeRepository.findAll();
    }
}
