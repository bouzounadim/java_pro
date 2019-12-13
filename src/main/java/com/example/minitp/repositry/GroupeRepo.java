package com.example.minitp.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.minitp.model.Groupe;

@Repository
public interface GroupeRepo  extends JpaRepository<Groupe, Long> {

}
