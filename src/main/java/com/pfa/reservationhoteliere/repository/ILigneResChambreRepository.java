package com.pfa.reservationhoteliere.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfa.reservationhoteliere.entity.LigneResChambre;
import com.pfa.reservationhoteliere.entity.LigneResSalle;
import com.pfa.reservationhoteliere.entity.LigneReservChambrePK;
import com.pfa.reservationhoteliere.entity.LigneReservSallePK;
import com.pfa.reservationhoteliere.entity.Regime;

public interface ILigneResChambreRepository extends JpaRepository<LigneResChambre,LigneReservChambrePK>{
	LigneResChambre findByLigneReservChambrePK(LigneReservChambrePK ligneReservChambrePK);
}
