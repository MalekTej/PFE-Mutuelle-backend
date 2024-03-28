package com.CPG.mutuelle.repository;


import com.CPG.mutuelle.modele.AyantsDroits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AyantsDroitsRepository  extends JpaRepository<AyantsDroits,Long> {
  List<AyantsDroits> findByadherantId(Long adherantId);
}
