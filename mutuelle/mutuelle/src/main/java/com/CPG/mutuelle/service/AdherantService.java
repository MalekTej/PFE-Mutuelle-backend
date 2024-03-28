package com.CPG.mutuelle.service;

import com.CPG.mutuelle.modele.Adherant;
import com.CPG.mutuelle.modele.Compte;
import com.CPG.mutuelle.repository.AdherantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class AdherantService {

    @Autowired
    private AdherantRepository adherantRepository;

    public void registerAdherant(Adherant adherant) {

        adherantRepository.save(adherant);
    }
    public List<Adherant>  confirmAdherant(String matricule) {
        // Recherche de l'adhérent correspondant au matricule
         return adherantRepository.findByMatricule(matricule);

    }
    public Adherant getAdherantById(Long id) {
        Optional<Adherant> adherantOptional = adherantRepository.findById(id);
        return adherantOptional.orElse(null);
    }
    /*
    public Adherant Readdcm (Date dn, String CIN, String matricule) {
        return adherantRepository.findByMatriculeAndCINAndDN(dn, CIN, matricule);

    }*/
}
