package com.devoir.gestioncommande.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "paiement")
public class Paiement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Timestamp datePaiement;
    private Integer montant;

    @ManyToOne
    @JoinColumn(name = "facture", referencedColumnName = "id")
    private Facture facture;
}
