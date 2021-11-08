package com.dev.entity;

import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class DpeDce {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name="name")
    private String name;
    
    @ManyToOne
    @JoinColumn(name="ireId", nullable = false)
    private Ire ire;
    
    @OneToMany(mappedBy = "dpeDce", fetch=FetchType.LAZY)
    @JsonIgnore
    private List<DspeQuartier> dspeQuartiers;

	public DpeDce() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DpeDce(String name, Ire ire) {
		super();
		this.name = name;
		this.ire = ire;
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

	public Ire getIre() {
		return ire;
	}

	public void setIre(Ire ire) {
		this.ire = ire;
	}

	public Collection<DspeQuartier> getDspeQuartiers() {
		return dspeQuartiers;
	}

	public void setDspeQuartiers(List<DspeQuartier> dspeQuartiers) {
		this.dspeQuartiers = dspeQuartiers;
	}

	
    
    
}
