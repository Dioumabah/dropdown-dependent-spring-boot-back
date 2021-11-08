package com.dev.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.entity.Ire;


public interface IreRepository extends JpaRepository<Ire, Long>{
	List<Ire> findByNameContaining(String name);
}
