package com.pfa.reservationhoteliere.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TarifSaisonPK implements Serializable {
	@Column(name = "tarif")
	private int tarif;
	@Column(name = "saison")
	private int saison;

	public TarifSaisonPK() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + saison;
		result = prime * result + tarif;
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
		TarifSaisonPK other = (TarifSaisonPK) obj;
		if (saison != other.saison)
			return false;
		if (tarif != other.tarif)
			return false;
		return true;
	}

	public TarifSaisonPK(int tarif, int saison) {
		super();
		this.tarif = tarif;
		this.saison = saison;
	}

	public int getTarif() {
		return tarif;
	}

	public void setTarif(int tarif) {
		this.tarif = tarif;
	}

	public int getSaison() {
		return saison;
	}

	public void setSaison(int saison) {
		this.saison = saison;
	}

}
