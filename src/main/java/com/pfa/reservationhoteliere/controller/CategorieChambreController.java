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

import com.pfa.reservationhoteliere.entity.CategorieChambre;
import com.pfa.reservationhoteliere.repository.ICategorieChambreRepository;

@RestController
@RequestMapping("categoriechambres")
@CrossOrigin(origins = "http://localhost:4200")  

public class CategorieChambreController {
	@Autowired
	private ICategorieChambreRepository categorieChambreRep;

	@GetMapping("/find/{id}")
	public CategorieChambre findById(@PathVariable int id) {
		return categorieChambreRep.findById(id);
	}

	@GetMapping("/all")
	public List<CategorieChambre> findAll() {
		return categorieChambreRep.findAll();
	}

	@GetMapping(value = "/count")
	public long countSalle() {
		return categorieChambreRep.count();
	}

	@PostMapping("/save")
	public void save(@RequestBody CategorieChambre categorieChambre) {
		categorieChambreRep.save(categorieChambre);
	}

	@DeleteMapping(value = "/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		System.out.println("id = " + id);
		CategorieChambre categorieChambre = categorieChambreRep.findById(Integer.parseInt(id));
		categorieChambreRep.delete(categorieChambre);
		categorieChambreRep.flush();
	}

}
