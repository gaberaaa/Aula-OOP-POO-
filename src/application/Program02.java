package application;

//CALCULO DE MEDIA COM VALIDAÇÃO SE FOI APROVADO OU REPROVADO.

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Digite seu nome: ");
		student.name = sc.nextLine();
		
		do {
			
			System.out.println("Digite a primeira nota: ");
			student.n1 = sc.nextDouble();
			System.out.println("Digite a segunda nota: ");
			student.n2 = sc.nextDouble();
			System.out.println("Digite a terceira nota: ");
			student.n3 = sc.nextDouble();
			if(student.n1>30 || student.n2>35 || student.n3>35) {
				System.out.println("ERRO! A primeira nota comporta ate 30 e a segunda e terceira nota comporta ate 35 .");
			}
		}while(student.n1>30 || student.n2>35 || student.n3>35);
		
		if(student.total()>=60) {
			
			System.out.println(student + "\nPASS");
			
		}else {
		
		System.out.printf(student+"\nFAILED"+"\nMISSING %.2f POINTS",student.missingPont());
		
		}
		
		
		sc.close();

	}

}
