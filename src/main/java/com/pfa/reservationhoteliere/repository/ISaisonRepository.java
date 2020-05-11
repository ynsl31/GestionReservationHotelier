package com.pfa.reservationhoteliere.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfa.reservationhoteliere.entity.Saison;

public interface ISaisonRepository extends JpaRepository<Saison,Integer>{
	Saison findById(int id);
}
