package com.tom.template.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tom.template.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	public boolean existsByEmail(String email);
	Optional<User> findByEmail(String email);
	
}
