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
