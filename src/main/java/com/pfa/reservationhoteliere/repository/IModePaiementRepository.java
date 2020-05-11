package com.pfa.reservationhoteliere.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfa.reservationhoteliere.entity.ModePaiement;
import com.pfa.reservationhoteliere.entity.Regime;

public interface IModePaiementRepository extends JpaRepository<ModePaiement,Integer>{
ModePaiement findById(int id);
}
