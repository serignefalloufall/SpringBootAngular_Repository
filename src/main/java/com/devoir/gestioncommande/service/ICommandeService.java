package com.devoir.gestioncommande.service;

import com.devoir.gestioncommande.model.Client;
import com.devoir.gestioncommande.model.Commande;

import java.util.List;

public interface ICommandeService {
    public Commande save(Commande commande);
    public List<Commande> findAll();
}

