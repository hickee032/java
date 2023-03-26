package Task;

public class TaskExample {

	public static void main(String[] args) {
		

		System.out.println("☆☆☆나의 우선순위별 업무리스트☆☆☆");
		System.out.println("\n일의 이름      소요시간(분)   우선순위");
		
		Priority p1 = new Task("영어공부",30);
		p1.setPriority(2);
		p1.getPriority();
		Priority p2 = new Task("수학공부",80);
		p2.setPriority(3);
		p2.getPriority();
		Priority p3 = new Task("자바공부",150);
		p3.setPriority(1);
		p3.getPriority();
	
		
	}

}
