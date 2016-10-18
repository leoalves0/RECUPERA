package entity;

import java.util.Date;

public class Funcionario {
	private String nome;
	private Enum  especialidade;
	private Date horarioDeExpediente;
	
	/*private*/ public Funcionario(String nome, Enum especialidade, Date horarioDeExpediente) {
		this.nome = nome;
		this.especialidade = especialidade;
		this.horarioDeExpediente = horarioDeExpediente;
		
	}
	
	public static Funcionario novoFuncionario(String nome, Enum especialidade, Date horarioDeExpediente){
		Funcionario funcionario = new Funcionario(nome, null, null);
		return funcionario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Enum getEspecialidade() {
	return especialidade;
	}
	public void setEspecialidade(Enum especialidade) {
	this.especialidade = especialidade;
	}

	public Date getHorarioDeExpediente() {
		return horarioDeExpediente;
	}

	public void setHorarioDeExpediente(Date horarioDeExpediente) {
		this.horarioDeExpediente = horarioDeExpediente;
	}
}
