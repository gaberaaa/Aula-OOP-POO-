package application;
//CALCULO DE CONVERSÃO "QUALQUER MOEDA" PARA DOLAR.
import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("What is the dollar price?");
		double dollarPrice = sc.nextDouble();
		System.out.println("How many dollar will be bought? ");
		double dolarQuantity = sc.nextDouble();
		double dQ	 = CurrencyConverter.dollarBought(dolarQuantity,dollarPrice);
		System.out.printf("Amount to be paid in reais = %.2f",dQ);
		
		sc.close();

	}

}
