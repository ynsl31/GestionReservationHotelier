package com.pfa.reservationhoteliere.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfa.reservationhoteliere.entity.Tarif;
import com.pfa.reservationhoteliere.entity.TarifSaison;
import com.pfa.reservationhoteliere.entity.TarifSaisonPK;

public interface ITarifSaisonRepository extends JpaRepository<TarifSaison,TarifSaisonPK>{
	TarifSaison findByTarifSaisonPK(TarifSaisonPK pk);
	
	
}
