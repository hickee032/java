package sec02_exam_create_MultiThread;

public class BeepPrintExample {

	public static void main(String[] args) {
		// 직접 생성하는 멀티스레드로 하는 3가지 방법

		// 방법1 --> 직접 생성

		Runnable beeptask = new BeepTask();
		Thread thread1 = new Thread(beeptask);

		// 방법2 --> 익명구현객체

		/*
		 * Thread thread = new Thread(new Runnable() {
		 * 
		 * @Override public void run() { Toolkit toolkit = Toolkit.getDefaultToolkit();
		 * // 싱글톤 패턴이다.
		 * 
		 * for (int i = 0; i < 5; i++) {
		 * 
		 * // .currentThread() 현재 실행중인 스레드를 알아낸다.
		 * System.out.println("for문을 실행하는 스레드 이름 : " +
		 * Thread.currentThread().getName()); // Thread-0번이 나온다.
		 * 
		 * toolkit.beep(); // 비프음
		 * 
		 * // sleep는 스레드는 잠깐 멈추는 기능을 한다. // 아래와 같이 sleep()를 사용하는 이유는 main스레드가 너무 빨리
		 * 실행되니까. try { Thread.sleep(500); // 0.5초를 멈춘다. } catch (InterruptedException
		 * e) {
		 * 
		 * e.printStackTrace(); }
		 * 
		 * }
		 * 
		 * } });
		 */

		// 방법3 --> 람다식 함수적 인터페이스 여야 사용이 가능하다.

		/*
		 * Thread thread2 = new Thread(() -> { Toolkit toolkit =
		 * Toolkit.getDefaultToolkit(); // 싱글톤 패턴이다.
		 * 
		 * for (int i = 0; i < 5; i++) {
		 * 
		 * // .currentThread() 현재 실행중인 스레드를 알아낸다.
		 * System.out.println("for문을 실행하는 스레드 이름 : " +
		 * Thread.currentThread().getName()); // Thread-0번이 나온다.
		 * 
		 * toolkit.beep(); // 비프음
		 * 
		 * // sleep는 스레드는 잠깐 멈추는 기능을 한다. // 아래와 같이 sleep()를 사용하는 이유는 main스레드가 너무 빨리
		 * 실행되니까. try { Thread.sleep(500); // 0.5초를 멈춘다. } catch (InterruptedException
		 * e) {
		 * 
		 * e.printStackTrace(); }
		 * 
		 * } });
		 */

		thread1.start();
		// thread2.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("main()의 for문을 실행하는 스레드 이름 :" + Thread.currentThread().getName());
			System.out.println("띵");

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

			thread1.start(); // thread1.start()는 절대로 재사용이 불가능하다!!
			// 재사용을 하고싶다면 아래와 같이 새로운 인스턴스를 만들어서 start()를 호출해야한다.
			beeptask = new BeepTask();
			thread1 = new Thread(beeptask);
			thread1.start();
		}
	}

}
