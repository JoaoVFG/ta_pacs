package br.gov.sp.fatecsjc;


import static org.junit.Assert.assertNotEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.gov.sp.fatecsjc.domain.Exame;
import br.gov.sp.fatecsjc.services.ExameService;
import br.gov.sp.fatecsjc.services.MedicoService;
import br.gov.sp.fatecsjc.services.PacienteService;
import br.gov.sp.fatecsjc.services.PedidoExameService;
import junit.framework.TestCase;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaPacsApplicationTests extends TestCase{
	
	@Autowired
	private ExameService ExameService;
	
	@Autowired
	private PedidoExameService pedidoExameService;
	
	@Autowired
	private MedicoService medicoService;
	
	@Autowired
	private PacienteService pacienteService;
	
	
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testaBuscaExameAll() {
		List<Exame> exame = ExameService.findAll();
		int qtd = exame.size();
		assertNotEquals(0, qtd);
	}
	
	@Test
	public void testaBuscaExameId() {
		Exame exame = ExameService.findById(1);
		int id = exame.getId();
		assertEquals(1, id);
	}

}
