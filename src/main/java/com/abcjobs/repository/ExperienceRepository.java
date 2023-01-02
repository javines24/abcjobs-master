package com.abcjobs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.abcjobs.model.Experiences;

@Repository
public interface ExperienceRepository extends JpaRepository<Experiences, Long> {
	@Query(value = "SELECT * FROM experiences WHERE user_details_id = :udID", nativeQuery = true)
	public List<Experiences> getExperiencesByUserDetailsId(@Param("udID") String udID);
}
