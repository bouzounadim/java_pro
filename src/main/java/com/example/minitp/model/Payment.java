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
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Payment {
	@Id
	@Column(name="payment_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long payment_id;
	private double amount;
	private Date date ;
	
	@JoinColumn(name="etudiant_id",referencedColumnName="etudiant_id",insertable=false,updatable=false)
	@OneToOne(optional=false)
	private Etudiant etudiant ;
	
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = " paymentmet_id", nullable = false)
    private PayementMethode payementMethode;

}
