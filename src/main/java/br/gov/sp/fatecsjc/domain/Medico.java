package br.gov.sp.fatecsjc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Medico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(unique = true)
	private int crm;
	private String nome;
	private String especialidade;
	private String crmEstado;
	
	public Medico() {
		
	}
	
	public Medico(int id, int crm, String nome, String especialidade, String crmEstado) {
		super();
		this.id = id;
		this.crm = crm;
		this.nome = nome;
		this.especialidade = especialidade;
		this.crmEstado = crmEstado;
	}
	
	
	public int getCrm() {
		return crm;
	}
	public void setCrm(int crm) {
		this.crm = crm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public String getCrmEstado() {
		return crmEstado;
	}
	public void setCrmEstado(String crmEstado) {
		this.crmEstado = crmEstado;
	}
	
	
	
 
}
