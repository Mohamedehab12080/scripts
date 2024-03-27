package com.scripts.controller.scripts.repository;

import com.scripts.controller.scripts.model.Admin;
import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface adminRepository  extends JpaRepository<Admin, Long>{

	Optional<Admin> findByEmail(String email);
}
