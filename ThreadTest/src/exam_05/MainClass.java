package exam_05;

// thread 상태 : join

public class MainClass {

	public static void main(String[] args) {
		SumThread thread = new SumThread();
		thread.start();
		
//		try {
//			thread.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
//		try {
//			Thread.sleep(2);
//		} catch (InterruptedException e) {
//		}
		
		System.out.println("1~100000까지 합 : " + thread.getSum());
	}
}
