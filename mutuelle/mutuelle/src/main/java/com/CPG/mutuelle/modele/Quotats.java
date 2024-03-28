package com.CPG.mutuelle.modele;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Quotats {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String type;
    private String plafond;
    private String annee ;
    private  String montantRestant;
    @ManyToOne
    @JoinColumn(name = "ayantsDroitId")
    private AyantsDroits ayantsDroit;
    
}
