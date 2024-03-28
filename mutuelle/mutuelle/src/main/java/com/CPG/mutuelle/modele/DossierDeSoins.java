package com.CPG.mutuelle.modele;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class DossierDeSoins {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id ;
    private  long NumDossier;
    private String MontantTotal ;
   // @DataTimeForme(pattern="yyyy-mm-jj
   //
   // ")
    private LocalDate DateSoins ;
    private  LocalDate DateDepot ;
    private  String situation ;
    @ManyToOne
    @JoinColumn(name = "ayantsDroitId")
    @JsonBackReference
    private AyantsDroits ayantsDroit;
    @OneToOne(mappedBy = "dossierDeSoins")
    @JsonManagedReference
    private Remboursement remboursement;
}
