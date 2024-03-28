package com.CPG.mutuelle.controller;

import com.CPG.mutuelle.modele.Cotisation;
import com.CPG.mutuelle.service.CotisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/cotisation")
public class CotisationController {
    @Autowired
    private CotisationService cotisationService;
    @PostMapping("/save")
    public ResponseEntity<String> registerCotisation(@RequestBody Cotisation cotisation) {
       cotisationService.registerCotisation(cotisation);
        return new ResponseEntity<>("Cotisation registered successfully", HttpStatus.CREATED);
    }
    @GetMapping(value="/read/{adherantId}")
    public List<Cotisation> readCotisation(@PathVariable("adherantId") long adherantId) {
        return cotisationService.ReadCotisation(adherantId);
    }
}
