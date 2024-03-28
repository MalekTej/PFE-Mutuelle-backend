package com.CPG.mutuelle.controller;


import com.CPG.mutuelle.modele.Adherant;
import com.CPG.mutuelle.modele.Administrateur;
import com.CPG.mutuelle.modele.Compte;
import com.CPG.mutuelle.service.AdherantService;
import com.CPG.mutuelle.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping("/save")
    public ResponseEntity<String> registerAdmin(@RequestBody Administrateur administrateur) {

        adminService.registerAdmin(administrateur);
        return new ResponseEntity<>("Admin registered successfully", HttpStatus.CREATED);
    }
    @GetMapping("/read/{matricule}")
    public List<Administrateur> ReadAdmin(@PathVariable("matricule") String matricule) {

        return adminService.ReadAdmin(matricule);
    }
    @DeleteMapping("/remove/{id}")
    public ResponseEntity<String> supprimerAdmin(@PathVariable Long id) {
     adminService.supprimer(id);
        return ResponseEntity.ok("Admin supprimé avec succès!");
    }
    @PutMapping("/update")
    public void updateCompte(@RequestBody Administrateur updatedAdmin  ) {
       adminService.updateAdmin(updatedAdmin);
    }
    @GetMapping("/readAll")
    public  List<Administrateur >ReadAll() {
        return adminService.getAll();
    }
}
