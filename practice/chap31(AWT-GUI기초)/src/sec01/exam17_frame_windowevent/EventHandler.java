package sec01.exam17_frame_windowevent;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventHandler implements WindowListener {

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println(e.toString());
		e.getWindow().setVisible(false); //ȭ�鿡�� ������ â ������� ��
		e.getWindow().dispose(); //�޸𸮿��� ������ �ν��Ͻ� ����
		System.out.println("windowClosing() ȣ��� ������ ����");
		System.exit(0);
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



}
