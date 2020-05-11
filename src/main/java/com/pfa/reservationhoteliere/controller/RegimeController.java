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

import com.pfa.reservationhoteliere.entity.Regime;
import com.pfa.reservationhoteliere.repository.IRegimeRepository;

@RestController
@RequestMapping("regimes")
public class RegimeController {
	@Autowired
	private IRegimeRepository regimeRepository;

	@GetMapping("/find/{id}")
	public Regime findById(@PathVariable int id) {
		return regimeRepository.findById(id);
	}

	@GetMapping("/all")
	public List<Regime> findAll() {
		return regimeRepository.findAll();
	}

	@GetMapping(value = "/count")
	public long countSalle() {
		return regimeRepository.count();
	}

	@PostMapping("/save")
	public void save(@RequestBody Regime regime) {
		regimeRepository.save(regime);
	}

	@DeleteMapping(value = "/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		System.out.println("id = " + id);
		Regime regime = regimeRepository.findById(Integer.parseInt(id));
		regimeRepository.delete(regime);
		regimeRepository.flush();
	}

}
