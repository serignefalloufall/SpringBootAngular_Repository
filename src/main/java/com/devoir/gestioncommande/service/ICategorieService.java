package com.devoir.gestioncommande.service;

import com.devoir.gestioncommande.model.Categorie;
import com.devoir.gestioncommande.model.Client;

import java.util.List;

public interface ICategorieService {
    public Categorie save(Categorie categorie);
    public List<Categorie> findAll();
}
