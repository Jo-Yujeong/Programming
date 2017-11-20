package Programming;
import java.util.Date;   //현재시간

public class PrintTime implements Runnable {
	private int count;

	public PrintTime(int count) {
		this.count = count;
	}

	@Override
	public void run() {
		Date current = new Date();
		while (count != 0) {   //순위, 현재시간, 스레드이름
			System.out.println("순위: " + Thread.currentThread().getPriority()
			+ " " + current.toString() + " " + Thread.currentThread().getName());
			count--;
			try {
				Thread.sleep(1000);
				current = new Date();
			} catch (InterruptedException e) {}
		}
	}
}