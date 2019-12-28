package com.example.minitp.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	  
	  @GetMapping("admin/{id}/delete")
	    public String deleteById(@PathVariable String id){


	        teachservice.deleteById(Long.valueOf(id));
	        return "redirect:/admin/listteacher";
	    }
	  
	  @GetMapping("admin/{id}/show")
	    public String findById(@PathVariable String id , Model model){
	        model.addAttribute("teach", teachservice.findbyId(Long.valueOf(id)));
	        return "admin/showteacher";	      
	    }
	  
	  
	  @GetMapping("admin/groupe/create")
	    public String creategroupe( Model model){
	    
	        return "admin/showteacher";	      
	    }
	  
	  
	  @GetMapping("admin/groupe/getall")
	    public String  listofgroupe( Model model){
	    
	        return "admin/showteacher";	      
	    }
	  
	  
	  @GetMapping("admin/groupe/getall")
	    public String deletefgroupe( Model model){
	    
	        return "admin/showteacher";	      
	    }
	  
	  @GetMapping("admin/assign")
	    public String affecterprofauxgroup( Model model){
	    
	        return "admin/showteacher";	      
	    }
	  @GetMapping("admin/payment")
	    public String gestionpayment( Model model){
	    
	        return "admin/showteacher";	      
	    }
	  
	  
}
