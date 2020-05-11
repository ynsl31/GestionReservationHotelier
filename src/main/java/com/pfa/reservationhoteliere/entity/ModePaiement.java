package com.pfa.reservationhoteliere.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ModePaiement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int reference;
	private String type;
	@OneToMany(mappedBy = "modePaiement")
	private List<Facture> factures;

	public ModePaiement() {
		super();
	}

	public ModePaiement(int reference, String type) {
		super();
		this.reference = reference;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getReference() {
		return reference;
	}

	public void setReference(int reference) {
		this.reference = reference;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Facture> getFactures() {
		return factures;
	}

	public void setFactures(List<Facture> factures) {
		this.factures = factures;
	}

	@Override
	public String toString() {
		return "ModePaiement [id=" + id + ", reference=" + reference + ", type=" + type + "]";
	}

}
