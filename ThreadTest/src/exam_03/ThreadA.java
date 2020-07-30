package exam_03;

public class ThreadA extends Thread {
	public ThreadA() {
		setName("ThreadA");
	}

	@Override
	public void run() {
		String name = getName();
		for(int i=1;i<5;i++) {
			System.out.println("["+name+"] : " +i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
