package com.pfa.reservationhoteliere.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.pfa.reservationhoteliere.entity.Receptioniste;

@Component
public interface IReceptionisteRepository extends JpaRepository<Receptioniste, Integer> {
	Receptioniste findById(int id);
	List<Receptioniste> findAll();
}
