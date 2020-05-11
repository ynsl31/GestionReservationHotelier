package com.pfa.reservationhoteliere.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfa.reservationhoteliere.entity.Regime;
import com.pfa.reservationhoteliere.entity.Salle;

public interface ISalleRepository extends JpaRepository<Salle,Integer>{
Salle findById(int id);
}
