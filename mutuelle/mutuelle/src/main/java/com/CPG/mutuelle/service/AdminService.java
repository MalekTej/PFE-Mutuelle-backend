package com.CPG.mutuelle.service;

import com.CPG.mutuelle.modele.Administrateur;
import com.CPG.mutuelle.modele.Compte;
import com.CPG.mutuelle.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

    public void registerAdmin(Administrateur administrateur) {

        adminRepository.save(administrateur);
    }
    public List<Administrateur> ReadAdmin(String matricule){

        return   adminRepository.findByMatricule(matricule);
    }
    public void supprimer(Long id) {
        // Implémentez la logique pour supprimer un compte
       adminRepository.deleteById(id);
    }
    public void updateAdmin(Administrateur updatedAdmin) {

        adminRepository.save(updatedAdmin);
    }
    public List<Administrateur> getAll() {
        return adminRepository.findAll();
    }
}
