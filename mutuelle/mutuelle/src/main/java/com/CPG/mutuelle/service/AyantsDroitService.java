package com.CPG.mutuelle.service;

import com.CPG.mutuelle.modele.Administrateur;
import com.CPG.mutuelle.modele.AyantsDroits;
import com.CPG.mutuelle.repository.AdminRepository;
import com.CPG.mutuelle.repository.AyantsDroitsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service

public class AyantsDroitService {
    @Autowired
    private AyantsDroitsRepository ayantsDroitsRepository;

    public List<AyantsDroits> ReadAyantDroit(Long adherantId){

        return ayantsDroitsRepository.findByadherantId(adherantId);
    }
    public void registerAyantDroit(AyantsDroits ayantsDroits) {

       ayantsDroitsRepository.save (ayantsDroits);
    }
}
