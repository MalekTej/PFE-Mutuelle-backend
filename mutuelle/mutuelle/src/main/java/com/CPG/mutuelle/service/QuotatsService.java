package com.CPG.mutuelle.service;

import com.CPG.mutuelle.modele.AyantsDroits;
import com.CPG.mutuelle.modele.Quotats;
import com.CPG.mutuelle.repository.AyantsDroitsRepository;
import com.CPG.mutuelle.repository.QuotatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class QuotatsService {
    @Autowired
    private QuotatsRepository quotatsRepository;

    public List<Quotats> ReadQuotats(Long ayantDroitId){

        return quotatsRepository.findByAyantsDroitId(ayantDroitId);
    }
    public void registerQuotats(Quotats quotats) {

        quotatsRepository.save(quotats);
    }
}
