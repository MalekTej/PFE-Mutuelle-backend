package com.CPG.mutuelle.modele;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@Entity
public class Cotisation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id ;
    private double Montant;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate DateDebut;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate DateFin;
    private long periode;
    private String TypeCotisation;
    private String ReferencePaiement ;
    @ManyToOne
    @JoinColumn(name = "adherantId")
    @JsonBackReference
    private Adherant adherant;
}
