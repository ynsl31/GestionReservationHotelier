package com.pfa.reservationhoteliere.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfa.reservationhoteliere.entity.Regime;
import com.pfa.reservationhoteliere.entity.Reservation;

public interface IReservationRepository extends JpaRepository<Reservation,Integer>{
	Reservation findById(int id);
}
