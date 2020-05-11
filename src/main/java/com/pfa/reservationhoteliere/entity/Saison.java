package com.pfa.reservationhoteliere.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Saison {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String reference;
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	@Temporal(TemporalType.DATE)
	private Date dateFin;
	private float reduction;
	private float augmentation;
	@OneToMany(mappedBy = "saison", fetch = FetchType.EAGER)
	private List<TarifSaison> tarifSaisons;

	public Saison() {
		super();
	}

	public Saison(String reference, Date dateDebut, Date dateFin, float reduction, float augmentation) {
		super();
		this.reference = reference;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.reduction = reduction;
		this.augmentation = augmentation;
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

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public float getReduction() {
		return reduction;
	}

	public void setReduction(float reduction) {
		this.reduction = reduction;
	}

	public float getAugmentation() {
		return augmentation;
	}

	public void setAugmentation(float augmentation) {
		this.augmentation = augmentation;
	}

	public List<TarifSaison> getTarifSaisons() {
		return tarifSaisons;
	}

	public void setTarifSaisons(List<TarifSaison> tarifSaisons) {
		this.tarifSaisons = tarifSaisons;
	}

	@Override
	public String toString() {
		return "Saison [id=" + id + ", reference=" + reference + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin
				+ ", reduction=" + reduction + ", augmentation=" + augmentation + "]";
	}

}
