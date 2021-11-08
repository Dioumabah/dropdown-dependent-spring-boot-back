package com.dev.entity;

import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Ire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name="name")
    private String name;

    @OneToMany(mappedBy = "ire", fetch=FetchType.LAZY)
    @JsonIgnore
    private List<DpeDce> dpeDces;

	public Ire() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ire(String name) {
		super();
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<DpeDce> getDpeDces() {
		return dpeDces;
	}

	public void setDpeDces(List<DpeDce> dpeDces) {
		this.dpeDces = dpeDces;
	}

	
    
    
    
    
}