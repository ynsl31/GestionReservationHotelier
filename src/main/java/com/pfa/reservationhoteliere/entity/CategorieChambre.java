package com.pfa.reservationhoteliere.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import net.minidev.json.annotate.JsonIgnore;

@Entity
public class CategorieChambre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String reference;
	private String libelle;
	private String description; 
	@OneToMany(mappedBy = "categorieChambre")
	private List<Chambre> chambres;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JsonIgnoreProperties({"categories"} )
	private Tarif tarif;

	public CategorieChambre() {
		super();
	}

	public CategorieChambre(String reference, String libelle, String description, String vue, Tarif tarif) {
		super();
		this.reference = reference;
		this.libelle = libelle;
		this.description = description;
		
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
				+ description + ", chambres=" + chambres + ", tarif=" + tarif + "]";
	}



}
