package com.pfa.reservationhoteliere.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfa.reservationhoteliere.entity.Client;


public interface IClientRepository extends JpaRepository<Client,Long>{
	Client findById(long id);
	Client findByReference(String reference);
}
