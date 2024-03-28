package com.CPG.mutuelle.controller;

import com.CPG.mutuelle.modele.DossierDeSoins;
import com.CPG.mutuelle.modele.Quotats;
import com.CPG.mutuelle.service.DossierDeSoinsService;
import com.CPG.mutuelle.service.QuotatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/DossierDeSoins")
public class DossierDeSoinsController {
    @Autowired
    private DossierDeSoinsService dossierDeSoinsService;
    @GetMapping(value="/get/{ayantDroitId}")
    public List<DossierDeSoins> getDossierDeSoins(@PathVariable("ayantDroitId") long ayantDroitId) {

        return dossierDeSoinsService.ReadDossierDeSoins(ayantDroitId);

    }
}
