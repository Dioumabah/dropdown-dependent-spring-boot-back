package com.dev.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dev.dao.IreRepository;
import com.dev.entity.Ire;

@CrossOrigin("*")
@RestController()
@RequestMapping("/api/v1/ires")
public class IreController {
	@Autowired
	private IreRepository ireRepository;
	
	@GetMapping
	public ResponseEntity<List<Ire>> listCourses(@RequestParam(required = false) String name){
		try {
		      List<Ire> ires = new ArrayList<Ire>();

		      if (name == null)
		        ireRepository.findAll().forEach(ires::add);
		      else
		        ireRepository.findByNameContaining(name).forEach(ires::add);

		      if (ires.isEmpty()) {
		        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		      }

		      return new ResponseEntity<>(ires, HttpStatus.OK);
		    } catch (Exception e) {
		      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		    }
	}
	
}
