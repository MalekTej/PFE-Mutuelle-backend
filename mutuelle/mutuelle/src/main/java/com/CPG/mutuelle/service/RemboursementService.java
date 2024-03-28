package com.CPG.mutuelle.service;

import com.CPG.mutuelle.modele.Remboursement;
import com.CPG.mutuelle.repository.RemboursementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RemboursementService {
    @Autowired
    private RemboursementRepository remboursementRepository;
    public void registerRembourcement(Remboursement remboursement) {
        remboursementRepository.save(remboursement);
    }
    public List<Remboursement> ReadRemboursement (long adherantId) {
        // Recherche de l'adhérent correspondant au matricule
        return remboursementRepository.findByadherantId(adherantId);

    }
}
