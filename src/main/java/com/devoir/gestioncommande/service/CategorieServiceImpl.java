package com.devoir.gestioncommande.service;

import com.devoir.gestioncommande.dao.CategorieRepository;
import com.devoir.gestioncommande.model.Categorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieServiceImpl implements ICategorieService{
    @Autowired
    private CategorieRepository categorieRepository;
    @Override
    public Categorie save(Categorie categorie) {
        return categorieRepository.save(categorie);
    }

    @Override
    public List<Categorie> findAll() {
        return categorieRepository.findAll();
    }
}
