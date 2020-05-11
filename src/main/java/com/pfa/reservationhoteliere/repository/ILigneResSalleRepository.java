package com.pfa.reservationhoteliere.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfa.reservationhoteliere.entity.LigneResSalle;
import com.pfa.reservationhoteliere.entity.LigneReservSallePK;
import com.pfa.reservationhoteliere.entity.Regime;

public interface ILigneResSalleRepository extends JpaRepository<LigneResSalle,LigneReservSallePK>{
	LigneResSalle findByLigneReservSallePK(LigneReservSallePK ligneReservSallePK);
}
