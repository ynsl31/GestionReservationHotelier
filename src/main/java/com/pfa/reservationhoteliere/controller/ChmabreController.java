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

import com.pfa.reservationhoteliere.entity.Chambre;
import com.pfa.reservationhoteliere.repository.IChambreRepository;

@RestController
@RequestMapping("chambres")
public class ChmabreController {
	@Autowired
	private IChambreRepository chambreRepository;

	@GetMapping("/find/{id}")
	public Chambre findById(@PathVariable int id) {
		return chambreRepository.findById(id);
	}

	@GetMapping("/all")
	public List<Chambre> findAll() {
		return chambreRepository.findAll();
	}

	@GetMapping(value = "/count")
	public long countSalle() {
		return chambreRepository.count();
	}

	@PostMapping("/save")
	public void save(@RequestBody Chambre chambre) {
		chambreRepository.save(chambre);
	}

	@DeleteMapping(value = "/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		System.out.println("id = " + id);
		Chambre chambre = chambreRepository.findById(Integer.parseInt(id));
		chambreRepository.delete(chambre);
		chambreRepository.flush();
	}

}
