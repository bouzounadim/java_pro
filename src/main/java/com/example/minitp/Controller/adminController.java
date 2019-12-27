package com.example.minitp.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.minitp.Services.TeacherService;
import com.example.minitp.Services.UserService;
import com.example.minitp.model.User;

@Controller
public class adminController {
	@Autowired
    private UserService  userservice;
	@Autowired
    private TeacherService  teachservice;
	  @RequestMapping("/admin")
	    public String home() {
	        return "admin/adminhome";
	    }

	  
	  @RequestMapping("/admin/listuser")
	    public String listuser(Model model) {
		  
	        model.addAttribute("users",userservice.findalluser());
	        return "admin/listUser";
	    }
	  
	  @RequestMapping("/admin/listteacher")
	    public String listtecher(Model model) {
	
		  model.addAttribute("tech",teachservice.findallteacher());
		  
		  return "admin/Teacher";
	    }
}
