package com.pfa.reservationhoteliere.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.pfa.reservationhoteliere.entity.User;

@Component
public interface IUserRepository extends JpaRepository<User, Integer> {
	User findById(int id);
	List<User> findAll();
	User findByLoginAndPwd(String login,String pwd);
}
