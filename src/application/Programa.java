package application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Account;
import Exceptions.DomainException;

public class Programa {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	
	
		
		
		System.out.println("----Enter account data----");
	    System.out.print("Number: ");
	    Integer number = sc.nextInt();
	    System.out.print("Holder: ");
	    String holder = sc.next();
	    System.out.print("Inicial balance: ");
	    Double balance = sc.nextDouble();
	    System.out.print("Withdraw limit:");
	    Double withdrawLimit = sc.nextDouble();
	    
	    
		Account account = new Account(number, holder , balance , withdrawLimit );
		
		
		try {
	    System.out.print("Enter amount for withdraw: ");
	    Double amount = sc.nextDouble();
	    account.withdraw(amount);
		}
	    
	   catch (DomainException e) {
		   System.out.println("Withdraw error: " + e.getMessage());
	    }
		
		System.out.println("New Balance: " + String.format("%.2f",account.getBalance()));
		
		
      sc.close();
	}

}
