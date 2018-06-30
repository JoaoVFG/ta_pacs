package br.gov.sp.fatecsjc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatecsjc.domain.Exame;
import br.gov.sp.fatecsjc.repositories.ExameRepository;
import br.gov.sp.fatecsjc.services.exception.ObjectNotFoundException;

@Service
public class ExameService {

	@Autowired
	private ExameRepository exameRepository;
	
	public Exame findById(Integer id) {
		
		Optional<Exame> exame = exameRepository.findById(id);
		
		return exame.orElseThrow(() -> new ObjectNotFoundException("Exame não encontrado"));
	}
	
	public List<Exame> findAll() {
		return exameRepository.findAll();
	}
	
}
