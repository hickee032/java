package sec15_exam02_Thread_Group;

public class ThreadGroupExample {

	public static void main(String[] args) {
		
		//���� ������ ������ �׷��� ����.
		ThreadGroup mainGroup1 = Thread.currentThread().getThreadGroup();
		String threadGroup1 = mainGroup1.getName();
		System.out.println(threadGroup1);
		
		//main�׷��� ���� �׷��� �����Ѵ�.
		ThreadGroup myGroup = new ThreadGroup("myGroup");
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
		
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("Main Group�� ������ ������ �� : "+mainGroup1.activeCount());
		
		System.out.println("myGroup�� ���� �� : "+myGroup.getParent().getName());
		
		System.out.println("[ main Thread Group�� list()�޼��� ��°��");
		mainGroup1.list();
		System.out.println();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		
		//myGrou�� ���Ե� workThreadA,workThreadB�� ���ͷ�Ʈ �Ǿ� ����� - ThreadGroup���� �ñ��� ����
		myGroup.interrupt();
		
		WorkThread wt1 = new WorkThread(myGroup, "mc1");
		wt1.start();
		
		System.out.println("myGroup�� ������ ������ �� : "+myGroup.activeCount());
		System.out.println("mc1�� ����� : ");
		
	}

}
