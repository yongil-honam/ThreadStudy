package exam_06;

// Producer, consumer ����
// notify(), wait()�� �̿�

public class MainClass {

	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		
		ProducerThread proThread = new ProducerThread(dataBox);	
		ConsumerThread conThread = new ConsumerThread(dataBox);
		
		proThread.start();
		conThread.start();
		
	}
}
