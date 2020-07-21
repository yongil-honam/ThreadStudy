package exam_03;

public class ThreadB extends Thread{
	public ThreadB() {
		setName("ThreadB");
	}

	@Override
	public void run() {
		String name = getName();
		for(int i=100;i<105;i++) {
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
