package sec03_exam_threadExtends_02;

import javax.swing.JOptionPane;

public class InputDialogExample {

	public static void main(String[] args) {
		
		TimerThread t = new TimerThread();
		t.start();
		
		String input = JOptionPane.showInputDialog("�ƹ����̳� �Է��ϼ���");
		System.out.println("�Է��Ͻ� ���� "+input+"�Դϴ�.");
	}

}
