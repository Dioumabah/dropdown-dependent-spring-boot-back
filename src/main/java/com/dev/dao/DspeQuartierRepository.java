package com.dev.dao;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.dev.entity.DspeQuartier;

@CrossOrigin("*")
public interface DspeQuartierRepository extends JpaRepository<DspeQuartier, Long>{
	@Query("SELECT q FROM DspeQuartier q WHERE q.dpeDce_id = :x")
	List<DspeQuartier> findByDpeDceId(@Param("id") Long id);
}
