package com.CPG.mutuelle.service;

import com.CPG.mutuelle.modele.AyantsDroits;
import com.CPG.mutuelle.modele.DossierDeSoins;
import com.CPG.mutuelle.repository.AyantsDroitsRepository;
import com.CPG.mutuelle.repository.DossierDeSoinsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DossierDeSoinsService {
    @Autowired
    private DossierDeSoinsRepository dossierDeSoinsRepository;

    public List<DossierDeSoins> ReadDossierDeSoins(Long ayantDroitId){

        return dossierDeSoinsRepository.findByAyantsDroitId(ayantDroitId);
    }
}
