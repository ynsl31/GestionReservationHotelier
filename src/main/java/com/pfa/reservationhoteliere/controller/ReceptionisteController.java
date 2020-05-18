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

import com.pfa.reservationhoteliere.entity.Receptioniste;
import com.pfa.reservationhoteliere.entity.User;
import com.pfa.reservationhoteliere.repository.IReceptionisteRepository;

@RestController
@RequestMapping("receptionists")
public class ReceptionisteController {
	@Autowired
	private IReceptionisteRepository  ReceptionistRepository;

	@GetMapping("/find/{id}")
	public User findById(@PathVariable int id) {
		return ReceptionistRepository.findById(id);
	}

	@GetMapping("/all")
	public List<Receptioniste> findAll() {
		return ReceptionistRepository.findAll();
	}

	@GetMapping(value = "/count")
	public long countSalle() {
		return ReceptionistRepository.count();
	}

	@PostMapping("/save")
	public void save(@RequestBody Receptioniste user) {
		ReceptionistRepository.save(user);
	}

	@DeleteMapping(value = "/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		System.out.println("id = " + id);
		Receptioniste user = ReceptionistRepository.findById(Integer.parseInt(id));
		ReceptionistRepository.delete(user);
		ReceptionistRepository.flush();
	}

}
