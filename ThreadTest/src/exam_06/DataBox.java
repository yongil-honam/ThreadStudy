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
		System.out.println("ConsumerThread가 읽는 데이터 : " + retData);
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
		
		this.data = data;      // data가 비워있는 경우 데이터를 저장
		System.out.println("ProducerThread가 생성한 데이터 : " + this.data);
		notify();
	}
}
