package sec01_exam_create_SingleThread;

import java.awt.Toolkit;

public class BeepPrintExample {

	// main 스레드는 JVM이 실행
	public static void main(String[] args) {

		/*
		 * 아래코드는 싱글 스레드에서 돌아가는 작업이므로 비프음을 5번 알리고 나서 띵 이라는 문자를 출력한다. 하지만 우리가 원하는 것은 띵과
		 * 문자열이 출력되면서 같이 비프음도 출력되는 것을 원한다. 이것이 싱글 스레드의 단점이다. 순차적이라는 것이다.이것을 멀티 스레드로 바꿔가는
		 * 것이 우리가 스레드 장에서 할일이다. 비프음을 5번 반복해서 소리나게함 Toolkit은 AWT(abstract window toolkit
		 * )을 상속 받은 추상클래스 그중 GUI관련 메서드들이 있다. getDefaultToolkit()기본적인 메서드를 구현해 놓은 메서드
		 */

		Toolkit toolkit = Toolkit.getDefaultToolkit(); // 싱글톤 패턴이다.

		for (int i = 0; i < 5; i++) {

			// .currentThread() 현재 실행중인 스레드를 알아낸다.
			System.out.println("for문을 실행하는 스레드 이름 : " + Thread.currentThread().getName());

			toolkit.beep();

			// sleep는 스레드는 잠깐 멈추는 기능을 한다.
			// 아래와 같이 sleep()를 사용하는 이유는 main스레드가 너무 빨리 실행되니까.
			try {
				Thread.sleep(500); // 0.5초를 멈춘다.
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}

		for (int i = 0; i < 5; i++) {
			System.out.println("띵");

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
