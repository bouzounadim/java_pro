package com.example.minitp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class TeacherController {
	
	 @RequestMapping("/teacher/getStudent")
	    public String Teacherhome() {
	        return "admin/adminhome";
	    }
	 
	    
	 
	 
	 @RequestMapping("/teacher/getStudent")
	    public String getStudent() {
	        return "admin/adminhome";
	    }

	  
	  @RequestMapping("/getplanning")
	    public String getPlanning(Model model) {
		  	        return "admin/listUser";
	    }
	  
	  @RequestMapping("/getplanning")
	    public String list(Model model) {
		  	        return "admin/listUser";
	    }

}
