package com.pfa.reservationhoteliere.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Salle implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String reference;
	private boolean etat;
	@ManyToOne
	private Tarif tarif;
	@OneToMany(mappedBy = "salle")
	private List<LigneResSalle> ligneResSalles;

	public Salle() {
		super();
	}

	public Salle(String reference, boolean etat, Tarif tarif) {
		super();
		this.reference = reference;
		this.etat = etat;
		this.tarif = tarif;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public boolean isEtat() {
		return etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}

	public Tarif getTarif() {
		return tarif;
	}

	public void setTarif(Tarif tarif) {
		this.tarif = tarif;
	}

	public List<LigneResSalle> getLigneResSalles() {
		return ligneResSalles;
	}

	public void setLigneResSalles(List<LigneResSalle> ligneResSalles) {
		this.ligneResSalles = ligneResSalles;
	}

	@Override
	public String toString() {
		return "Salle [id=" + id + ", reference=" + reference + ", etat=" + etat + ", tarif=" + tarif + "]";
	}

}
