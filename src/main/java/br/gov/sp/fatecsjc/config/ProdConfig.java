package br.gov.sp.fatecsjc.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;


import br.gov.sp.fatecsjc.service.test.DBServiceTeste;

public class ProdConfig {

	@Autowired
	private DBServiceTeste dbServiceTeste;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String strategy;
	
	@Bean
	public boolean instantiateDatabase() throws ParseException {
		
		
		if(!"create".equals(strategy)) {
			return false;
		}
		
		dbServiceTeste.instantiateTesteDataBase();
		
		return true;
	}
	
}
