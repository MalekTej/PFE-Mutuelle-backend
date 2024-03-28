package com.CPG.mutuelle.modele;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Adherant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String prenom;
    private String matricule;
    private String mail;
    private String tel;
    private String type;
    private String etatCivil;
    private String sexe;
   // @Column(name = "DN")//
   // @Temporal(TemporalType.DATE)
    private String DN;
    private String CIN;
    private double salaireCNSS;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate DateDepart;
    private  double assiette ;

    @OneToOne(mappedBy = "adherant")
    @JsonBackReference
    private Compte compte;
    @OneToMany( mappedBy = "adherant")
    @JsonManagedReference
    private List<AyantsDroits> ayantsDroits;
    @OneToMany( mappedBy = "adherant")
    @JsonManagedReference
    private List<Remboursement> remboursements;
    @OneToMany( mappedBy = "adherant")
    @JsonManagedReference
    private List<Cotisation> cotisations;

}
