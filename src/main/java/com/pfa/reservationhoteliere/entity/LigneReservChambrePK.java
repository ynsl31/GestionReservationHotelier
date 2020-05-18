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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + chambre;
		result = prime * result + reservation;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LigneReservChambrePK other = (LigneReservChambrePK) obj;
		if (chambre != other.chambre)
			return false;
		if (reservation != other.reservation)
			return false;
		return true;
	}

}
