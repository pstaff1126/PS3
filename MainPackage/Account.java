import java.util.Date;

public class Account {
	

	private int id = 0;
	private double balance = 0;
	private double annualinterestRate = 0;
	private Date dateCreated;

	Account() {
		this.id = 0;
		this.balance = 0;
	}

	Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	public void getid(int a) {
		this.id = a;
	}

	public int setid() {
		return this.id;
	}

	public double getbalance() {
		return this.balance;
	}

	public void setbalance(double a) {
		this.balance = a;
	}

	public double getannualinterestrate() {
		return this.annualinterestRate;
	}

	public void setannualinterestrate(double a) {
		this.annualinterestRate = a;
	}

	public Date getDateCreated() {
		return this.dateCreated;
	}

	public double getMonthlyInterestRate() {
		return annualinterestRate / 12;
	}

	public  void withdraw(double c) throws InsufficientFundsException {
		if (c<=this.getbalance()) {
		this.balance=this.balance-c;
		}
		else
	      {
	         double needs = c - this.balance;
	         throw new InsufficientFundsException(needs);
	      }
	   }
		
	

	public double deposit(double amount) {
		return this.balance = this.balance + amount;
	}
	public static void main(String args[]) {
	}

}
