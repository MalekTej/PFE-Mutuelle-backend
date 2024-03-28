package com.CPG.mutuelle.repository;

import com.CPG.mutuelle.modele.Cotisation;
import com.CPG.mutuelle.modele.DossierDeSoins;
import com.CPG.mutuelle.modele.Remboursement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CotisationRepository extends JpaRepository<Cotisation,Long> {
    List<Cotisation> findByadherantId(long adherantId);
}
