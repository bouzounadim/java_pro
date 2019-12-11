package com.example.minitp.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PayementMethode {
	@Id
	@Column(name="paymentmet_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long paymentmet_id;
 	private String paymentname;
	@Override
	public String toString() {
		return "PayementMethode [paymentmet_id=" + paymentmet_id + ", paymentname=" + paymentname + "]";
	}


}
