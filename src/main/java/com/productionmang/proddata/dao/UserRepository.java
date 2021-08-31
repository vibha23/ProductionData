package com.productionmang.proddata.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.productionmang.proddata.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    //User findByUsername(String username);
	@Query("SELECT u FROM User u WHERE u.emailId = ?1")
    public User findByEmail(String email);
}