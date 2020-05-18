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
import com.pfa.reservationhoteliere.entity.Client;
import com.pfa.reservationhoteliere.repository.IClientRepository;


@RestController
@RequestMapping("clients")
@CrossOrigin("")
public class ClientController {
	@Autowired
	private IClientRepository clientRepository;
	
	@GetMapping("/all")
	public List<Client> findAll(){
		return clientRepository.findAll();
	}
	
	@PostMapping("/save")
	public void save(@RequestBody Client client) {
		clientRepository.save(client);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public void delete(@PathVariable(required = true) String id){
		System.out.println("id = "+id);
		Client client=clientRepository.findById(Integer.parseInt(id));
		clientRepository.delete(client);	
	}
	
	@GetMapping("reference/{reference}")
	public Client findByReference(@PathVariable String reference) {
		return clientRepository.findByReference(reference);
	}
}
