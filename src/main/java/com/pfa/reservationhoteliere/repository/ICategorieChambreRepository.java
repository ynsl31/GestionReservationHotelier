package com.pfa.reservationhoteliere.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.pfa.reservationhoteliere.entity.CategorieChambre;
import com.pfa.reservationhoteliere.entity.Regime;

@Component
public interface ICategorieChambreRepository extends JpaRepository<CategorieChambre, Integer> {
	CategorieChambre findById(int id);
	List<CategorieChambre> findAll();
}
