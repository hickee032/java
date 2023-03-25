package sec15_exam02_Thread_Group;

public class ThreadGroupExample {

	public static void main(String[] args) {
		
		//현재 실행중 스레드 그룹을 얻어낸다.
		ThreadGroup mainGroup1 = Thread.currentThread().getThreadGroup();
		String threadGroup1 = mainGroup1.getName();
		System.out.println(threadGroup1);
		
		//main그룹의 하위 그룹을 생성한다.
		ThreadGroup myGroup = new ThreadGroup("myGroup");
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
		
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("Main Group의 실행중 스레드 수 : "+mainGroup1.activeCount());
		
		System.out.println("myGroup의 조상 명 : "+myGroup.getParent().getName());
		
		System.out.println("[ main Thread Group의 list()메서드 출력결과");
		mainGroup1.list();
		System.out.println();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		
		//myGrou에 포함된 workThreadA,workThreadB가 인터럽트 되어 종료됨 - ThreadGroup쓰는 궁극적 이유
		myGroup.interrupt();
		
		WorkThread wt1 = new WorkThread(myGroup, "mc1");
		wt1.start();
		
		System.out.println("myGroup의 실행중 스레드 수 : "+myGroup.activeCount());
		System.out.println("mc1의 조상명 : ");
		
	}

}
