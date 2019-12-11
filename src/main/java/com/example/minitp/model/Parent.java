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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Parent {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int parent_id;
	
	@JoinColumn(name="parent_id",referencedColumnName="user_id",insertable=false,updatable=false)
	@OneToOne(optional=false)
	private User user ;
	
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "parent")
    private List<Etudiant> etudiant;


	@Override
	public String toString() {
		return "Parent [parent_id=" + parent_id + ", user=" + user + ", etudiant=" + etudiant + "]";
	}


	
	
	
	
	

}
