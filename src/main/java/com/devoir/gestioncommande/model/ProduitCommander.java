package com.devoir.gestioncommande.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "produitCommander")
public class ProduitCommander implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer prixVenteUnitaire;
    private Integer prixTotal;
    private Integer quantite;

    @ManyToOne
    @JoinColumn(name = "produit", referencedColumnName = "id")
    private Produit produit;

    @ManyToOne
    @JoinColumn(name = "commande", referencedColumnName = "id")
    private Commande commande;
}
