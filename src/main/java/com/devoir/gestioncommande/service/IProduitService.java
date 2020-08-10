package com.devoir.gestioncommande.service;

import com.devoir.gestioncommande.model.Facture;
import com.devoir.gestioncommande.model.Produit;

import java.util.List;

public interface IProduitService {
    public Produit save(Produit produit);
    public List<Produit> findAll();
}
