package Programming;
import java.util.Date;   //����ð�

public class PrintTime implements Runnable {
	private int count;

	public PrintTime(int count) {
		this.count = count;
	}

	@Override
	public void run() {
		Date current = new Date();
		while (count != 0) {   //����, ����ð�, �������̸�
			System.out.println("����: " + Thread.currentThread().getPriority()
			+ " " + current.toString() + " " + Thread.currentThread().getName());
			count--;
			try {
				Thread.sleep(1000);
				current = new Date();
			} catch (InterruptedException e) {}
		}
	}
}