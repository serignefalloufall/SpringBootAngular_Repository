package com.devoir.gestioncommande.dao;

import com.devoir.gestioncommande.model.Client;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{
}
