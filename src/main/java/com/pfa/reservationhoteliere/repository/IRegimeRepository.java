package com.pfa.reservationhoteliere.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.pfa.reservationhoteliere.entity.Regime;

@Component
public interface IRegimeRepository extends JpaRepository<Regime, Integer> {
	Regime findById(int id);
	List<Regime> findAll();
}
