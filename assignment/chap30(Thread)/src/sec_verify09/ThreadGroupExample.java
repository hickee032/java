package sec_verify09;

public class ThreadGroupExample {

	public static void main(String[] args) {
		//ThreadGroup mainG = Thread.currentThread().getThreadGroup();
		//String MainT = mainG.getName();
		
		System.out.println("현재 실행중인 Thread명 : " + Thread.currentThread().getName() + 
							"\t\t\t\t그룹 Thread명 : "+ Thread.currentThread().getThreadGroup().getName() + 
							"\t\t조상 Thread명 : " + Thread.currentThread().getThreadGroup().getParent().getName());
		ThreadGroup AGroup = new ThreadGroup("AGroup");
		UnitThread Au = new UnitThread(AGroup, "AGroup_Thread1");
		ThreadGroup AaGroup = new ThreadGroup(AGroup,"A_SubGroup");
		UnitThread Aau = new UnitThread(AaGroup, "A_SubGroupThread1");
		Au.start();
		Aau.start();
		
		
		ThreadGroup BGroup = new ThreadGroup("BGroup");
		UnitThread Bu = new UnitThread(BGroup, "BGroup_Thread1");
		ThreadGroup BbGroup = new ThreadGroup(BGroup,"B_SubGroup");
		UnitThread Bbu = new UnitThread(BbGroup, "B_SubGroupThread1");
		Bu.start();
		Bbu.start();
		
		Au.interrupt();
		Aau.interrupt();
		Bu.interrupt();
		Bbu.interrupt();
		

	}

}
