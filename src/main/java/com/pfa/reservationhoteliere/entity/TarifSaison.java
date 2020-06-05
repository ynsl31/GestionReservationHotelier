package com.pfa.reservationhoteliere.entity;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import net.minidev.json.annotate.JsonIgnore;

@Entity
public class TarifSaison {
	@EmbeddedId
	private TarifSaisonPK tarifSaisonPK;
	private float prixFinal;
	@ManyToOne()
	@JsonIgnoreProperties({"tarifSaisons","categories"} )
	@JsonIgnore
	@JoinColumn(name="tarif", referencedColumnName="id", insertable= false, updatable = false)
	private Tarif tarif;
	@ManyToOne()
	@JsonIgnoreProperties({"tarifSaisons"} )
	@JsonIgnore
	@JoinColumn(name="saison", referencedColumnName="id", insertable=false, updatable = false)
	private Saison saison;

	public TarifSaison() {
		
		super();
		 
	}

	public TarifSaisonPK getTarifSaisonPK() {
		return tarifSaisonPK;
	}

	public void setTarifSaisonPK(TarifSaisonPK tarifSaisonPK) {
		this.tarifSaisonPK = tarifSaisonPK;
	}

	public float getPrixFinal() {
		return prixFinal;
	}

	public void setPrixFinal(float prixFinal) {
		this.prixFinal = prixFinal;
	}

	public Tarif getTarif() {
		return tarif;
	}

	public void setTarif(Tarif tarif) {
		this.tarif = tarif;
	}

	public Saison getSaison() {
		return saison;
	} 

	public void setSaison(Saison saison) {
		this.saison = saison;
	}

}
