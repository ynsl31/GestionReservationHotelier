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
import com.pfa.reservationhoteliere.entity.Facture;
import com.pfa.reservationhoteliere.entity.Facturedetaille;
import com.pfa.reservationhoteliere.repository.IFactureRepository;

@RestController
@RequestMapping("factures")
@CrossOrigin(origins = "http://localhost:4200")
public class FactureController {
	@Autowired
	private IFactureRepository factureRepository;

	@GetMapping("/all")
	public List<Facture> findAll() {
		return factureRepository.findAll();
	}
	@GetMapping("/clients/all")
	public List<Client> findClientsFacture() {
		return factureRepository.ClientsFacture();
	}

	@GetMapping("/find/{id}")
	public Facture findFacture(@PathVariable(required = true) String id) {

		return factureRepository.findById(Integer.parseInt(id));
	}

	@GetMapping("/client/{id}")
	public Facture findFactureParClient(@PathVariable(required = true) String id) {

		return factureRepository.findByClient(Long.parseLong(id));
	}

	@PostMapping(value = "/save")
	public void save(@RequestBody final Facture facture) {
		factureRepository.save(facture);
	}

	@DeleteMapping(value = "/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		System.out.println("id = " + id);
		Facture facture = factureRepository.findById(Integer.parseInt(id));
		factureRepository.delete(facture);
		factureRepository.flush();
	}

	@GetMapping(value = "/client/totalprix/{id}")
	public double totalprixId(@PathVariable(required = true) String id) {
		return factureRepository.totalpriceClient(Long.parseLong(id));
	}

	@GetMapping(value = "/totalprix/{id}")
	public double totalprixfacture(@PathVariable(required = true) String id) {
		return factureRepository.totalpriceFacture(Integer.parseInt(id));
	}
	@GetMapping(value = "/totaldays/{id}")
	public int totalDays(@PathVariable(required = true) String id) {
		return factureRepository.Totaledays(Long.parseLong(id));
	}

}
