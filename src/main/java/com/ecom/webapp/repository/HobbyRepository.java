package com.ecom.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ecom.webapp.entity.HobbyEntity;

public interface HobbyRepository extends JpaRepository<HobbyEntity, Integer> {

	@Query("select h.name from HobbyEntity h where h.personId=:personId")
	public String findHobbyByPersonId(@Param("personId") Integer personId);

}
