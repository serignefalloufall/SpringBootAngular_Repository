package com.devoir.gestioncommande.service;

import com.devoir.gestioncommande.model.Paiement;
import com.devoir.gestioncommande.model.Produit;

import java.util.List;

public interface IPaiementService {
    public Paiement save(Paiement paiement);
    public List<Paiement> findAll();
}
