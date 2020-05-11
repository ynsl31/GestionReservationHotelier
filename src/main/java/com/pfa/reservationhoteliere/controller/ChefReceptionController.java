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

import com.pfa.reservationhoteliere.entity.ChefReception;
import com.pfa.reservationhoteliere.entity.Regime;
import com.pfa.reservationhoteliere.repository.IChefReceptionRepository;
import com.pfa.reservationhoteliere.repository.IRegimeRepository;

@RestController
@RequestMapping("chefsReception")
public class ChefReceptionController {
	@Autowired
	private IChefReceptionRepository chefRecep;

	@GetMapping("/find/{id}")
	public ChefReception findById(@PathVariable int id) {
		return chefRecep.findById(id);
	}

	@GetMapping("/all")
	public List<ChefReception> findAll() {
		return chefRecep.findAll();
	}

	@GetMapping(value = "/count")
	public long countSalle() {
		return chefRecep.count();
	}

	@PostMapping("/save")
	public void save(@RequestBody ChefReception chefReception) {
		chefRecep.save(chefReception);
	}

	@DeleteMapping(value = "/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		System.out.println("id = " + id);
		ChefReception chefReception = chefRecep.findById(Integer.parseInt(id));
		chefRecep.delete(chefReception);
		chefRecep.flush();
	}

}
