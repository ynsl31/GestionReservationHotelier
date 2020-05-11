package com.pfa.reservationhoteliere.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pfa.reservationhoteliere.entity.Service;


public interface IServiceRepository extends JpaRepository<Service, Integer>{
	Service findById(int id);
}
