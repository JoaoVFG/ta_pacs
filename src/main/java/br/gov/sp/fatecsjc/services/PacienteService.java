package br.gov.sp.fatecsjc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import br.gov.sp.fatecsjc.domain.Paciente;
import br.gov.sp.fatecsjc.repositories.PacienteRepository;

@Service
public class PacienteService {
	
	@Autowired
	PacienteRepository pacienteRepository;
	
	public Paciente find(Integer id) {
		
		Optional<Paciente> paciente = pacienteRepository.findById(id);
		
		return paciente.orElseThrow(() -> new br.gov.sp.fatecsjc.services.exception.ObjectNotFoundException("Paciente Não encontrado"));
		
	}
	
}
