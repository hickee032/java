package sec14_exam01_thread_group;

import java.util.Map;
import java.util.Set;

public class ThreadInfoExample {

	public static void main(String[] args) {
		 AutoSaveThread autoSaveThread = new AutoSaveThread();
		 autoSaveThread.setName("AutoSaveThread");
		 //데몬스레드는 보조하는 역할로 쓰인다. 주스레드에 종속적인 관계 주 스레드가 종료 되면 바로 종료
		 autoSaveThread.setDaemon(true);
		 autoSaveThread.start();
		 //Map컬렉션 <키 , 값> 키 로 값을 찾아오는 알고리즘의 형태
		 Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		 //Map의 키값을 set계열로 변형
		 Set<Thread> threads = map.keySet();
		 
		 for(Thread thread : threads) {
			 System.out.println("스레드 이름 : "+thread.getName()
					 						+ (thread.isDaemon() ? " : DaemonThread" : " : MainThread"));
			 //ThreadGroup을 출력
			 System.out.println("\t소속그룹 : "+thread.getThreadGroup().getName());
			 
		 }
	}

}
