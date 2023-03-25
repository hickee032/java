package sec04_exam_ThreadName;

public class ThreadB extends Thread {

	public ThreadB() {
		this.setName("ThreadB"); //스레드 명 지정
	}
	
	@Override
	public void run() {
	System.out.println("[현재 실행중 스레드 명] - "+this.getName());
	for (int i = 0; i < 2; i++) {
		//스레드의 이름을 얻는 방법
			/*
			 * 1.정적메서드 Thread.currentThread().getName();
			 *  2.인스턴스 메서드 this.getName();
			 */
		System.out.println(this.getName()+"가 출력한 내용 - "+ i);
	}
	}
	
}

