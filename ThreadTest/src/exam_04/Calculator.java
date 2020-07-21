package exam_04;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	// 동시에 두 thread가 공유하는 메소드를 임계영역으로 지정
	
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
}
