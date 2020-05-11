package com.pfa.reservationhoteliere.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Client  implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;//clé primere f base donnee findByID
	private String reference;// CIN ou N passeport ...
	private String nom;
	private String prenom;
	private String mail;
	private Long telephone;
	private String adresse;
	private String nationnalite;
	@OneToMany(mappedBy = "client")
	@JsonIgnore
	private List<Reservation> reservations;

	public Client() {
		super();
	}

	public Client(String reference, String nom, String prenom, String mail, Long telephone, String adresse,
			String nationnalite) {
		super();
		this.reference = reference;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.telephone = telephone;
		this.adresse = adresse;
		this.nationnalite = nationnalite;
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

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Long getTelephone() {
		return telephone;
	}

	public void setTelephone(Long telephone) {
		this.telephone = telephone;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getNationnalite() {
		return nationnalite;
	}

	public void setNationnalite(String nationnalite) {
		this.nationnalite = nationnalite;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", reference=" + reference + ", nom=" + nom + ", prenom=" + prenom + ", mail="
				+ mail + ", telephone=" + telephone + ", adresse=" + adresse + ", nationnalite=" + nationnalite
				+ ", reservations=" + reservations + "]";
	}

}
