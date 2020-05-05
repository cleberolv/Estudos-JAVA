package application;

import java.util.Scanner;
import entities.Employee;


public class Funcionario {

	public static void main(String[] args) {
		
		Employee colaborador = new Employee();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o nome: ");
		colaborador.name = sc.next();
		
		System.out.printf("Digite o salario bruto: ");
		colaborador.grossSalary = sc.nextDouble();
		
		System.out.printf("Digite o imposto: ");
		colaborador.tax = sc.nextDouble();
		
		System.out.print(colaborador);
		
		System.out.println();
		System.out.println();
		
		System.out.printf("Digite o acressimo percentual: ");
		
		//Criando uma variavel para receber o valor digitado
		double percentage = sc.nextDouble();
		
		//passando como parâmetro em increaseSalary para atualização dentro do objeto colaborador
		colaborador.increaseSalary(percentage);
		
		System.out.println();
		
		System.out.println("Novo Salário: " + colaborador.grossSalary);
		
		sc.close();
	}

}
