package com.pfa.reservationhoteliere.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Reservation implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String reference;
	private int nbPersonne;
	private boolean etat;
	@Temporal(TemporalType.DATE)
	private Date dateReservation;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JsonIgnoreProperties({"reservations"} )
	private Regime regime;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JsonIgnoreProperties({"reservations"} )
	@JsonIgnore
	private Facture facture;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JsonIgnoreProperties({"reservations"} )
	private Client client;
	@OneToMany(mappedBy = "reservation")
	private List<Service> services;
	@OneToMany(mappedBy = "reservation")
	private List<LigneResChambre> ligneReschambres;
	@OneToMany(mappedBy = "reservation")
	private List<LigneResSalle> ligneRessalles;

	public Reservation() {
		super();
	}

	public Reservation(String reference, int nbPersonne, boolean etat, Date dateReservation, Regime regime,
			Facture facture, Client client, List<Service> services) {
		super();
		this.reference = reference;
		this.nbPersonne = nbPersonne;
		this.etat = etat;
		this.dateReservation = dateReservation;
		this.regime = regime;
		this.facture = facture;
		this.client = client;
		this.services = services;
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

	public int getNbPersonne() {
		return nbPersonne;
	}

	public void setNbPersonne(int nbPersonne) {
		this.nbPersonne = nbPersonne;
	}

	public boolean isEtat() {
		return etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}

	public Date getDateReservation() {
		return dateReservation;
	}

	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}

	public Regime getRegime() {
		return regime;
	}

	public void setRegime(Regime regime) {
		this.regime = regime;
	}

	public Facture getFacture() {
		return facture;
	}

	public void setFacture(Facture facture) {
		this.facture = facture;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Service> getServices() {
		return services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}

	public List<LigneResChambre> getLigneReschambres() {
		return ligneReschambres;
	}

	public void setLigneReschambres(List<LigneResChambre> ligneReschambres) {
		this.ligneReschambres = ligneReschambres;
	}

	public List<LigneResSalle> getLigneRessalles() {
		return ligneRessalles;
	}

	public void setLigneRessalles(List<LigneResSalle> ligneRessalles) {
		this.ligneRessalles = ligneRessalles;
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", reference=" + reference + ", nbPersonne=" + nbPersonne + ", etat=" + etat
				+ ", dateReservation=" + dateReservation + ", regime=" + regime + ", facture=" + facture + ", client="
				+ client + ", services=" + services + "]";
	}

}
