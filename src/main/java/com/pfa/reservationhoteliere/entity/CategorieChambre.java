package com.pfa.reservationhoteliere.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class CategorieChambre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String reference;
	private String libelle;
	private String description;
	private String vue;
	@OneToMany(mappedBy = "categorieChambre")
	private List<Chambre> chambres;
	@ManyToOne
	private Tarif tarif;

	public CategorieChambre() {
		super();
	}

	public CategorieChambre(String reference, String libelle, String description, String vue, Tarif tarif) {
		super();
		this.reference = reference;
		this.libelle = libelle;
		this.description = description;
		this.vue = vue;
		this.tarif = tarif;
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

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getVue() {
		return vue;
	}

	public void setVue(String vue) {
		this.vue = vue;
	}

	public List<Chambre> getChambres() {
		return chambres;
	}

	public void setChambres(List<Chambre> chambres) {
		this.chambres = chambres;
	}

	public Tarif getTarif() {
		return tarif;
	}

	public void setTarif(Tarif tarif) {
		this.tarif = tarif;
	}

	@Override
	public String toString() {
		return "CategorieChambre [id=" + id + ", reference=" + reference + ", libelle=" + libelle + ", description="
				+ description + ", vue=" + vue + ", chambres=" + chambres + ", tarif=" + tarif + "]";
	}

}
