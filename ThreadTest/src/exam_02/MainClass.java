package exam_02;
import java.awt.Toolkit;

public class MainClass {

	public static void main(String[] args) {
		Runnable beeptask = new BeepTask();
		Thread thread = new Thread(beeptask);
		thread.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("¶ò");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
