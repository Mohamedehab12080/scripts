package com.scripts.controller.scripts.repository;
import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scripts.controller.scripts.model.User;


@Repository
public interface userRepository extends JpaRepository<User,Long>{

	Optional<User> findByName(String name);
	Optional<User> findByEmail(String email);
	List<User> findAllByOrderByCreatedDateAsc();
}
