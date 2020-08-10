package com.devoir.gestioncommande.dao;

import com.devoir.gestioncommande.model.Facture;
import com.devoir.gestioncommande.model.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaiementRepository extends JpaRepository<Paiement, Long>{
}
