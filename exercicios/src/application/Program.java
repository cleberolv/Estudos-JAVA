package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Não esquecer de instanciar o objeto
		Rectangle rect = new Rectangle();
		
		System.out.println("Entre com a altura e a largura do triangulo: ");
		rect.height = sc.nextDouble();
		rect.width = sc.nextDouble();
	
		System.out.println(rect);
		
		sc.close();

	}
}
