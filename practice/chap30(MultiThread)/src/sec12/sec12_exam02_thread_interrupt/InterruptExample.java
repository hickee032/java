package sec12.sec12_exam02_thread_interrupt;

import javax.swing.JOptionPane;

public class InterruptExample {

	public static void main(String[] args) {
		CountThread countThread = new CountThread();
		
		countThread.start();
		
		String input = JOptionPane.showInputDialog("�ƹ� �� �Է�");
		System.out.println("�Է��� �� -"+ input);
		
		//interrupt()�� ȣ���ϸ� interrupted ���°� true�� �ȴ�.
		countThread.interrupt();
		//true�� ��� ��.
		System.out.println("isinterrupt() : " +  countThread.isInterrupted());

	}

}
