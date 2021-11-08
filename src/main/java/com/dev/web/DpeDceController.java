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

import com.dev.dao.DpeDceRepository;
import com.dev.entity.DpeDce;

@CrossOrigin("*")
@RestController()
@RequestMapping("/api/v1/dpeDce")
public class DpeDceController {
	@Autowired
	private DpeDceRepository dpeDceRepository;
	// build get DpeDce by ire_id REST API
    @GetMapping("/liste/{id}")
    public ResponseEntity<List<DpeDce>> getDpeDceByIdIre(@PathVariable  long id){
        List<DpeDce> dpeDceList = dpeDceRepository.findByIreId(id);
        return new ResponseEntity<>(dpeDceList, HttpStatus.OK);
    }
}
