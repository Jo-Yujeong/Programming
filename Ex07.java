package Programming;

public class Ex07 {
	public static void main(String[] args) {
		PrintTime p1 = new PrintTime(3);
		Thread th1 = new Thread(p1, "æ»≥Á«œººø‰!");
		th1.setPriority(Thread.MAX_PRIORITY - 1);
		th1.start();
		
		PrintTime p2 = new PrintTime(6);
		Thread th2 = new Thread(p2, "π›∞©Ω¿¥œ¥Ÿ!");
		th1.setPriority(Thread.NORM_PRIORITY-1);
		th2.start();
	}
}
