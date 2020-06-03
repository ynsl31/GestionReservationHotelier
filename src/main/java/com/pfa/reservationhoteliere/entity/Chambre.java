package com.pfa.reservationhoteliere.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import net.minidev.json.annotate.JsonIgnore;

@Entity
public class Chambre implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String refrence;
	private int nbLit;
	private boolean etat;
	private boolean telephone;
	private boolean wifi;
	private boolean television;
	private boolean douche;
	private boolean terrasse;
	private String superficie;
	private String vue;
	private String image;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JsonIgnoreProperties({"chambres"} )
	private Etage etage;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JsonIgnoreProperties({"chambres"} )
	private CategorieChambre categorieChambre;
	@OneToMany(mappedBy = "chambre", fetch = FetchType.EAGER)
	private List<LigneResChambre> ligneResChambres;

	public Chambre() {
		super();
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRefrence() {
		return refrence;
	}

	public void setRefrence(String refrence) {
		this.refrence = refrence;
	}

	public int getNbLit() {
		return nbLit;
	}

	public void setNbLit(int nbLit) {
		this.nbLit = nbLit;
	}

	public boolean isEtat() {
		return etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}

	public boolean isTelephone() {
		return telephone;
	}

	public void setTelephone(boolean telephone) {
		this.telephone = telephone;
	}

	public boolean isWifi() {
		return wifi;
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}

	public boolean isTelevision() {
		return television;
	}

	public void setTelevision(boolean television) {
		this.television = television;
	}

	public boolean isDouche() {
		return douche;
	}

	public void setDouche(boolean douche) {
		this.douche = douche;
	}

	public boolean isTerrasse() {
		return terrasse;
	}

	public void setTerrasse(boolean terrasse) {
		this.terrasse = terrasse;
	}

	public String getSuperficie() {
		return superficie;
	}

	public void setSuperficie(String superficie) {
		this.superficie = superficie;
	}

	public String getVue() {
		return vue;
	}

	public void setVue(String vue) {
		this.vue = vue;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Etage getEtage() {
		return etage;
	}

	public void setEtage(Etage etage) {
		this.etage = etage;
	}

	public CategorieChambre getCategorieChambre() {
		return categorieChambre;
	}

	public void setCategorieChambre(CategorieChambre categorieChambre) {
		this.categorieChambre = categorieChambre;
	}

	public List<LigneResChambre> getLigneResChambres() {
		return ligneResChambres;
	}

	public void setLigneResChambres(List<LigneResChambre> ligneResChambres) {
		this.ligneResChambres = ligneResChambres;
	}

	@Override
	public String toString() {
		return "Chambre [id=" + id + ", refrence=" + refrence + ", nbLit=" + nbLit + ", etat=" + etat + ", telephone="
				+ telephone + ", wifi=" + wifi + ", television=" + television + ", douche=" + douche + ", terrasse="
				+ terrasse + ", superficie=" + superficie + ", vue=" + vue + ", image=" + image + ", etage=" + etage
				+ ", categorieChambre=" + categorieChambre + "]";
	}

}
