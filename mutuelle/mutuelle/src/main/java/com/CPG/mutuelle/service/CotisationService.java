package com.CPG.mutuelle.service;

import com.CPG.mutuelle.modele.Cotisation;
import com.CPG.mutuelle.repository.CotisationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CotisationService {
    @Autowired
    private CotisationRepository cotisationRepository;
    public void registerCotisation(Cotisation cotisation) {

        cotisationRepository.save(cotisation);
    }
    public List<Cotisation> ReadCotisation(long adherantId) {
        return cotisationRepository.findByadherantId(adherantId);
    }

}
