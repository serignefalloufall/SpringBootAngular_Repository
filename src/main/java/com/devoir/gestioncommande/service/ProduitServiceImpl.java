package com.devoir.gestioncommande.service;

import com.devoir.gestioncommande.dao.ProduitCommanderRepository;
import com.devoir.gestioncommande.dao.ProduitRepository;
import com.devoir.gestioncommande.model.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitServiceImpl implements IProduitService{
    @Autowired
    private ProduitRepository produitRepository;

    @Override
    public Produit save(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public List<Produit> findAll() {
        return produitRepository.findAll();
    }
}
