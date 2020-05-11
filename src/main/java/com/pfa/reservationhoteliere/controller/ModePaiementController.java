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

import com.pfa.reservationhoteliere.entity.ModePaiement;
import com.pfa.reservationhoteliere.repository.IModePaiementRepository;
import com.pfa.reservationhoteliere.repository.IRegimeRepository;

@RestController
@RequestMapping("modePaiements")
public class ModePaiementController {
	@Autowired
	private IModePaiementRepository ModePaiementRepository;

	@GetMapping("/all")
	public List<ModePaiement> findAll() {
		return ModePaiementRepository.findAll();
	}

	

	@PostMapping(value = "/save")
	public void save(@RequestBody final ModePaiement modePaiement) {
		ModePaiementRepository.save(modePaiement);
	}

	@DeleteMapping(value = "/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		System.out.println("id = "+id);
		ModePaiement modePaiement = ModePaiementRepository.findById(Integer.parseInt(id));
		ModePaiementRepository.delete(modePaiement);
		ModePaiementRepository.flush();
	}
	
	@GetMapping(value = "/count")
	public long countSalle() {
		return ModePaiementRepository.count();
	}

}
