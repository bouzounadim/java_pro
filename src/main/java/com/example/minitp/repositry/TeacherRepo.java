package com.example.minitp.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.minitp.model.Teacher;
@Repository
public interface TeacherRepo extends JpaRepository<Teacher, Long> {

}
