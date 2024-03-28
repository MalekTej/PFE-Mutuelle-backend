package com.CPG.mutuelle.modele;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class AyantsDroits {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id ;
    private String nom ;
    private  String prenom ;
    private  String type;
    private String situation ;
    private String  DN;
    @ManyToOne
    @JoinColumn(name = "adherantId")
    @JsonBackReference
    private Adherant adherant;
    @OneToMany(mappedBy = "ayantsDroit")
    @JsonIgnore
    private List<Quotats> quotats;
    @OneToMany(mappedBy = "ayantsDroit")
    @JsonManagedReference
    private List<DossierDeSoins> dossierDeSoins;
}
