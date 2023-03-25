package sec10.exam01_thread_wait_notify;

public class WaitnotifyExample {

	public static void main(String[] args) {

		WorkObject sharedObjects = new WorkObject();
		
		//실행코드에 가서 notify()와 wait()를 호출하고 동기화 메서드로 되어있어 번갈아 실행됨 
		ThreadA threadA = new ThreadA(sharedObjects);
		ThreadB threadB = new ThreadB(sharedObjects);
		
		threadA.start();
		threadB.start();
		//다시한번 강조하지만 wait() notify() notifyAll()은 object클래스의 메서드이며 또한 동기화 synchronized
		//와 동기화 블럭에서만 사용가능
		//그리고 synchronized 제어자가 붙어있는 메서드나 블럭에서 wait() notify() notifyAll()호출 하면 런타임 예외가 발생하므로 
		//주의 하도록 한다.

	}

}
