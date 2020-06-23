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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pfa.reservationhoteliere.entity.LigneResChambre;
import com.pfa.reservationhoteliere.entity.LigneReservChambrePK;
import com.pfa.reservationhoteliere.entity.Regime;
import com.pfa.reservationhoteliere.repository.ILigneResChambreRepository;
import com.pfa.reservationhoteliere.repository.IRegimeRepository;

@RestController
@RequestMapping("reservation")
@CrossOrigin(origins = "http://localhost:4200")  
public class LigneResChambreController {
	@Autowired
	private ILigneResChambreRepository ILigneResChambreRepository;

	@GetMapping(value = "/find/{reservation}/{chambre}")
	public  LigneResChambre findbyId(@PathVariable (required = true) String reservation,@PathVariable(required = true)String chambre) {
		LigneReservChambrePK id = new LigneReservChambrePK(Integer.parseInt(chambre),Integer.parseInt(reservation));
		
		return  ILigneResChambreRepository.findByLigneReservChambrePK(id);
		
	}
	

	@GetMapping("/all")
	public List<LigneResChambre> findAll() {
		return ILigneResChambreRepository.findAll();
	}


	@PostMapping("/save")
	public void save(@RequestBody LigneResChambre ILigneResChambre) {
		ILigneResChambreRepository.save(ILigneResChambre);
	}

	@DeleteMapping(value = "/delete")
	public void delete(@RequestParam (required = true) String reservation,@RequestParam(required = true)String chambre) {
		LigneReservChambrePK id = new LigneReservChambrePK(Integer.parseInt(chambre),Integer.parseInt(reservation));
		
		LigneResChambre  res = ILigneResChambreRepository.findByLigneReservChambrePK(id);
		
	ILigneResChambreRepository.delete(res);
	}

}
