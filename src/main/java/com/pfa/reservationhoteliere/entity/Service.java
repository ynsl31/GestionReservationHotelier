package com.pfa.reservationhoteliere.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Service implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String reference;
	private String description;
	private String libelle;
	@ManyToOne
	private Reservation reservation;
	@ManyToOne
	private Tarif tarif;

	public Service() {
		super();
	}

	public Service(String reference, String description, String libelle, Reservation reservation, Tarif tarif) {
		super();
		this.reference = reference;
		this.description = description;
		this.libelle = libelle;
		this.reservation = reservation;
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

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public Tarif getTarif() {
		return tarif;
	}

	public void setTarif(Tarif tarif) {
		this.tarif = tarif;
	}

	@Override
	public String toString() {
		return "Service [id=" + id + ", reference=" + reference + ", description=" + description + ", libelle="
				+ libelle + ", reservation=" + reservation + ", tarif=" + tarif + "]";
	}

}
