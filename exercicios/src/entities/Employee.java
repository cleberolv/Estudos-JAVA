package entities;

public class Employee {
	
	public String name; 
	public Double grossSalary;
	public Double tax;
	
	public double NetSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(Double percentage){
		grossSalary += grossSalary * percentage / 100.0 - tax;
	}
	
	public String toString() {
		return "Nome: " + name + "\n" + "Salário líquido - R$:" + NetSalary();
	}
	
}
