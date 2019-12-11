package com.example.minitp.model;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Note {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String matiere;
	private String remarque;
	private Date date;
	
	@JoinColumn(name="etudiant_id",referencedColumnName="etudiant_id",insertable=false,updatable=false)
	@OneToOne(optional=false)
	private Etudiant etudiant ;

}
