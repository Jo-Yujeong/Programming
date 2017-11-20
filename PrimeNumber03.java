package Programming;
import java.util.LinkedList;

public class PrimeNumber03 implements Runnable {
	private int number;
	private String name;
	LinkedList<Integer> prime = new LinkedList<>();
	
	public PrimeNumber03(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println(this.name + ":");
		int j;
		for(int i = 2; i <= this.number; i++) {
			for(j = 2; j < i; j++) {
				if(i % j == 0)   //나머지가 0이면 소수가 아니다
					break;
			}
			if(j == i)   //자기자신 이외에 나눌 수 있는 수가 없으면 소수이다.
				prime.add((Integer)j);
		}
		System.out.println(prime.toString());
		prime.clear();
	}
}