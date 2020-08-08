package com.devoir.gestioncommande.service;

import com.devoir.gestioncommande.dao.FactureRepository;
import com.devoir.gestioncommande.model.Facture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FactureServiceImpl implements IFactureService{

    @Autowired
    private FactureRepository factureRepository;

    @Override
    public Facture save(Facture facture) {
        return factureRepository.save(facture);
    }

    @Override
    public List<Facture> findAll() {
        return factureRepository.findAll();
    }
}
