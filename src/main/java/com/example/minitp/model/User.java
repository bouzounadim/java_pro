package com.example.minitp.model;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
	@Id
	@Column(name="user_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
    private String username;
    private String email;
    private String password;
    private int phone;
    private String adresse;
 	private String state;

 	@Transient
    private String passwordConfirm;

    @ManyToMany
    private Set<Role> roles;

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password + ", phone="
				+ phone + ", adresse=" + adresse + ", state=" + state + ", passwordConfirm=" + passwordConfirm
				+ ", roles=" + roles + "]";
	}



 	
	
	
    
}
