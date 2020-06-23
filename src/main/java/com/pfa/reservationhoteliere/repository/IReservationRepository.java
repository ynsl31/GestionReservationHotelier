package com.pfa.reservationhoteliere.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pfa.reservationhoteliere.entity.Client;
import com.pfa.reservationhoteliere.entity.Regime;
import com.pfa.reservationhoteliere.entity.Reservation;

public interface IReservationRepository extends JpaRepository<Reservation,Integer>{
	Reservation findById(int id);
	@Query("SELECT DATEDIFF(lr.dateSortie,lr.dateArrivee)*t.prix FROM Reservation r JOIN r.ligneReschambres lr JOIN lr.chambre ch JOIN ch.categorieChambre cc JOIN cc.tarif t WHERE r.id = ?1 ")
	double  totalprice(int id);
	@Query("SELECT r FROM Reservation r JOIN r.client c where c.id = ?1")
	List<Reservation> findByClient(long id);

}
