package com.dev.dao;


import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.dev.entity.DpeDce;


public interface DpeDceRepository extends JpaRepository<DpeDce, Long>{
	
	@Query("SELECT d FROM DpeDce d WHERE d.ire_id = :x")
	List<DpeDce> findByIreId(@Param("id") Long id);
}
