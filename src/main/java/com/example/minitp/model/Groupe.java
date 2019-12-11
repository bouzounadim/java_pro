package com.example.minitp.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Groupe {
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    
	    @Column(nullable = false)
	    private String username;
	    
	    private Date date;

	    
	    @ManyToOne(fetch = FetchType.LAZY, optional = false)
	    @JoinColumn(name = "teacher_id", nullable = false)
	    private Teacher teacher;
	    
	    
	   
}
