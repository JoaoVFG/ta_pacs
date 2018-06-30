package br.gov.sp.fatecsjc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatecsjc.domain.PedidoExame;
import br.gov.sp.fatecsjc.repositories.PedidoExameRepository;
import br.gov.sp.fatecsjc.services.exception.ObjectNotFoundException;

@Service
public class PedidoExameService {

	@Autowired
	private PedidoExameRepository pedidoExameRepository;
	
	public PedidoExame findById(Integer id) {
		
		Optional<PedidoExame> pedidoExame = pedidoExameRepository.findById(id);
		
		return pedidoExame.orElseThrow(() -> new ObjectNotFoundException("Pedido de Exame não Encontrado"));
		
	}
	
	public List<PedidoExame> findAll(){
		return pedidoExameRepository.findAll();
	}
}
