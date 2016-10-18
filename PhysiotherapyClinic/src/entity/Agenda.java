package entity;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

		private Funcionario funcionario;
		private List<Periodo> periodos;
		
		public Agenda(Funcionario funcionario2, Periodo periodo) {
			this.periodos = new ArrayList<Periodo>();
			this.funcionario = funcionario2;
			this.periodos.add(periodo);
		}
		
		public Funcionario getFuncionario(){
			return this.funcionario;
		}
		
		public void novoPeriodo(Funcionario funcionario, Periodo periodo){
			this.funcionario = funcionario;
			this.periodos.add(periodo);
		}
		
		public void removePeriodo(Periodo periodo){
			this.periodos.remove(periodo);
		}
		
		public void alteraPeriodo(Periodo de, Periodo para){
			this.periodos.remove(de);
			this.periodos.add(para);
		}
		
		@Override
		public String toString() {
			return "Agenda de: "+this.getFuncionario().getNome()+" possui: "+this.periodos.size()+" periodos cadastrados";
		}
}
