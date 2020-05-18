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

import com.pfa.reservationhoteliere.entity.User;
import com.pfa.reservationhoteliere.repository.IRegimeRepository;
import com.pfa.reservationhoteliere.repository.IUserRepository;

@RestController
@RequestMapping("users")
@CrossOrigin
public class UserController {
	@Autowired
	private IUserRepository  userRepository;

	@GetMapping("/find/{id}")
	public User findById(@PathVariable int id) {
		return userRepository.findById(id);
	}
	@GetMapping("/auth")
	public User login(@RequestParam String login,@RequestParam String pwd) {
		return userRepository.findByLoginAndPwd(login, pwd);
	}
	//all
	@GetMapping("/all")
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@GetMapping(value = "/count")
	public long countSalle() {
		return userRepository.count();
	}

	@PostMapping("/save")
	public void save(@RequestBody User user) {
		userRepository.save(user);
	}

	@DeleteMapping(value = "/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		System.out.println("id = " + id);
		User user = userRepository.findById(Integer.parseInt(id));
		userRepository.delete(user);
		userRepository.flush();
	}

}
