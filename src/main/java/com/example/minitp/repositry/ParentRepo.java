package com.example.minitp.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.minitp.model.Parent;
@Repository
public interface ParentRepo extends JpaRepository<Parent, Long> {

}
