package com.pfa.reservationhoteliere.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfa.reservationhoteliere.entity.Reservation;
import com.pfa.reservationhoteliere.repository.IReservationRepository;

@RestController
@RequestMapping("reservations")
public class ReservationController {
	@Autowired
	private IReservationRepository reservationRepository;

	@GetMapping("/all")
	public List<Reservation> findAll() {
		return reservationRepository.findAll();
	}
	@PostMapping(value = "/save")
	public void save(@RequestBody final Reservation reservation) {
		reservationRepository.save(reservation);
	}

	@DeleteMapping(value = "/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		System.out.println("id = "+id);
		Reservation reservation = reservationRepository.findById(Integer.parseInt(id));
		reservationRepository.delete(reservation);
		reservationRepository.flush();
	}
	
	@GetMapping(value = "/count")
	public long countSalle() {
		return reservationRepository.count();
	}

	@GetMapping(value = "/totalprix/{id}")
	public Double totalprixId(@PathVariable(required = true) String id) {
		return reservationRepository.totalprice(Integer.parseInt(id));
	}

}
