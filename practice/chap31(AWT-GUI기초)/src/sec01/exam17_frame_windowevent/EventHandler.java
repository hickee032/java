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
		e.getWindow().setVisible(false); //화면에서 윈도우 창 사라지게 함
		e.getWindow().dispose(); //메모리에서 윈도우 인스턴스 제거
		System.out.println("windowClosing() 호출로 윈도우 닫힘");
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
