package exam_07;

// DemonThread 생성

public class MainClass {

	public static void main(String[] args) {
		AutoSaveDemon autoSave = new AutoSaveDemon();
		autoSave.setDaemon(true);
		autoSave.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main Thread 종료");
	}

}
