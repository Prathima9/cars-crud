package com.sa.poc.carscrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sa.poc.carscrud.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByName(String userName);

}
