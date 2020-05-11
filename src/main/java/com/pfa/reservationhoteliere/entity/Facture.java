package com.pfa.reservationhoteliere.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Facture  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String reference;
	private float total;
	@Temporal(TemporalType.DATE)
	private Date dateFacture;
	@ManyToOne
	private ModePaiement modePaiement;
	@ManyToOne
	private Reservation reservation;
	public Facture() {
		super();
	}
	public Facture(String reference, float total, Date dateFacture, ModePaiement modePaiement,
			Reservation reservation) {
		super();
		this.reference = reference;
		this.total = total;
		this.dateFacture = dateFacture;
		this.modePaiement = modePaiement;
		this.reservation = reservation;
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

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public Date getDateFacture() {
		return dateFacture;
	}

	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}

	public ModePaiement getModePaiement() {
		return modePaiement;
	}

	public void setModePaiement(ModePaiement modePaiement) {
		this.modePaiement = modePaiement;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	@Override
	public String toString() {
		return "Facture [id=" + id + ", reference=" + reference + ", total=" + total + ", dateFacture=" + dateFacture
				+ ", modePaiement=" + modePaiement + ", reservation=" + reservation + "]";
	}

}
