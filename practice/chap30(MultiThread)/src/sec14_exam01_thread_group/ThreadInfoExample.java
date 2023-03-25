package sec14_exam01_thread_group;

import java.util.Map;
import java.util.Set;

public class ThreadInfoExample {

	public static void main(String[] args) {
		 AutoSaveThread autoSaveThread = new AutoSaveThread();
		 autoSaveThread.setName("AutoSaveThread");
		 //���󽺷���� �����ϴ� ���ҷ� ���δ�. �ֽ����忡 �������� ���� �� �����尡 ���� �Ǹ� �ٷ� ����
		 autoSaveThread.setDaemon(true);
		 autoSaveThread.start();
		 //Map�÷��� <Ű , ��> Ű �� ���� ã�ƿ��� �˰����� ����
		 Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		 //Map�� Ű���� set�迭�� ����
		 Set<Thread> threads = map.keySet();
		 
		 for(Thread thread : threads) {
			 System.out.println("������ �̸� : "+thread.getName()
					 						+ (thread.isDaemon() ? " : DaemonThread" : " : MainThread"));
			 //ThreadGroup�� ���
			 System.out.println("\t�Ҽӱ׷� : "+thread.getThreadGroup().getName());
			 
		 }
	}

}
