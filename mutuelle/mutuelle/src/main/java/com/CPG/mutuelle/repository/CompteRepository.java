package com.CPG.mutuelle.repository;
import com.CPG.mutuelle.modele.Adherant;
import com.CPG.mutuelle.modele.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompteRepository extends JpaRepository <Compte, Long> {
    List<Compte> findById (long id);
    Compte findByLoginAndPassword(String login,String pwd);
        List<Compte> findByadherantId(long adherant_id) ;
}
