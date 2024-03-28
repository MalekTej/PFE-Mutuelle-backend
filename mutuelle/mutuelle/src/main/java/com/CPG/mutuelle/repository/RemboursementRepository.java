package com.CPG.mutuelle.repository;

import com.CPG.mutuelle.modele.Remboursement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RemboursementRepository extends JpaRepository<Remboursement, Long> {
    List<Remboursement> findByadherantId(long adherantId);
}
