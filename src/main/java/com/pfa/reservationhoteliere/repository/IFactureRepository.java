package com.pfa.reservationhoteliere.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pfa.reservationhoteliere.entity.Facture;
import com.pfa.reservationhoteliere.entity.Regime;
import com.pfa.reservationhoteliere.entity.Reservation;

public interface IFactureRepository extends JpaRepository<Facture, Integer> {
	Facture findById(int id);

	@Query("SELECT SUM( DATEDIFF(lr.dateSortie,lr.dateArrivee) *t.prix ) FROM Client c JOIN c.reservations r JOIN r.ligneReschambres lr JOIN lr.chambre ch JOIN ch.categorieChambre cc JOIN cc.tarif t WHERE c.id = ?1 Group by (c)")
	double totalpriceClient(long id);

	@Query("SELECT DATEDIFF(lr.dateSortie,lr.dateArrivee) *t.prix FROM Facture c JOIN c.reservations r JOIN r.ligneReschambres lr JOIN lr.chambre ch JOIN ch.categorieChambre cc JOIN cc.tarif t WHERE c.id = ?1 ")
	double totalpriceFacture(int id);

	@Query("SELECT  DATEDIFF(lr.dateSortie,lr.dateArrivee) *t.prix FROM Client c JOIN c.reservations r JOIN r.ligneReschambres lr JOIN lr.chambre ch JOIN ch.categorieChambre cc JOIN cc.tarif t WHERE r.id = ?1 and c.id= ?2 ")
	double totalpriceReservation(int idR, long idC);

	@Query("SELECT f From Facture f JOIN f.reservations r JOIN r.client c where c.id = ?1 ")
	Facture findByClient(long id);

	@Query("SELECT SUM(DATEDIFF(lr.dateSortie,lr.dateArrivee) *t.prix)  FROM Client c JOIN c.reservations r JOIN r.ligneReschambres lr JOIN lr.chambre ch JOIN ch.categorieChambre cc JOIN cc.tarif t where r.facture.id = 3 Group by (c)")
	double Getfactures();

	@Query("SELECT f.dateFacture,r.reference,r.dateReservation,lr.dateArrivee,lr.dateSortie,ch.refrence,cc.libelle,DATEDIFF(lr.dateSortie,lr.dateArrivee) *t.prix FROM Facture f JOIN f.reservations r JOIN r.ligneReschambres lr JOIN lr.chambre ch JOIN ch.categorieChambre cc JOIN cc.tarif t")
	ArrayList<Object> GetfacturesC();
	@Query("SELECT SUM( DATEDIFF(lr.dateSortie,lr.dateArrivee)) FROM Client c JOIN c.reservations r JOIN r.ligneReschambres lr JOIN lr.chambre ch JOIN ch.categorieChambre cc JOIN cc.tarif t WHERE c.id = ?1 Group by (c)")
	int Totaledays(long id);
	
}
