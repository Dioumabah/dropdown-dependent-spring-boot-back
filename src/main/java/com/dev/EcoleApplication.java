package com.dev;

import java.text.ParseException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dev.dao.DpeDceRepository;
import com.dev.dao.DspeQuartierRepository;
import com.dev.dao.IreRepository;
import com.dev.entity.DpeDce;
import com.dev.entity.DspeQuartier;
import com.dev.entity.Ire;

@SpringBootApplication
public class EcoleApplication {

	public static void main(String[] args) throws ParseException {
		ApplicationContext ctx=SpringApplication.run(EcoleApplication.class, args);
		/*
		 * IreRepository ireRepository=ctx.getBean(IreRepository.class);
		 * DpeDceRepository dpeDceRepository=ctx.getBean(DpeDceRepository.class);
		 * DspeQuartierRepository
		 * dspeQuartierRepository=ctx.getBean(DspeQuartierRepository.class);
		 * 
		 * Ire ire1=ireRepository.save(new Ire("Mamou")); Ire
		 * ire2=ireRepository.save(new Ire("Kindia"));
		 * 
		 * 
		 * DpeDce dpeDce1 = dpeDceRepository.save(new DpeDce("Pita", ire1)); DpeDce
		 * dpeDce2 = dpeDceRepository.save(new DpeDce("Dalaba", ire1));
		 * 
		 * DpeDce dpeDce3 = dpeDceRepository.save(new DpeDce("Télimélé", ire2)); DpeDce
		 * dpeDce4 = dpeDceRepository.save(new DpeDce("Cayah", ire2));
		 * 
		 * 
		 * DspeQuartier dspeQuartier1 = dspeQuartierRepository.save(new
		 * DspeQuartier("Timbi Madina", dpeDce1)); DspeQuartier dspeQuartier2 =
		 * dspeQuartierRepository.save(new DspeQuartier("Porédaka", dpeDce2));
		 * 
		 * 
		 * DspeQuartier dspeQuartier3 = dspeQuartierRepository.save(new
		 * DspeQuartier("Kollet", dpeDce3)); DspeQuartier dspeQuartier4 =
		 * dspeQuartierRepository.save(new DspeQuartier("Manéah", dpeDce4));
		 */
		
		
		
	}

}
