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

import com.pfa.reservationhoteliere.entity.Salle;
import com.pfa.reservationhoteliere.repository.ISalleRepository;

@RestController
@RequestMapping("salles")
public class SalleController {
	@Autowired
	private ISalleRepository salleRepository;

	@GetMapping("/all")
	public List<Salle> findAll() {
		return salleRepository.findAll();
	}

	

	@PostMapping(value = "/save")
	public void save(@RequestBody final Salle salle) {
		salleRepository.save(salle);
	}

	@DeleteMapping(value = "/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		System.out.println("id = "+id);
		Salle salle = salleRepository.findById(Integer.parseInt(id));
		salleRepository.delete(salle);
		salleRepository.flush();
	}
	
	@GetMapping(value = "/count")
	public long countSalle() {
		return salleRepository.count();
	}

}
