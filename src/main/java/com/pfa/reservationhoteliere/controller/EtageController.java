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

import com.pfa.reservationhoteliere.entity.Etage;
import com.pfa.reservationhoteliere.repository.IEtageRepository;

@RestController
@RequestMapping("etages")
@CrossOrigin(origins = "http://localhost:4200")  
public class EtageController {
	@Autowired
	private IEtageRepository etageRepository;

	@GetMapping("/find/{id}")
	public Etage findById(@PathVariable int id) {
		return etageRepository.findById(id);
	}

	@GetMapping("/all")
	public List<Etage> findAll() {
		return etageRepository.findAll();
	}

	@GetMapping(value = "/count")
	public long countSalle() {
		return etageRepository.count();
	}

	@PostMapping("/save")
	public void save(@RequestBody Etage etage) {
		etageRepository.save(etage);
	}

	@DeleteMapping(value = "/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		System.out.println("id = " + id);
		Etage etage = etageRepository.findById(Integer.parseInt(id));
		etageRepository.delete(etage);
		etageRepository.flush();
	}

}
