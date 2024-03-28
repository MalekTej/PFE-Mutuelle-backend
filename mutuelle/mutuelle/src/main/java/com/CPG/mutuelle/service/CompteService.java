package com.CPG.mutuelle.service;

import com.CPG.mutuelle.modele.Adherant;
import com.CPG.mutuelle.modele.Administrateur;
import com.CPG.mutuelle.modele.Compte;
import com.CPG.mutuelle.repository.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompteService {
    @Autowired
    private CompteRepository compteRepository;

    public void registerCompte(Compte compte) {
        compteRepository.save(compte);
    }

    public void supprimer(Long id) {
        // Implémentez la logique pour supprimer un compte
        compteRepository.deleteById(id);
    }
    public void updateCompte(Compte updatedCompte) {
        compteRepository.save(updatedCompte);
    }
    public List<Compte> ReadCompte (long id) {
        // Recherche de l'adhérent correspondant au matricule
        return compteRepository.findById(id);

    }

    public Compte ReadCompteByLoginAndPwd (String login,String pwd) {
        return compteRepository.findByLoginAndPassword(login,pwd);

    }
    public List<Compte>getadherant (long adherant_id) {

        return compteRepository.findByadherantId(adherant_id);

    }
    public List<Compte> getAll() {
        return compteRepository.findAll();
    }

}
