package Programming;

public class BankAccount {
	private int minRepository;   //�����ܱ�
	private int repository;   //�ܱ�

	public BankAccount() {
		minRepository = 0;   //�����ܱ��� 0
	}

	public BankAccount(int min) {
		minRepository = min;
	}

	public void deposit(int money) {
		repository += money;   //�ܱݿ� �Աݱݾ� �߰�
		System.out.println("���� �Ա�ó��: �Աݱݾ�=" + money + ", �ܱ�=" + repository);
	}

	public int withdraw(int money) throws InvalidWithdraw {
		if (money <= 0)   //���� ��û�ݾ��� ������ ��
			throw new InvalidWithdraw("���� ��û �ݾ� ����");
		else if (repository - money < minRepository)   //�����ܱ� ���Ϸ� ������ ��û�� ��
			throw new InvalidWithdraw("���� �ܱ� ���Ϸ� ���� ��û");
		else {
			repository -= money;   //�ܱݿ� ��ݱݾ� ����
			System.out.println("���� ���ó��: ����ݾ�=" + money + ", �ܱ�=" + repository);
			return minRepository;   //�����ܱ� ��ȯ
		}
	}
}
