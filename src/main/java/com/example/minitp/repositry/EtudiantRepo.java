package com.example.minitp.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.minitp.model.Etudiant;
@Repository
public interface EtudiantRepo  extends JpaRepository<Etudiant, Long>{

}
