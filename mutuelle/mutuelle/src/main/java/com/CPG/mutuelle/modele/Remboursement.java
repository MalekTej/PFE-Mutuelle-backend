package com.CPG.mutuelle.modele;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Remboursement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private double montantRembourse;
    private int mois;
    private int annee;
    private String typeRemboursement;
    @ManyToOne
    @JoinColumn(name = "adherantId")
    @JsonBackReference
    private Adherant adherant;
    @OneToOne
    @JsonBackReference
    private DossierDeSoins dossierDeSoins;
}
