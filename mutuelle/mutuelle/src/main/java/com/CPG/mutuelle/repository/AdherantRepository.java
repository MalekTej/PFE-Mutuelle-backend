package com.CPG.mutuelle.repository;

import com.CPG.mutuelle.modele.Adherant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.sql.Date;

@Repository
public interface AdherantRepository extends JpaRepository<Adherant, Long>{
      List<Adherant> findByMatricule (String matricule);
      Optional<Adherant> findById(Long id);
//Adherant findByMatriculeAndCINAndDN(Date dn, String CIN , String matricule);
}



