package com.devoir.gestioncommande.service;

import com.devoir.gestioncommande.model.Client;
import com.devoir.gestioncommande.model.ProduitCommander;

import java.util.List;

public interface IProduitCommanderService {
    public ProduitCommander save(ProduitCommander produitCommander);
    public List<ProduitCommander> findAll();
}
