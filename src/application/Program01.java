package application;

//SIMULA CALCULO DE ACRESCIMO E TAXAS NO SALARIO .

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Name: ");
		employee.name = sc.nextLine();
		System.out.println("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println(employee);
		
		System.out.println();
		System.out.print("Which percentage to increased salary? ");
		double porcentage = sc.nextDouble();
		employee.increasedSalary( porcentage);
		
		System.out.println();
		System.out.printf("Update data: "+ employee);
	
		
		
		
		
		sc.close();

	}

}
