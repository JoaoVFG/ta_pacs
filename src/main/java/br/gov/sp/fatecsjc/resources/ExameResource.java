package br.gov.sp.fatecsjc.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatecsjc.domain.Exame;
import br.gov.sp.fatecsjc.services.ExameService;

@RestController
@RequestMapping(value = "/exames")
public class ExameResource {

	@Autowired
	private ExameService exameService;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Exame> findById(@PathVariable Integer id){
		
		Exame exame = exameService.findById(id);
		
		return ResponseEntity.ok().body(exame);
		
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Exame>> findAll(){
		
		List<Exame> exames = exameService.findAll();
		
		return ResponseEntity.ok().body(exames);
		
	}
	
	
}
