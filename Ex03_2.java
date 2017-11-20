package Programming;

public class Ex03_2 {
	public static void main(String[] args){
		BankAccount2 ba = new BankAccount2(-100000);
			ba.deposit(100000);
			ba.withdraw(100000);
			ba.withdraw(200000);
	}
}