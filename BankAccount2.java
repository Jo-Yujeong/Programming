package Programming;

public class BankAccount2 {
	private int minRepository;   //�����ܱ�
	private int repository;   //�ܱ�

	public BankAccount2() {
		minRepository = 0;   //�����ܱ��� 0
	}

	public BankAccount2(int min) {
		minRepository = min;
	}

	public void deposit(int money) {
		repository += money;   //�ܱݿ� �Աݱݾ� �߰�
		System.out.println("���� �Ա�ó��: �Աݱݾ�=" + money + ", �ܱ�=" + repository);
	}

	public int withdraw(int money) throws InvalidWithdraw2 {
		if (money <= 0)   //���� ��û�ݾ��� ������ ��
			throw new InvalidWithdraw2("���� ��û �ݾ� ����");
		else if (repository - money < minRepository)   //�����ܱ� ���Ϸ� ������ ��û�� ��
			throw new InvalidWithdraw2("�ʰ���� �䱸 ����");
		else {
			repository -= money;   //�ܱݿ� ��ݱݾ� ����
			System.out.println("���� ���ó��: ����ݾ�=" + money + ", �ܱ�=" + repository);
			return minRepository;   //�����ܱ� ��ȯ
		}
	}
}
