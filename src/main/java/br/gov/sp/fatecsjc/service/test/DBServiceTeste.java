package br.gov.sp.fatecsjc.service.test;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatecsjc.domain.Exame;
import br.gov.sp.fatecsjc.domain.Medico;
import br.gov.sp.fatecsjc.domain.Paciente;
import br.gov.sp.fatecsjc.domain.PedidoExame;
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

		Medico med1 = new Medico(null, 17618, "ALOISIO CARLOS FERRAS", "OFTALMOLOGISTA", "SP");
		Medico med2 = new Medico(null, 88799, "ANTONIO CARLOS BRANDAO DE MELO", "ORTOPEDIA E TRAUMOLOGIA", "SP");
		Medico med3 = new Medico(null, 16768, "CARLOS ALBERTO DE QUEIROZ CARVALHO", "DERMATOLOGIA", "SP");
		Medico med4 = new Medico(null, 7778, "CARLOS ALBERTO LOPES MARTINS", "PEDIATRIA", "SP");
		medicoRepository.saveAll(Arrays.asList(med1,med2,med3,med4));
		
		Paciente pac1 = new Paciente(null,101, "JOAO VITOR", "1995-10-30");
		Paciente pac2 = new Paciente(null,100, "LEONARDO CASTRO PEDREIRA", "1996-07-28");
		Paciente pac3 = new Paciente(null,102, "WILLIAM GONCALVES", "1996-05-05");
		Paciente pac4 = new Paciente(null,103, "LILIA", "1990-07-05");
		Paciente pac5 = new Paciente(null,104, "RICARDO", "1980-09-30");
		Paciente pac6 = new Paciente(null,105, "GIONATA", "1994-06-08");
		Paciente pac7 = new Paciente(null,106, "MAFALDA", "1966-06-06");
		pacienteRepository.saveAll(Arrays.asList(pac1,pac2,pac3,pac4,pac5,pac6,pac7));
		
		Exame exa1 = new Exame(null,"RESSONANCIA MAGNETICA");
		Exame exa2 = new Exame(null,"MAMOGRAFIA");
		Exame exa3 = new Exame(null,"ULTRASSOM");
		Exame exa4 = new Exame(null,"ANGIOGRAFIA");
		Exame exa5 = new Exame(null,"ARTERIOGRAFIA");
		exameRepository.saveAll(Arrays.asList(exa1,exa2,exa3,exa4,exa5));
		
		PedidoExame pedexa1 = new PedidoExame(null, "2018-03-16 21:02", pac1, exa1, med2);
		PedidoExame pedexa2 = new PedidoExame(null, "2018-03-16 21:02", pac1, exa1, med2);
		PedidoExame pedexa3 = new PedidoExame(null, "2018-03-16 21:02", pac2, exa3, med4); 
		PedidoExame pedexa4 = new PedidoExame(null, "2018-03-16 21:02", pac3, exa5, med1);
		PedidoExame pedexa5 = new PedidoExame(null, "2018-03-16 21:02", pac3, exa1, med2); 
		PedidoExame pedexa6 = new PedidoExame(null, "2018-03-16 21:02", pac4, exa2, med3);
		PedidoExame pedexa7 = new PedidoExame(null, "2018-03-16 21:02", pac4, exa1, med2);
		PedidoExame pedexa8 = new PedidoExame(null, "2018-03-16 21:02",	pac4, exa5, med3);
		PedidoExame pedexa9 = new PedidoExame(null, "2018-03-16 21:02", pac7, exa2, med4);
		PedidoExame pedexa10 = new PedidoExame(null, "2018-03-16 21:02", pac7, exa4, med4);
		pedidoExameRepository.saveAll(Arrays.asList(pedexa1,pedexa2,pedexa3,pedexa4,pedexa5,pedexa6,pedexa7,pedexa8,pedexa9,pedexa10));
		
		
		
	}
}
