package Task;

public class TaskExample {

	public static void main(String[] args) {
		

		System.out.println("�١١ٳ��� �켱������ ��������Ʈ�١١�");
		System.out.println("\n���� �̸�      �ҿ�ð�(��)   �켱����");
		
		Priority p1 = new Task("�������",30);
		p1.setPriority(2);
		p1.getPriority();
		Priority p2 = new Task("���а���",80);
		p2.setPriority(3);
		p2.getPriority();
		Priority p3 = new Task("�ڹٰ���",150);
		p3.setPriority(1);
		p3.getPriority();
	
		
	}

}
