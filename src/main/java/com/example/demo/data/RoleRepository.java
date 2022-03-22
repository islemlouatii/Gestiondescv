package com.example.demo.data;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
Optional<Role> findByName(ERole name);
@Query("select role from Role role where role.name = :ROLE_Comerciale")
List<Role> find2ByName(@Param("ROLE_Comerciale") ERole name);
@Query("select u from User u inner join  u.roles r where r.name = :ROLE_Comerciale")
List<User> getClientByRole(@Param("ROLE_Comerciale") ERole name);

}