package com.example.minitp.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int teacher_id;
	
	@JoinColumn(name="teacher_id",referencedColumnName="user_id",insertable=false,updatable=false)
	@OneToOne(optional=false)
	private User user ;
	
	private String specialite;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "teacher")
    private List<Groupe> groupe;

	@Override
	public String toString() {
		return "Teacher [teacher_id=" + teacher_id + ", user=" + user + ", specialite=" + specialite + ", groupe="
				+ groupe + "]";
	}
	

	
	
	
	
}
