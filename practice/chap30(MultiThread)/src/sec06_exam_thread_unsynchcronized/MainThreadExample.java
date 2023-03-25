package sec06_exam_thread_unsynchcronized;

public class MainThreadExample {

	public static void main(String[] args) {

		Calculator cal = new Calculator();

		// 문제가 무엇인가 ? 출력결과를 보면 User2가 변경한 값으로 다 출력
		// 과연 User1 스레드는 원하는 결과 값이다.
		// 이문제는 어떻게 해결하는 방법은? -->동기화를 해야한다.

		/*
		 * synchronized 제어자를 붙여줌으로써 객체 잠금(메서드 잠금)이 일어나 데이터의 정확성과 신뢰성을 보장한다.
		 */

		User1 user1 = new User1();
		user1.setCal(cal);
		user1.start();

		User2 user2 = new User2();
		user2.setCal(cal);
		user2.start();

	}

}
