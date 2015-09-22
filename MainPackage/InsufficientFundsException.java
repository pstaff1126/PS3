public class InsufficientFundsException extends Exception {
	private double a;

	public InsufficientFundsException(double amount) {
		this.a = amount;
	}
	

	public double getAmount() {
		return a;
	}
	public static void main(String args[]) {
		
	}
}
