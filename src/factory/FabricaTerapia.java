package factory;

import java.util.Date;

import entity.Funcionario;
import entity.Paciente;
import entity.Terapia;

public class FabricaTerapia {

	public Terapia criarNovaTerapia(Enum tipoTerapia, Date duracaoEstimada, Date duracaoReal, Funcionario funcionario, Paciente paciente){
		Terapia terapia = new Terapia(tipoTerapia, duracaoEstimada, duracaoReal, funcionario, paciente);
		return terapia;
	}
}