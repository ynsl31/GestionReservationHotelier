package com.pfa.reservationhoteliere.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfa.reservationhoteliere.entity.Facture;
import com.pfa.reservationhoteliere.entity.Regime;

public interface IFactureRepository extends JpaRepository<Facture,Integer>{
 Facture findById(int id);
}
