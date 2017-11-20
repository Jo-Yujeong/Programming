package Programming;

public class BankAccount {
	private int minRepository;   //최저잔금
	private int repository;   //잔금

	public BankAccount() {
		minRepository = 0;   //최저잔금은 0
	}

	public BankAccount(int min) {
		minRepository = min;
	}

	public void deposit(int money) {
		repository += money;   //잔금에 입금금액 추가
		System.out.println("정상 입금처리: 입금금액=" + money + ", 잔금=" + repository);
	}

	public int withdraw(int money) throws InvalidWithdraw {
		if (money <= 0)   //인출 요청금액이 음수일 때
			throw new InvalidWithdraw("인출 요청 금액 음수");
		else if (repository - money < minRepository)   //최저잔금 이하로 인출을 요청할 때
			throw new InvalidWithdraw("최저 잔금 이하로 인출 요청");
		else {
			repository -= money;   //잔금에 출금금액 차감
			System.out.println("정상 출금처리: 인출금액=" + money + ", 잔금=" + repository);
			return minRepository;   //최저잔금 반환
		}
	}
}
