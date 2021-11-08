package com.dev.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.dao.DspeQuartierRepository;
import com.dev.entity.DspeQuartier;

@CrossOrigin("*")
@RestController()
@RequestMapping("/api/v1/dspeQuartier")
public class DspeQuartierController {
	@Autowired
	private DspeQuartierRepository dspeQuartierRepository;
	
	@GetMapping("/liste/{id}")
	  public ResponseEntity<List<DspeQuartier>> getDpeDceById(@PathVariable("id") long id) {
	    List<DspeQuartier> dspeQuartierList = dspeQuartierRepository.findByDpeDceId(id);
	      return new ResponseEntity<>(dspeQuartierList, HttpStatus.OK);
	  }
}
