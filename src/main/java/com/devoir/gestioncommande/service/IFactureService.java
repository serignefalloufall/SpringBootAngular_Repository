package com.devoir.gestioncommande.service;

import com.devoir.gestioncommande.model.Commande;
import com.devoir.gestioncommande.model.Facture;

import java.util.List;

public interface IFactureService {
    public Facture save(Facture facture);
    public List<Facture> findAll();
}
