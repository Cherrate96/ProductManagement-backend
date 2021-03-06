/**
 * 
 */
package com.home.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ADAM
 *
 *
 */
@Entity

 public class Produit implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String designation;
	private double price;
	private int quantite;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public Produit(String designation, double price, int quantite) {
		super();
		this.designation = designation;
		this.price = price;
		this.quantite = quantite;
	}
	public Produit(Long id, String designation, double price, int quantite) {
		super();
		this.id = id;
		this.designation = designation;
		this.price = price;
		this.quantite = quantite;
	}
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
