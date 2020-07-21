package exam_06;

public class DataBox {
	private String data;
	
	public synchronized String getData() {
		if(data == null) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		String retData = data;
		System.out.println("ConsumerThread�� �д� ������ : " + retData);
		data = null;
		notify();
		return retData;
	}
	
	public synchronized void setData(String data) {
		if(this.data != null) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		
		this.data = data;      // data�� ����ִ� ��� �����͸� ����
		System.out.println("ProducerThread�� ������ ������ : " + this.data);
		notify();
	}
}
