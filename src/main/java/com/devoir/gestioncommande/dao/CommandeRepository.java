package com.devoir.gestioncommande.dao;

import com.devoir.gestioncommande.model.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeRepository extends JpaRepository<Commande, Long>{
}
