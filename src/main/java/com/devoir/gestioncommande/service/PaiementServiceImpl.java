package com.devoir.gestioncommande.service;

import com.devoir.gestioncommande.dao.FactureRepository;
import com.devoir.gestioncommande.dao.PaiementRepository;
import com.devoir.gestioncommande.model.Paiement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaiementServiceImpl implements IPaiementService{

    @Autowired
    private PaiementRepository paiementRepository;

    @Override
    public Paiement save(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public List<Paiement> findAll() {
        return paiementRepository.findAll();
    }
}
