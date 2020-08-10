package com.devoir.gestioncommande.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Data
@Table(name = "commande")
public class Commande implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String numCommande;
    private Timestamp dateCommande;
    private Timestamp dateLivraison;
    private int statut;

    @OneToMany(mappedBy = "commande")
    @JsonIgnore
    private List<ProduitCommander> produitCommanders;

    @OneToMany(mappedBy = "commande")
    @JsonIgnore
    private List<Facture> factures;

    @ManyToOne
    @JoinColumn(name = "client", referencedColumnName = "id")
    private Client client;
}
