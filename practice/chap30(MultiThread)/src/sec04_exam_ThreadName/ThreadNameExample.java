package sec04_exam_ThreadName;

public class ThreadNameExample {

	public static void main(String[] args) {
		//현재 실행중인 스레드를 얻는 방법
		Thread thread = Thread.currentThread();
		
		//스레드의 이름을 얻는 방법
		String curThreadName = thread.getName();
		System.out.println("[시작 스레드]- "+curThreadName);
		
		Thread threadA = new ThreadA();
		System.out.println("[ThreadA를 생성한 스레드 이름]- "+Thread.currentThread().getName());
		System.out.println("[main스레드가 ThreadA의 이름을 가져온것]- "+threadA.getName());
		threadA.start();
		
		Thread threadB = new ThreadB();
		System.out.println("[ThreadA를 생성한 스레드 이름]- "+Thread.currentThread().getName());
		System.out.println("[main스레드가 ThreadB의 이름을 가져온것]- "+threadB.getName());
		threadB.start();
		System.out.println("[main()의 마지막 스레드 이름]- "+Thread.currentThread().getName());
		/*
		 * 명심할것은 위의 코드는 메인스레드가 실행하는 것이다. 아울러 ThreadA와 ThreadB를 생성한것 역시도 메인스레드이다. 
		 * 단지 ThreadA와 ThreadB가 하는 작업은 run메서드에 코딩되어 있는 내용만 샐행하는 것뿐이다. 
		 * 이 부분을 절대 잊지 않도록 해야한다.
		 */

	}

}
