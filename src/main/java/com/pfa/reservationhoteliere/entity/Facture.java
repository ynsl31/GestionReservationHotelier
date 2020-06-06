package com.pfa.reservationhoteliere.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Facture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String reference;
	@Temporal(TemporalType.DATE)
	private Date dateFacture;
	@ManyToOne
	@JsonIgnoreProperties({ "factures" })
	private ModePaiement modePaiement;
	@OneToMany(mappedBy = "facture")
	@JsonIgnoreProperties({ "ligneResChambres" })
	private List<Reservation> reservations;
	
	
 
	public Facture() {
		super();
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

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	@Override
	public String toString() {
		return "Facture [id=" + id + ", reference=" + reference + ", dateFacture=" + dateFacture + ", modePaiement="
				+ modePaiement + ", reservations=" + reservations + "]";
	}

}
