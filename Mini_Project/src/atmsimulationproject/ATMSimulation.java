package atmsimulationproject;

import java.util.*;

public class ATMSimulation {
	private double balance;
	public ATMSimulation(double initialBalance) {
		this.balance = initialBalance;
	}
	
	//Method to display the balance
	public void checkBalance() {
		System.out.println("Your balance is:$" + balance);
	}
	
	//Method to deposit money
	public void deposit(double amount) {
	if(amount > 0) {
		balance += amount;
		System.out.println("Succssfully deposited $" + amount);
	}else
	{
		System.out.println("Invalid deposit amount!");
	}
	}
	
	//Method to withdraw money
	
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -=amount;
			System.out.println("Successfully withdraw $" + amount);
		} else if (amount > balance) {
			System.out.println("Insufficient balance!");
		}else {
			System.out.println("Invalid withdrawal amount!");
		}
	}
	
	public static void main(String[] args) {
		ATMSimulation atm = new ATMSimulation(500.00);
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("\nATM Menu:");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");
			System.out.println("Choose an option:");
			int choice = scanner.nextInt();
			
			switch(choice) {
			case 1:
				atm.checkBalance();
				break;
			case 2:
				System.out.println("Enter amount to deposit:");
				double depositAmount = scanner.nextDouble();
				atm.deposit(depositAmount);
				break;
			case 3:
				System.out.println("Enter amount to withdraw:");
				double withdrawAmount = scanner.nextDouble();
				atm.withdraw(withdrawAmount);
				break;
			case 4:
				System.out.println("Thank you for using the ATM. Goodbye!");
				System.exit(0);
				break;
				default:
					System.out.println("Invalid option! Please try again.");
			}
		}

	}

}
