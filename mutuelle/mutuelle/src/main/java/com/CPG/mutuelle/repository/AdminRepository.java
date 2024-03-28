package com.CPG.mutuelle.repository;


import com.CPG.mutuelle.modele.Administrateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface AdminRepository extends JpaRepository<Administrateur,Long> {
    List<Administrateur> findByMatricule (String matricule);

}
