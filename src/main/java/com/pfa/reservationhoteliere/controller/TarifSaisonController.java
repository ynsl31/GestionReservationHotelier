package com.pfa.reservationhoteliere.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pfa.reservationhoteliere.entity.Service;
import com.pfa.reservationhoteliere.entity.Tarif;
import com.pfa.reservationhoteliere.entity.TarifSaison;
import com.pfa.reservationhoteliere.entity.TarifSaisonPK;
import com.pfa.reservationhoteliere.repository.ISaisonRepository;
import com.pfa.reservationhoteliere.repository.ITarifRepository;
import com.pfa.reservationhoteliere.repository.ITarifSaisonRepository;

@RestController
@RequestMapping("tarifsaisons")
@CrossOrigin(origins = "http://localhost:4200")
public class TarifSaisonController {
	@Autowired
	private ITarifSaisonRepository tsRepository;

	@GetMapping("/all")
	public List<TarifSaison> findAll() {
		return tsRepository.findAll();
	}

	@PostMapping(value = "/save")
	public void save(@RequestBody TarifSaison ts) {

		tsRepository.save(ts);
	}

	@GetMapping("/find")
	public TarifSaison findById(@RequestParam String tarif, @RequestParam String saison) {
		TarifSaisonPK pk = new TarifSaisonPK(Integer.parseInt(tarif), Integer.parseInt(saison));
		return tsRepository.findByTarifSaisonPK(pk);
	}

	@DeleteMapping("/delete")
	public void delete(@RequestParam String tarif, @RequestParam String saison) {
		TarifSaisonPK pk = new TarifSaisonPK(Integer.parseInt(tarif), Integer.parseInt(saison));
		System.out.println(pk.toString());
		TarifSaison ts = tsRepository.findByTarifSaisonPK(pk);
		tsRepository.delete(ts);

	}
}
