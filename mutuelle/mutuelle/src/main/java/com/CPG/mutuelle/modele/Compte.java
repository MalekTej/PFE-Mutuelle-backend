package com.CPG.mutuelle.modele;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String login;
    private String password;
    private String DN;
    private String CIN;
    private String tel;

    @OneToOne()
    @JoinColumn(name="adherant_id",referencedColumnName = "id")
    @JsonManagedReference

    private Adherant adherant;
}
