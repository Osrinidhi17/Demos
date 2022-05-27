package Customexceptiondemos;

public class BankService {
	int balance=5000;
	public void withdraw(int accNo , int amount) throws InvalidAccountNumberException,InsufficientBalanceException{
		
		if(accNo!=101) {
			throw new InvalidAccountNumberException("ur account number is not valid");
		}
		if(amount>balance) {
			throw new InsufficientBalanceException("ur dont have sufficient balance to withdraw money");
		}
		System.out.println("Amount withdrawn from:"+accNo);
		System.out.println("Initial balance : "+balance);
		balance = balance-amount;
		System.out.println("Amount withdrawn : "+amount);
		System.out.println("Available Balance : "+balance);
	}

}
