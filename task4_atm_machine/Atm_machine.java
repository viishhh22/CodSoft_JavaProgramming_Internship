import java.util.Scanner;

public class Atm_machine {

	    private double balance;

	    public Atm_machine(double initialBalance) {
	        balance = initialBalance;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: $" + amount);
	            System.out.println("New Balance: $" + balance);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn: $" + amount);
	            System.out.println("New Balance: $" + balance);
	        } else {
	            System.out.println("Invalid withdrawal amount or insufficient funds.");
	        }
	    }

	    public void transfer(Atm_machine recipient, double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            recipient.balance += amount;
	            System.out.println("Transferred: $" + amount + " to recipient.");
	            System.out.println("New Balance: $" + balance);
	        } else {
	            System.out.println("Invalid transfer amount or insufficient funds.");
	        }
	    }
public static void main(String[] args) {
		
	        Scanner scanner = new Scanner(System.in);
	        Atm_machine sender = new Atm_machine(1000.0);
	        Atm_machine recipient = new Atm_machine(500.0);

	        System.out.println("Welcome to the ATM!");
	        while (true) {
	            System.out.println("\nSelect an option:");
	            System.out.println("1. Check Balance");
	            System.out.println("2. Deposit Funds");
	            System.out.println("3. Withdraw Funds");
	            System.out.println("4. Transfer Funds");
	            System.out.println("5. Exit");

	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.println("Your Balance: $" + sender.getBalance());
	                    break;
	                case 2:
	                    System.out.print("Enter deposit amount: $");
	                    double depositAmount = scanner.nextDouble();
	                    sender.deposit(depositAmount);
	                    break;
	                case 3:
	                    System.out.print("Enter withdrawal amount: $");
	                    double withdrawalAmount = scanner.nextDouble();
	                    sender.withdraw(withdrawalAmount);
	                    break;
	                case 4:
	                    System.out.print("Enter transfer amount: $");
	                    double transferAmount = scanner.nextDouble();
	                    sender.transfer(recipient, transferAmount);
	                    break;
	                case 5:
	                    System.out.println("Thank you for using the ATM!");
	                    scanner.close();
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please select a valid option.");
	            }
	        }
	    }
}



