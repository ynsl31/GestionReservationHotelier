package com.pfa.reservationhoteliere.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Etage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int num;
	private int nbChambre;
	@OneToMany(mappedBy = "etage")
	private List<Chambre> chambres;

	public Etage() {
		super();
	}

	public Etage(int num, int nbChambre) {
		super();
		this.num = num;
		this.nbChambre = nbChambre;
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

	public int getNbChambre() {
		return nbChambre;
	}

	public void setNbChambre(int nbChambre) {
		this.nbChambre = nbChambre;
	}

	public List<Chambre> getChambres() {
		return chambres;
	}

	public void setChambres(List<Chambre> chambres) {
		this.chambres = chambres;
	}

	@Override
	public String toString() {
		return "Etage [id=" + id + ", num=" + num + ", nbChambre=" + nbChambre + ", chambres=" + chambres + "]";
	}

}
