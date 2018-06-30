package br.gov.sp.fatecsjc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import br.gov.sp.fatecsjc.domain.Paciente;
import br.gov.sp.fatecsjc.repositories.PacienteRepository;
import br.gov.sp.fatecsjc.services.exception.ObjectNotFoundException;

@Service
public class PacienteService {
	
	@Autowired
	private PacienteRepository pacienteRepository;
	
	public Paciente find(Integer id) {
		
		Optional<Paciente> paciente = pacienteRepository.findById(id);
		
		return paciente.orElseThrow(() -> new ObjectNotFoundException("Paciente não Encontrado"));
		
	}
	
	public List<Paciente> findAll(){
		return pacienteRepository.findAll();
	}
}
