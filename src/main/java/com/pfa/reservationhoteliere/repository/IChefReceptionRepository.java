package com.pfa.reservationhoteliere.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.pfa.reservationhoteliere.entity.ChefReception;

@Component
public interface IChefReceptionRepository extends JpaRepository<ChefReception, Integer> {
	ChefReception findById(int id);
	List<ChefReception> findAll();
}
