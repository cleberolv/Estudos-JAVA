package application;

import java.util.List;
import java.util.Locale;
import java.util.ArrayList;
import java.util.Scanner;

import entities.TaxPayer;
import entities.Company;
import entities.Individual;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {

			System.out.println(" ");
			System.out.println("----- List -----");
			System.out.println("Tax payer #" + i + " data:");
			
			System.out.print("Individual or company (i/c)? ");
			char choose = sc.next().charAt(0);
			
			System.out.println(" ");
			System.out.print("Name: ");
			String name  = sc.next();
			
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();
			
			if(choose == 'c') {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				TaxPayer payer = new Company(name, anualIncome, numberOfEmployees);
				list.add(payer);
			}
			else {
				System.out.print("Health expenditures: ");
				Double HealtyhealthPayments = sc.nextDouble();
				TaxPayer payer = new Individual(name, anualIncome, HealtyhealthPayments);
				list.add(payer);
			}
		}
			
			double sum = 0.0;
			System.out.println();
			System.out.println("TAXES PAID:");
			
			for (TaxPayer payer : list) {
				double tax = payer.Tax();
				System.out.println(payer.getName() + ": $" + String.format("%.2f", tax));
				sum += tax;	
			}
			
			System.out.println();
			System.out.println("Total Taxes: $" + String.format("%.2f", sum));

			sc.close();
		}	
}
