package com.pfa.reservationhoteliere.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Regime implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String description;
	private String libelle;
	@OneToMany(mappedBy = "regime")
	@JsonIgnore
	private List<Reservation> reservations;

	public Regime() {
		super();
	}

	public Regime(String description, String libelle) {
		super();
		
		this.description = description;
		this.libelle = libelle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	@Override
	public String toString() {
		return "Regime [id=" + id + ", description=" + description + ", libelle=" + libelle
				+ ", reservations=" + reservations + "]";
	}

}
