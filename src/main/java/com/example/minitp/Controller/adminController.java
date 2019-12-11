package com.example.minitp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.minitp.Services.UserService;

@Controller
public class adminController {
	@Autowired
    private UserService  userservice;
	
	  @RequestMapping("/admin")
	    public String home() {
	        return "admin/adminhome";
	    }

	  
	  @RequestMapping("/admin/listuser")
	    public String listuser(Model model) {
		  
	        model.addAttribute("users",userservice.findalluser());
	        return "admin/listUser";
	    }
}
