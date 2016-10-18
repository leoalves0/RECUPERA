package entity;

import java.util.Date;

public class Terapia {
	private Enum tipoTerapia;
	private Date duracaoEstimada;
	private Date duracaoReal;
	private Funcionario funcionario;
	private Paciente paciente;
	
	public Terapia(Enum tipoTerapia, Date duracaoEstimada, Date duracaoReal, Funcionario funcionario,
			Paciente paciente) {
		this.tipoTerapia = tipoTerapia;
		this.duracaoEstimada = duracaoEstimada;
		this.duracaoReal = duracaoReal;
		this.funcionario = funcionario;
		this.paciente = paciente;
	}

	public Enum getTipoTerapia() {
		return tipoTerapia;
	}

	public void setTipoTerapia(Enum tipoTerapia) {
		this.tipoTerapia = tipoTerapia;
	}

	public Date getDuracaoEstimada() {
		return duracaoEstimada;
	}

	public void setDuracaoEstimada(Date duracaoEstimada) {
		this.duracaoEstimada = duracaoEstimada;
	}

	public Date getDuracaoReal() {
		return duracaoReal;
	}

	public void setDuracaoReal(Date duracaoReal) {
		this.duracaoReal = duracaoReal;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
}
