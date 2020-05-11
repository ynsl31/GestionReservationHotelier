package com.pfa.reservationhoteliere.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class LigneReservSallePK implements Serializable {
	@Column(name = "salle")
	private int salle;
	@Column(name = "reservation")
	private int reservation;

	public LigneReservSallePK() {
		super();
	}

	public LigneReservSallePK(int salle, int reservation) {
		super();
		this.salle = salle;
		this.reservation = reservation;
	}

	public int getSalle() {
		return salle;
	}

	public void setSalle(int salle) {
		this.salle = salle;
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
		result = prime * result + reservation;
		result = prime * result + salle;
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
		LigneReservSallePK other = (LigneReservSallePK) obj;
		if (reservation != other.reservation)
			return false;
		if (salle != other.salle)
			return false;
		return true;
	}

}
