package application;

import java.util.Locale;
import java.util.Scanner;
import entities.AccountData;





// SIMULANDO UMA INTERFACE DE BANCO.

public class Program04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		AccountData account;
		
				
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter accout holder: ");
		sc.nextLine();
		String accountHolder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n) ? ");
		char response = sc.next().charAt(0);
		if(response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new AccountData(accountNumber,accountHolder,initialDeposit);
		}else {
			account = new AccountData(accountNumber, accountHolder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Update account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Update account data: ");
		System.out.println(account);

			
		
	
		
		
		sc.close();

	}

}
