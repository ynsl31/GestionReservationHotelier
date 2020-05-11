package com.pfa.reservationhoteliere.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.pfa.reservationhoteliere.entity.Etage;
import com.pfa.reservationhoteliere.entity.Regime;

@Component
public interface IEtageRepository extends JpaRepository<Etage, Integer> {
	Etage findById(int id);
	List<Etage> findAll();
}
