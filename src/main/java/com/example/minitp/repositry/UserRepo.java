package com.example.minitp.repositry;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.minitp.model.User;
@Repository
public  interface UserRepo  extends JpaRepository<User, Long>{
	
    User findByUsername(String username);

    @Query("from User where email=?1 and password=?2")
	 User login(String string, String string2);
       
    

    
 
 
	
    
}
