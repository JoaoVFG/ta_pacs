package br.gov.sp.fatecsjc.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatecsjc.domain.Paciente;
import br.gov.sp.fatecsjc.services.PacienteService;

@RestController
@RequestMapping(value = "/paciente")
public class PacienteResource {

	@Autowired
	private PacienteService pacienteService;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Paciente> find(@PathVariable Integer id){
		
		Paciente paciente = pacienteService.find(id);
		
		return ResponseEntity.ok().body(paciente);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Paciente>> findAll(){
		List<Paciente> pacientes = pacienteService.findAll();
		
		return ResponseEntity.ok().body(pacientes);
	}
	
	
}
