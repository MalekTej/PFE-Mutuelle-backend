package com.CPG.mutuelle.controller;

import com.CPG.mutuelle.modele.Administrateur;
import com.CPG.mutuelle.modele.AyantsDroits;
import com.CPG.mutuelle.service.AyantsDroitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class AyantsDroitsController {
    @Autowired
    private AyantsDroitService ayantsDroitService;
    @GetMapping(value="/get/{adherantId}")
    public List<AyantsDroits> getAyantDroit(@PathVariable("adherantId") long adherantId) {
        return  ayantsDroitService.ReadAyantDroit(adherantId);

    }
    @PostMapping("/save")
    public ResponseEntity<String> registerAyantDroit(@RequestBody AyantsDroits ayantsDroits) {

        ayantsDroitService.registerAyantDroit(ayantsDroits);
        return new ResponseEntity<>("AyantDroit registered successfully", HttpStatus.CREATED);
    }
}
