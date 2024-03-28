package com.CPG.mutuelle.repository;

import com.CPG.mutuelle.modele.AyantsDroits;
import com.CPG.mutuelle.modele.DossierDeSoins;
import com.CPG.mutuelle.modele.Quotats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DossierDeSoinsRepository extends JpaRepository<DossierDeSoins,Long> {
    List<DossierDeSoins> findByAyantsDroitId(Long ayantsDroitId);
}
