package com.example.minitp.Controller;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.minitp.Services.UserService;
import com.example.minitp.model.User;
import com.example.minitp.repositry.UserRepo;

@Controller
public class MainController {

	@Autowired
	UserRepo repo;
	
	 @RequestMapping("/")
	    public String home() {
	        return "home/index";
	    }
	
	 @RequestMapping("/login")
	    public String login() {
	        return "home/login";
	    }
	

	 @RequestMapping("/loginattempt")
	    public String loginauth(@RequestParam(value = "email", required = false) String email,@RequestParam(value = "password", required = false) String password,Model model) {
           User user=repo.login(email,password);
            if(user != null) {
            	System.out.println(user);
            model.addAttribute("user",user);
            return "home/index";
            }
            else{
           	 return "redirect:/home/login";
            }
           
 
          
	    }
	
}
