package com.example.minitp.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.example.minitp.model.User;
import com.example.minitp.repositry.UserRepo;

@Service
public class UserService  {
	@Autowired
	UserRepo userrepo;
	
	public List<User>findalluser()
	{
	return userrepo.findAll();
	}

	
	

	public User newuser(User user) 
	{
		
	    return userrepo.save(user);
	}


	public Optional<User> findid(long id) {
    
		return userrepo.findById(id);
	}
	
	public void deletebyid(long id) {
	    
		userrepo.deleteById(id);;
	}


	public void update(User newuser, Long id) {
		 Optional<User> user = userrepo.findById(id);
		 user.get().setEmail(newuser.getEmail());
		 user.get().setUsername(newuser.getUsername());
		 user.get().setAdresse(newuser.getAdresse());
		 user.get().setPassword(newuser.getPassword());
		 user.get().setPhone(newuser.getPhone());
		 userrepo.save(user.get());
	}
	
	
	

}
