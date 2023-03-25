package sec02_exam_create_MultiThread;

import java.awt.Toolkit;

//Runnable 인터페이스를  직접구현 -- FunctionalInterface 함수적 인터페이스
public class BeepTask implements Runnable {

	@Override
	public void run() {

		Toolkit toolkit = Toolkit.getDefaultToolkit(); // 싱글톤 패턴이다.

		for (int i = 0; i < 5; i++) {

			// .currentThread() 현재 실행중인 스레드를 알아낸다.
			System.out.println("for문을 실행하는 스레드 이름 : " + Thread.currentThread().getName()); //Thread-0번이 나온다.

			toolkit.beep(); // 비프음

			// sleep는 스레드는 잠깐 멈추는 기능을 한다.
			// 아래와 같이 sleep()를 사용하는 이유는 main스레드가 너무 빨리 실행되니까.
			try {
				Thread.sleep(500); // 0.5초를 멈춘다.
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}

	}
}
