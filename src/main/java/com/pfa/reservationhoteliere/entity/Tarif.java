package com.pfa.reservationhoteliere.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Tarif {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String reference;
	private float prix;
	private String description;
	@OneToMany(mappedBy = "tarif")
	private List<Service> services;
	@OneToMany(mappedBy = "tarif")
	private List<CategorieChambre> categories;
	@OneToMany(mappedBy = "tarif")
	private List<Salle> salles;
	@OneToMany(mappedBy = "tarif")
	private List<TarifSaison> tarifSaisons;

	public Tarif() {
		super();
	}

	public Tarif(String reference, float prix, String description) {
		super();
		this.reference = reference;
		this.prix = prix;
		this.description = description;
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

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Service> getServices() {
		return services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}

	public List<CategorieChambre> getCategories() {
		return categories;
	}

	public void setCategories(List<CategorieChambre> categories) {
		this.categories = categories;
	}

	public List<Salle> getSalles() {
		return salles;
	}

	public void setSalles(List<Salle> salles) {
		this.salles = salles;
	}

	public List<TarifSaison> getTarifSaisons() {
		return tarifSaisons;
	}

	public void setTarifSaisons(List<TarifSaison> tarifSaisons) {
		this.tarifSaisons = tarifSaisons;
	}

	@Override
	public String toString() {
		return "Tarif [id=" + id + ", reference=" + reference + ", prix=" + prix + ", description=" + description
				+ ", services=" + services + ", categories=" + categories + ", salles=" + salles + "]";
	}

}
