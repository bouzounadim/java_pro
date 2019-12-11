package com.example.minitp.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class Etudiant {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int etudiant_id;
	
	@JoinColumn(name="etudiant_id",referencedColumnName="user_id",insertable=false,updatable=false)
	@OneToOne(optional=false)
	private User user ;
	
	
	@JoinColumn(name="group_id",referencedColumnName="id",insertable=false,updatable=false)
	@OneToOne(optional=false)
	private Groupe group ;


	@Override
	public String toString() {
		return "Etudiant [etudiant_id=" + etudiant_id + ", user=" + user + ", group=" + group + "]";
	}
	
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "etudiant")
    private List<Note> note;
    
	
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "parent_id", nullable = false)
    private Parent parent;
	
}
