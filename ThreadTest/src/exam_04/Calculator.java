package exam_04;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	// ���ÿ� �� thread�� �����ϴ� �޼ҵ带 �Ӱ迵������ ����
	
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
}
