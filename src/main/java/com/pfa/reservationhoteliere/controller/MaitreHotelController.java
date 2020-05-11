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

import com.pfa.reservationhoteliere.entity.MaitreHotel;
import com.pfa.reservationhoteliere.repository.IMaitreHotelRepository;

@RestController
@RequestMapping("maitreshotel")
public class MaitreHotelController {
	@Autowired
	private IMaitreHotelRepository maitreHotelRepository;

	@GetMapping("/find/{id}")
	public MaitreHotel findById(@PathVariable int id) {
		return maitreHotelRepository.findById(id);
	}

	@GetMapping("/all")
	public List<MaitreHotel> findAll() {
		return maitreHotelRepository.findAll();
	}

	@GetMapping(value = "/count")
	public long countSalle() {
		return maitreHotelRepository.count();
	}

	@PostMapping("/save")
	public void save(@RequestBody MaitreHotel maitrehotel) {
		maitreHotelRepository.save(maitrehotel);
	}

	@DeleteMapping(value = "/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		System.out.println("id = " + id);
		MaitreHotel maitrehotel = maitreHotelRepository.findById(Integer.parseInt(id));
		maitreHotelRepository.delete(maitrehotel);
		maitreHotelRepository.flush();
	}

}
