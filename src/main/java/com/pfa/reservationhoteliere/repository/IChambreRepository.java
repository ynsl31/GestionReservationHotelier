package com.pfa.reservationhoteliere.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.pfa.reservationhoteliere.entity.Chambre;
import com.pfa.reservationhoteliere.entity.Regime;

@Component
public interface IChambreRepository extends JpaRepository<Chambre, Integer> {
	Chambre findById(int id);
	List<Chambre> findAll();
}
