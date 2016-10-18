package factory;

import java.util.Date;

import entity.Funcionario;

public class FabricaFuncionario {
	
	
	public FabricaFuncionario fabricaFuncionario(String nome, Enum especialidade, Date horarioDeExpediente){
		
		FabricaFuncionario fabricaFuncionario = new FabricaFuncionario();
		return fabricaFuncionario;
	}
	
	public Funcionario criaFuncionario (String nome, Enum especialidade, Date horarioDeExpediente){
		Funcionario funcionario = Funcionario.novoFuncionario(nome, especialidade, horarioDeExpediente);
		return funcionario;
	}
		
}
