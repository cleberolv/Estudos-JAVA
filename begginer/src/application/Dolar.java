package application;
import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Dolar {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CurrencyConverter conv = new CurrencyConverter();
		
		System.out.println("Qual a atual cotação do dolar? ");
		conv.cotacaoDolar = sc.nextDouble();
		
		System.out.println("Quanto você quer comprar em reais? ");
		conv.buyReal = sc.nextDouble();
		
		System.out.println();
		
		System.out.printf("Você irá precisar de: %.2f reais", conv.conversionDolarReal());
		
		sc.close();
	}

}
