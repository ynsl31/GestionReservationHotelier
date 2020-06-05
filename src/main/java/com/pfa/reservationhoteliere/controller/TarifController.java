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

import com.pfa.reservationhoteliere.entity.Service;
import com.pfa.reservationhoteliere.entity.Tarif;
import com.pfa.reservationhoteliere.repository.ITarifRepository;
@RestController
@RequestMapping("tarifs")
@CrossOrigin(origins = "http://localhost:4200")  
public class TarifController {
	@Autowired
	private ITarifRepository tarifRepository;
	@GetMapping("/all")
	public List<Tarif> findAll() {
		return tarifRepository.findAll();
	}
	@PostMapping(value = "/save")
	public void save(@RequestBody  Tarif tarif) {
		tarifRepository.save(tarif);
	}
	@GetMapping("/find/{id}")
	public Tarif findById(@PathVariable int id) {
		return tarifRepository.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable String id) {
		System.out.println("id = "+id);
		Tarif tarif = tarifRepository.findById(Integer.parseInt(id));
		tarifRepository.delete(tarif);
		
	}
}
