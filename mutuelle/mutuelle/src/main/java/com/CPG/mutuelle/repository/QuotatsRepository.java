package com.CPG.mutuelle.repository;

import com.CPG.mutuelle.modele.AyantsDroits;
import com.CPG.mutuelle.modele.Quotats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface QuotatsRepository  extends JpaRepository<Quotats, Long> {
    List<Quotats> findByAyantsDroitId(Long ayantsDroitId);
}
