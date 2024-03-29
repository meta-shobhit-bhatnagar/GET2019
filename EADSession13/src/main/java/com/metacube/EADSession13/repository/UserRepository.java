package com.metacube.EADSession13.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.metacube.EADSession13.model.commands.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	public List<User> findByUsernameContainingIgnoreCase(String searchString);

}
