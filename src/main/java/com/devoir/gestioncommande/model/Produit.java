package com.devoir.gestioncommande.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name = "produit")
public class Produit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String code;
    private String libelle;
    private Integer quantiteStock;
    private String description;
    private Integer prixNormal;
    private Integer prixMinimal;

    @ManyToOne
    @JoinColumn(name = "categorie", referencedColumnName = "id")
    private Categorie categorie;

    @OneToMany(mappedBy = "produit")
    @JsonIgnore
    private List<ProduitCommander> produitCommanders;
}
