package sec10_exam02_thread_interrupt;

import javax.swing.JOptionPane;

public class InterruptExample {

	public static void main(String[] args) {
		CountThread countThread = new CountThread();
		
		countThread.start();
		
		String input = JOptionPane.showInputDialog("아무 값 입력");
		System.out.println("입력한 값 -"+ input);
		
		//interrupt()를 호출하면 interrupted 상태가 true가 된다.
		countThread.interrupt();
		//true를 찍는 다.
		System.out.println("isinterrupt() : " +  countThread.isInterrupted());

	}

}
