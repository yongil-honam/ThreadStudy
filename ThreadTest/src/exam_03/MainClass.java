package exam_03;

public class MainClass {

	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		threadA.start();

		ThreadB threadB = new ThreadB();
		threadB.start();
		
		String name = Thread.currentThread().getName();
		for(int i = 0; i < 5 ; i++) {
			System.out.println("["+ name + "] : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
