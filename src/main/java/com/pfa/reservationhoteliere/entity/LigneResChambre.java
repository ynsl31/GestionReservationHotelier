package com.pfa.reservationhoteliere.entity;

import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class LigneResChambre {
	@EmbeddedId
	private LigneReservChambrePK ligneReservChambrePK;
	@Temporal(TemporalType.DATE)
	private Date dateArrivee;
	@Temporal(TemporalType.DATE)
	private Date dateSortie;
	@ManyToOne
	@JoinColumn(name="chambre", referencedColumnName="id", insertable= false, updatable = false)
	@JsonIgnoreProperties({"ligneReschambres"})
	private Chambre chambre;
	@ManyToOne
	@JoinColumn(name="reservation", referencedColumnName="id", insertable= false, updatable = false)
	@JsonIgnoreProperties({"ligneReschambres"} )
	private Reservation reservation;

	public LigneResChambre() {
		super();
	}

	public LigneReservChambrePK getLigneReservChambrePK() {
		return ligneReservChambrePK;
	}

	public void setLigneReservChambrePK(LigneReservChambrePK ligneReservChambrePK) {
		this.ligneReservChambrePK = ligneReservChambrePK;
	}

	public Date getDateArrivee() {
		return dateArrivee;
	}

	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
	}

	public Date getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}

	public Chambre getChambre() {
		return chambre;
	}

	public void setChambre(Chambre chambre) {
		this.chambre = chambre;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

}
