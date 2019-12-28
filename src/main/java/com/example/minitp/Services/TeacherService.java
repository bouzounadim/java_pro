package com.example.minitp.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.minitp.model.Teacher;
import com.example.minitp.model.User;
import com.example.minitp.repositry.TeacherRepo;
import com.example.minitp.repositry.UserRepo;

@Service
public class TeacherService {
@Autowired
TeacherRepo techerrepo;


public  List<Teacher> findallteacher()
{
	
 System.out.println( techerrepo.findAll());

 return techerrepo.findAll();

}


public void deleteById(Long id) {
    
	techerrepo.deleteById(id);
}


public Optional<Teacher> findbyId(Long id) {
	return techerrepo.findById(id);
	// TODO Auto-generated method stub
	
}


}
