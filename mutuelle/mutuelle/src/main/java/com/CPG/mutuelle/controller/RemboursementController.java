package com.CPG.mutuelle.controller;

import com.CPG.mutuelle.modele.Compte;
import com.CPG.mutuelle.modele.Remboursement;
import com.CPG.mutuelle.service.RemboursementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/remboursement")
public class RemboursementController {
@Autowired
private RemboursementService remboursementService;
    @PostMapping("/save")
    public ResponseEntity<String> registerRembousement(@RequestBody Remboursement remboursement) {
        remboursementService.registerRembourcement(remboursement);
        return new ResponseEntity<>("Remboursement  registered successfully", HttpStatus.CREATED);
    }
    @GetMapping(value="/read/{adherantId}")
    public List<Remboursement> ReadRemboursement(@PathVariable("adherantId") long adherantId) {

        return remboursementService.ReadRemboursement(adherantId) ;
    }
}
