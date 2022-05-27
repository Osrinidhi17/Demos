package Customexceptiondemos;

public class CheckBankService {
	public static void main(String[] args) {
		BankService bankService = new BankService();
		try {
			bankService.withdraw(101, 2000);
		} catch (InvalidAccountNumberException | InsufficientBalanceException e) {
          System.out.println("Problem is : "+e.getMessage());			
		}
	}
}
