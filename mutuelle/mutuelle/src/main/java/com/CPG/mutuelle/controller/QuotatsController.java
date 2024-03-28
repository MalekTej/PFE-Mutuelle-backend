package com.CPG.mutuelle.controller;

import com.CPG.mutuelle.modele.AyantsDroits;
import com.CPG.mutuelle.modele.Quotats;
import com.CPG.mutuelle.service.QuotatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/Quotats")
public class QuotatsController {
    @Autowired
    private QuotatsService quotatsService;
    @GetMapping(value="/get/{ayantDroitId}")
    public List<Quotats> getQuotats(@PathVariable("ayantDroitId") long ayantDroitId) {

        return  quotatsService.ReadQuotats(ayantDroitId);

    }
    @PostMapping("/post")
    public ResponseEntity<String> registerQuotats(@RequestBody Quotats quotats) {

      quotatsService.registerQuotats(quotats);
        return new ResponseEntity<>("Quotats registered successfully", HttpStatus.CREATED);
    }
}
