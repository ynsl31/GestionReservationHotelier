package com.pfa.reservationhoteliere.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class LigneResSalle  implements Serializable{
	@EmbeddedId
	private LigneReservSallePK ligneReservSallePK;
	@Temporal(TemporalType.DATE)
	private Date dateArrivee;
	@Temporal(TemporalType.DATE)
	private Date dateSortie;
	@ManyToOne
	@JoinColumn(name="salle", referencedColumnName="id", insertable= false, updatable = false)
	private Salle salle;
	@ManyToOne
	@JoinColumn(name="reservation", referencedColumnName="id", insertable= false, updatable = false)
	private Reservation reservation;

	public LigneResSalle() {
		super();
	}

	public LigneReservSallePK getLigneReservSallePK() {
		return ligneReservSallePK;
	}

	public void setLigneReservSallePK(LigneReservSallePK ligneReservSallePK) {
		this.ligneReservSallePK = ligneReservSallePK;
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

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

}
