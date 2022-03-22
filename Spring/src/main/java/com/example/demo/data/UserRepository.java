package com.example.demo.data;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	

	Boolean existsByUsername(String username);
	  Optional<User> findByUsername(String username);

	Boolean existsByEmail(String email);
	
	  Optional<User>findByroles(ERole roles);
//	  SELECT users.username, role.name
//	  FROM users
//	  LEFT OUTER JOIN users_roles
//	    ON users.id = users_roles.user_id
//	  LEFT OUTER JOIN role
//	    ON users_roles.role_id = role.id
//	  WHERE username = ?

	@Query("select u from User u inner join  u.roles r where r.name = :ROLE_Comerciale")
	User getClientByRole(@Param("ROLE_Comerciale") ERole name);
}
