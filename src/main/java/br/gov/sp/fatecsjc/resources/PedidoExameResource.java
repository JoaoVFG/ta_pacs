package br.gov.sp.fatecsjc.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatecsjc.domain.PedidoExame;
import br.gov.sp.fatecsjc.services.PedidoExameService;

@RestController
@RequestMapping(value = "/pedidoexame")
public class PedidoExameResource {
	
	@Autowired
	private PedidoExameService pedidoExameService;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<PedidoExame> findById(@PathVariable Integer id){
		
		PedidoExame pedidoExame = pedidoExameService.findById(id);
		
		return ResponseEntity.ok().body(pedidoExame);
		
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<PedidoExame>> findAll(){
		
		List<PedidoExame> pedidosExame = pedidoExameService.findAll();
		
		return ResponseEntity.ok().body(pedidosExame);
	}
	
}
