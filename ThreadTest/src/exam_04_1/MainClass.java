package exam_04_1;

// 두 개의 thread가 공유 객체를 사용하는 경우 문제점 해결

public class MainClass {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
	}
}
