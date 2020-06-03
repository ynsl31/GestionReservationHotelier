package com.pfa.reservationhoteliere.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Etage implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	public Etage(int id, int num) {
		this.id = id;
		this.num = num;
	}


	private int num;
	@OneToMany(mappedBy = "etage", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Chambre> chambres;

	public Etage() {
		super();
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}



	public List<Chambre> getChambres() {
		return chambres;
	}

	public void setChambres(List<Chambre> chambres) {
		this.chambres = chambres;
	}


	@Override
	public String toString() {
		return "Etage [id=" + id + ", num=" + num + ", chambres=" + chambres + "]";
	}

	

}
