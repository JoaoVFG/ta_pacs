package br.gov.sp.fatecsjc.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


import br.gov.sp.fatecsjc.service.test.DBServiceTeste;

@Configuration
@Profile("test")
public class TestConfig {
	
	@Autowired
	private DBServiceTeste dbServiceTeste;
	
	@Bean
	public boolean instantiateDatabase() throws ParseException {
		
		dbServiceTeste.instantiateTesteDataBase();
		
		return true;
	}
	
}
