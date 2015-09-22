import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class AccountTest {

	public static void test() throws InsufficientFundsException {

		Account a1 = new Account(1122, 20000);

		a1.setannualinterestrate(.045);
		a1.withdraw(2500);
		a1.deposit(3000);
		System.out.println("The balance is " + a1.getbalance());
		System.out.println("The monthly interest is " + a1.getMonthlyInterestRate());
		System.out.println("The date created " + a1.getDateCreated());

		Account b = new Account(1234, 5000);

		b.withdraw(60000);
		
	}

	public static void main(String args[]) throws InsufficientFundsException {
		test();
	}
}