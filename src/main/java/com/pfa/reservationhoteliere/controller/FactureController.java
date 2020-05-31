package com.pfa.reservationhoteliere.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfa.reservationhoteliere.entity.Facture;
import com.pfa.reservationhoteliere.repository.IFactureRepository;

@RestController
@RequestMapping("factures")
@CrossOrigin(origins = "http://localhost:4200")  
public class FactureController {
	@Autowired
	private IFactureRepository factureRepository;

	@GetMapping("/all")
	public List<Facture> findAll() {
		return factureRepository.findAll();
	}

	@PostMapping(value = "/save")
	public void save(@RequestBody final Facture facture) {
		factureRepository.save(facture);
	}

	@DeleteMapping(value = "/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		System.out.println("id = " + id);
		Facture facture = factureRepository.findById(Integer.parseInt(id));
		factureRepository.delete(facture);
		factureRepository.flush();
	}

	@GetMapping(value = "/count")
	public long countSalle() {
		return factureRepository.count();
	}

}
