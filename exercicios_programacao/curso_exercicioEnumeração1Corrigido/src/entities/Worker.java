package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import application.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Departament departament;
	private List<HoursContract> contracts = new ArrayList<>();
	/*não precisamos criar o construtor de contracts pois ele está numa lista
	 * e quando for assim já criamos direto na linha com = new ArrayList<>();*/
	/*Sempre necessario fazer as associações pois iremos utilizar o objeto daqui
	 * em outras classes e vice versa*/
	
	public Worker() {
		
	}
	public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public WorkerLevel getLevel() {
		return level;
	}
	public void setLevel(WorkerLevel level) {
		this.level = level;
	}
	public Double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public Departament getDepartament() {
		return departament;
	}
	public void setDepartament(Departament departament) {
		this.departament = departament;
	}
	public List<HoursContract> getContracts() {
		return contracts;
	}
	
	/* devemos sempre numa lista retirar o set dela pois não pode haver alteração
	 * nelas além dos add's, e removes que criamos
	public void setContracts(List<HoursContract> contracts) {
		this.contracts = contracts;
	}
	*/
	public void addContract(HoursContract contract){
		contracts.add(contract);
	
	}
	public void removeContract(HoursContract contract){
		contracts.remove(contract);
	}
	
	/*Criamos uma função de adicionar ou remover pois iremos dizer ao programa
	 * quando iremos querer que adicionemos essas inforamações  a lista*/
	
	public double income (int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		/*Usamos para capturar na variavel cal as datas*/
		for (HoursContract c : contracts) {
			// a caractere 'c' é só uma variavel sendo criada para armazenar as informações que quer
				cal.setTime(c.getDate());
				int c_year = cal.get(Calendar.YEAR);
				// Ano a ser salvo na variavel c_year
				int c_month = cal.get(Calendar.MONTH);
				// Mês a ser salvo na variavel c_month
				if (year == c_year && month == c_month) {
					sum += c.totalValue();
				}
		}
		return sum;
	}
	
}
