package com.devoir.gestioncommande.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name = "facture")
public class Facture implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String numero;
    private Integer montantApayer;
    private Integer montantRestant;
    private int statut;

    @ManyToOne
    @JoinColumn(name = "commande", referencedColumnName = "id")
    private Commande commande;

    @OneToMany(mappedBy = "facture")
    @JsonIgnore
    private List<Paiement> paiements;
}
