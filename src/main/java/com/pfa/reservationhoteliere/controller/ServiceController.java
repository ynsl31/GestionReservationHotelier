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

import com.pfa.reservationhoteliere.entity.Service;
import com.pfa.reservationhoteliere.repository.IServiceRepository;
@RestController
@RequestMapping("services")
public class ServiceController {
	@Autowired
	private IServiceRepository serviceRepository;
	
	@PostMapping("/save")
	public void save(@RequestBody Service service) {
		serviceRepository.save(service);
	}
	
	@GetMapping("/all")
	public List<Service> findAll(){
		return serviceRepository.findAll();
	}
	@DeleteMapping("/delete/{id}")
	public void deleteService(@PathVariable String id) {
		Service service=serviceRepository.findById(Integer.parseInt(id));
		serviceRepository.delete(service);
	}
}
