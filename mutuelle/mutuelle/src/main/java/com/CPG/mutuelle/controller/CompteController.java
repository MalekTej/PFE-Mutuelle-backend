package com.CPG.mutuelle.controller;
import java.util.Map;

import com.CPG.mutuelle.modele.Adherant;
import com.CPG.mutuelle.modele.Administrateur;
import com.CPG.mutuelle.modele.Compte;
import com.CPG.mutuelle.service.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/compte")
public class CompteController {
    @Autowired
    private CompteService compteService;

    @PostMapping("/save" )
    public ResponseEntity<String> registerCompte(@RequestBody Compte compte) {
        compteService.registerCompte(compte);
        return new ResponseEntity<>("compte registered successfully", HttpStatus.CREATED);
    }
    @DeleteMapping("/remove/{id}")
    public ResponseEntity<String> supprimerCompte(@PathVariable Long id) {
        compteService.supprimer(id);
        return ResponseEntity.ok("Compte supprimé avec succès!");
    }
    @PutMapping("/update")
    public void updateCompte(@RequestBody Compte updatedCompte  ) {
        compteService.updateCompte(updatedCompte);
    }
    @GetMapping(value="/read/{id}")
    public List<Compte>  ReadCompte(@PathVariable("id") long id) {

        return compteService.ReadCompte(id);
    }

    @GetMapping(value="/read/{login}/{pwd}")
    public Compte  ReadCompteByLogPwd(@PathVariable("login") String login,@PathVariable("pwd") String pwd) {

        return compteService.ReadCompteByLoginAndPwd(login,pwd);
    }

    @GetMapping(value="/adherant/{adherant_id}")
    public List<Compte>  getadherant(@PathVariable("adherant_id") long adherant_id) {
        return compteService.getadherant(adherant_id);
    }
    @GetMapping("/readAll")
    public  List<Compte>ReadAll() {

        return compteService.getAll();
    }
}
