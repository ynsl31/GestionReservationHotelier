package com.pfa.reservationhoteliere.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.pfa.reservationhoteliere.entity.MaitreHotel;

@Component
public interface IMaitreHotelRepository extends JpaRepository<MaitreHotel, Integer> {
	MaitreHotel findById(int id);
	List<MaitreHotel> findAll();
}
