package com.pfa.reservationhoteliere.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class LigneReservChambrePK implements Serializable{
	@Column(name = "chambre")
	private int chambre;
	@Column(name = "reservation")
	private int reservation;

	public LigneReservChambrePK() {
		super();
	}

	public LigneReservChambrePK(int chambre, int reservation) {
		super();
		this.chambre = chambre;
		this.reservation = reservation;
	}

	public int getChambre() {
		return chambre;
	}

	public void setChambre(int chambre) {
		this.chambre = chambre;
	}

	public int getReservation() {
		return reservation;
	}

	public void setReservation(int reservation) {
		this.reservation = reservation;
	}

}
