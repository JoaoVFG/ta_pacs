package br.gov.sp.fatecsjc.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PedidoExame {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String Data;

	@ManyToOne
	@JoinColumn(name = "paciente_id")
	private Paciente paciente;

	@ManyToOne
	@JoinColumn(name = "exame_id")
	private Exame exame;

	@ManyToOne
	@JoinColumn(name = "medico_id")
	private Medico medico;
	
	
	public PedidoExame() {
		
	}
	
	public PedidoExame(Integer id, String data, Paciente paciente, Exame exame, Medico medico) {
		super();
		this.id = id;
		Data = data;
		this.paciente = paciente;
		this.exame = exame;
		this.medico = medico;
	}


	public String getData() {
		return Data;
	}

	public void setData(String data) {
		Data = data;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Exame getExame() {
		return exame;
	}

	public void setExame(Exame exame) {
		this.exame = exame;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	
	

	
	
}
