package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import entity.Agenda;
import entity.Data;
import entity.Funcionario;
import entity.Paciente;
import entity.Periodo;
import enumerate.Especialidade;
import factory.FabricaPaciente;

public class TestePacienteSimples {

	@Test
	public void testPaciente() {
		Paciente paciente = Paciente.novoPaciente("Gabriel", "123.456.78-45");
		assertEquals("Gabriel",paciente.getNome());
		assertEquals("123.456.78-45",paciente.getCpf());
	}
	
	
	@Test
	public void testFabrica(){
		FabricaPaciente fabricaPaciente = FabricaPaciente.novaFabricaPaciente();
		Paciente paciente2 = fabricaPaciente.CriaPaciente("Joao", "123");
		assertEquals("Joao",paciente2.getNome());
		assertEquals("123",paciente2.getCpf());
	}
	
	
	@Test
	public void testAgenda(){
		
		
		Date agora = new Date();
		final DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		final String dataFormatada = df.format(agora);
		System.out.println(dataFormatada);
		
		
		Periodo periodo = new Periodo(Data.nova(8, 13), Data.nova(9, 13));	
		Periodo periodo1 = new Periodo(Data.nova(10, 13), Data.nova(11, 13));	
		Periodo periodo2 = new Periodo(Data.nova(14, 14), Data.nova(15, 14));	
		Periodo periodo3 = new Periodo(Data.nova(16, 14), Data.nova(17, 14));	
		Periodo periodo4 = new Periodo(Data.nova(18, 14), Data.nova(19, 14));	
		
		Funcionario funcionario = Funcionario.novoFuncionario("Tiago", Especialidade.ACUPUNTURA, agora);
		Agenda agenda = new Agenda(funcionario, periodo);
		System.out.println(agenda);

		agenda.novoPeriodo(funcionario, periodo1);
		System.out.println(agenda);
		
		agenda.novoPeriodo(funcionario, periodo2);
		System.out.println(agenda);
		
		agenda.novoPeriodo(funcionario, periodo3);
		System.out.println(agenda);
		
		agenda.novoPeriodo(funcionario, periodo4);
		System.out.println(agenda);
		assertNotNull(agenda);
		assertEquals(agenda.getFuncionario().getNome(), "Tiago");
	}

}
