package br.gov.sp.fatecsjc.service.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatecsjc.repositories.ExameRepository;
import br.gov.sp.fatecsjc.repositories.MedicoRepository;
import br.gov.sp.fatecsjc.repositories.PacienteRepository;
import br.gov.sp.fatecsjc.repositories.PedidoExameRepository;

@Service
public class DBServiceTeste {
	
	@Autowired
	private MedicoRepository medicoRepository;
	
	@Autowired
	private PacienteRepository pacienteRepository;
	
	@Autowired
	private ExameRepository exameRepository;
	
	@Autowired
	private PedidoExameRepository pedidoExameRepository;

	public void instantiateTesteDataBase() {
		
		
		
		System.out.println("FUNCIONOU");
		System.out.println("Realizar Inserções de Banco Aqui");
		
	}
}
