package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Acount;

public class Banco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Acount acount;
		
		System.out.println("Entre com o número da conta?");
		int acountNubmer = sc.nextInt();
		
		System.out.println("Entre com o nome do titular da conta?");
		sc.nextLine();
		String acountName = sc.nextLine();
		
		System.out.println("Deseja realizar depósito inicial para essa conta? (S/N)");
		char response = sc.next().charAt(0);
		
		if (response == 'S'){
			System.out.println("Qual o depósito inicial para essa conta?");
			double initialDeposit = sc.nextDouble();
			acount = new Acount(acountNubmer, acountName, initialDeposit);
		}
		
		else {
			System.out.println("Qual o depósito inicial para essa conta?");
			acount = new Acount(acountNubmer, acountName);
		}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(acount);
		
		//depositValue
		System.out.println();
		
		System.out.println("Entre com valor de depósito para a conta:");
		double depositValue = sc.nextDouble();
		acount.deposit(depositValue);
		
		System.out.println();
		System.out.println("Dados atualizados:");
		System.out.println(acount);
		
		//withdrawValue
		System.out.println();
		
		System.out.println("Entre com valor de saque para a conta:");
		double withdrawValue = sc.nextDouble();
		acount.withdraw(withdrawValue);
		
		System.out.println();
		System.out.println("Dados atualizados:");
		System.out.println(acount);
		
		sc.close();
	}

}
