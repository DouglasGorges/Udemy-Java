package application;

import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(">> Welcome back to DG Bank! <<");
		System.out.println();
		System.out.println("Please, follow next instructions to create a new account:");
		System.out.println("Holder: ");
		String name = sc.nextLine();
		System.out.println("Account Number: ");
		int accountNumber = sc.nextInt();
		System.out.println("Initial deposit: ");
		double amount = sc.nextDouble();
		Account account = new Account(name, accountNumber, amount);

		System.out.println();
		System.out.println(account);
		System.out.println();

		System.out.println("Enter how much money do you want to deposit: US$");
		account.addAmount(sc.nextDouble());

		System.out.println();
		System.out.println(account);
		System.out.println();

		System.out.println("Enter how much money do you want to get back: US$");
		account.removeAmount(sc.nextDouble());

		System.out.println();
		System.out.println(account);
		System.out.println();

		System.out.println("Thank you to be our customer! See you soon.");
	}

}
