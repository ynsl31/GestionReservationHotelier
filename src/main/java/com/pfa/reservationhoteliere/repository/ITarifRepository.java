package com.pfa.reservationhoteliere.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfa.reservationhoteliere.entity.Tarif;

public interface ITarifRepository extends JpaRepository<Tarif, Integer>{
	Tarif findById(int id);

}
