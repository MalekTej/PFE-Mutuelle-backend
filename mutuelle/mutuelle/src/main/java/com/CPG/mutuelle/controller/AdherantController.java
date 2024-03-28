package com.CPG.mutuelle.controller;
import com.CPG.mutuelle.modele.Adherant;
import com.CPG.mutuelle.modele.Compte;
import com.CPG.mutuelle.service.AdherantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/adherants")
public class AdherantController {

    @Autowired
    private AdherantService adherantService;

    @PostMapping("/register")
    public ResponseEntity<String> registerAdherant(@RequestBody Adherant adherant) {
        adherantService.registerAdherant(adherant);
        return new ResponseEntity<>("Adherant registered successfully", HttpStatus.CREATED);
    }
    @GetMapping(value="/confirm-account/{matricule}")
    public List<Adherant> confirmUserAccount(@PathVariable("matricule") String matricule) {
        return adherantService.confirmAdherant(matricule);
    }
   @GetMapping("/date/{id}")
    public ResponseEntity<Adherant> getAdherantById(@PathVariable Long id) {
        Adherant adherant = adherantService.getAdherantById(id);
        if (adherant != null) {
            Date dateDepart = Date.valueOf(adherant.getDateDepart());
            // Faites ce que vous voulez avec la date de départ ici
            return ResponseEntity.ok(adherant);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    /*
    @GetMapping(value="/read/{dn}/{CIN}/{matricule}")
    public Adherant ReadCompteBynpcm(@PathVariable("dn") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dn , @PathVariable("CIN") String CIN , @PathVariable("matricule") String matricule) {

        return adherantService.Readdcm(Date.valueOf(dn), CIN,matricule);
    }
*/
}
