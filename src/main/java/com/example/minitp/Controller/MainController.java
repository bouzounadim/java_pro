package com.example.minitp.Controller;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.minitp.Services.UserService;
import com.example.minitp.model.User;
import com.example.minitp.repositry.UserRepo;

@RestController
public class MainController {
	@Autowired
    private UserService  userservice;
	@Autowired
    private UserRepo repository;
	
	
	@GetMapping("/getusers")
    public List<User> getusers() 
	{
      return userservice.findalluser();
	}
	
	@GetMapping("/user/{id}")
	public Optional<User> retrieveStudent(@PathVariable long id)  {
		 Optional<User> user = userservice.findid(id);

		return user;
	}
	 @PostMapping("/user")
	    public User createEmployee(@Valid @RequestBody User user) {
	        return userservice.newuser(user);
	    }
	 
	 
	 @DeleteMapping("/user/delete/{id}")
	    public void createEmployee(@PathVariable long id) {
	        userservice.deletebyid(id);
	    }
	 
	 
	 @PutMapping("/user/update/{id}")
	 public void updateuser(@RequestBody User newuser, @PathVariable Long id) {
		 userservice.update(newuser,id);
		 }
	 
	 
}
