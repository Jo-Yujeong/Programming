package Programming;

public class Ex03 {
	public static void main(String[] args) throws InvalidWithdraw {
		BankAccount ba = new BankAccount(-100000);
			ba.withdraw(500000);
	}
}
