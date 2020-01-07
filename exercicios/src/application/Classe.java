package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Classe {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student aluno = new Student ();
		
		System.out.printf("Digite o nome do aluno: ");
		aluno.name = sc.next();
		
		System.out.printf("Digite a nota 1: ");
		aluno.grade1 = sc.nextDouble();
		
		System.out.printf("Digite a nota 2: ");
		aluno.grade2 = sc.nextDouble();
		
		System.out.printf("Digite a nota 3: ");
		aluno.grade3 = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("Hey, " + aluno.name + " sua média foi: " + aluno.calculoDeMedia());
		
		System.out.println();
		
		if (aluno.calculoDeMedia() < 60) {
			System.out.println(aluno.name + ", com sua nota: (" + aluno.media  + ") você está reprovado, estude mais!");
			System.out.printf("Faltaram %.2f pontos para o objetivo (60.0) ser alcançado. %n", aluno.missingPoints());
		}
		else if (aluno.calculoDeMedia() <= 80){
			System.out.println(aluno.name + ", com sua boa nota: (" + aluno.media  + ") você está aprovado, mas pode melhorar.");
		}
		else {
			System.out.println(aluno.name + ", com sua nota excelente: (" + aluno.media  + ") você está mais que aprovado, parabéns!!");
		}
		
		sc.close();
	}

}
