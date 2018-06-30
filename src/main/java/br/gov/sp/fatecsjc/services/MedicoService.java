package br.gov.sp.fatecsjc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatecsjc.domain.Medico;
import br.gov.sp.fatecsjc.repositories.MedicoRepository;
import br.gov.sp.fatecsjc.services.exception.ObjectNotFoundException;

@Service
public class MedicoService {

	@Autowired
	private MedicoRepository medicoRepository;
	
	public Medico findById(Integer id) {
		
		Optional<Medico> medico = medicoRepository.findById(id);
		
		return medico.orElseThrow(() -> new ObjectNotFoundException("Medico não encontrado"));
		
	}
	
	
	public List<Medico> findAll(){
		return medicoRepository.findAll();
	}
	
}
