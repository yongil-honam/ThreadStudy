package exam_08;

import java.util.Map;
import java.util.Set;

public class MainClass {
	public static void main(String[] arg) {
		AutoSaveDemon autoSave = new AutoSaveDemon();
		autoSave.setName("AutoSaveDemon");
		autoSave.setDaemon(true);
		autoSave.start();
		
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		Set<Thread> threads = map.keySet();
		for(Thread thread : threads) {
			System.out.print("Name : " + thread.getName() + ((thread.isDaemon()? "(Demon)" : "(main)")));
			System.out.println(" Group : " + thread.getThreadGroup().getName());
		}
		
	}
}
