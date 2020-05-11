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

import com.pfa.reservationhoteliere.entity.Saison;
import com.pfa.reservationhoteliere.repository.ISaisonRepository;

@RestController
@RequestMapping("saisons")
public class SaisonController {
	@Autowired
	private ISaisonRepository saisonRepository;
	
	@PostMapping("/save")
	public void save(@RequestBody Saison saison) {
		saisonRepository.save(saison);
	}
	
	@GetMapping("/all")
	public List<Saison> findAll(){
		return saisonRepository.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable String id) {
		Saison saison = saisonRepository.findById(Integer.parseInt(id));
		saisonRepository.delete(saison);
	}
		
}
