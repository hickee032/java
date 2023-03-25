package sec06_exam_thread_unsynchcronized;

public class User1 extends Thread {

	// 공유객체 선언
	private Calculator cal;

	public void setCal(Calculator cal) {
		this.cal = cal;

		this.setName("User-1"); // 스레드 이름 설정
	}

	@Override
	public void run() {
		this.cal.print();
		//공유 객체의 필드인 memory값을 100으로 변경
		this.cal.setMemory(100);
		
	}

}
