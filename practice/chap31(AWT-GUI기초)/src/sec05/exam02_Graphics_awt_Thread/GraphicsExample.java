package sec05.exam02_Graphics_awt_Thread;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class GraphicsExample extends Frame implements MouseMotionListener {

	int x = 0;
	int y = 0;

	public GraphicsExample(String title) {
		super(title);
		// 매개변수로 this가 들어올수 있는 이유?
		// --> 프레임에서 구현 해놓아서 가능하다
		this.addMouseMotionListener(this);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		this.setBounds(100, 100, 500, 500);
		this.setVisible(true);
	}
	
//	 AWT스레드 평소 위에 존재하다가 Gut애플리케이션 프로그램이 시작되면
//	   paint()를 호출한다 AWT스레드를 의해 자동적으로 화면이 갱신되는 상황을
//	    아래와 같이 정리했다
//	    1.처음화면에 나타날때
//	    2.다른화면에 가려져 있던 부분이 다시 화면에 나타날때
//	    3.아이콘 화 되어 있다가 원래 크기로 화면에 나타날 때
//	    하지만 위의 상황 이외에도 화면에 다시 그려지도록 요청할 수 있다 그 방법이 바로
//	    repeint()를 호출하는 것이다 사용자가 repaint()를 호출하면 AWT스레드에게
//	    다시 화면을 그리라고 요청하는 것이다
//	    AWT스레드는 update()를 호출하면 update()는 paint()를 호출하는 형태인 것이다
//	    repaint()  - aWT스레드에게 화면을 갱신할 것을 요청함 0.1초마다 확인해서 요청이 있으면
//	    update() 호출 
//	    update(Graphies g) - 화면을 치우고 paint(Graphies g)를 호출한다
//	    상기 내용 숙지하여 UI관련 스레드가 어떻게 움직이는지를 알고 프로그레밍을 제어 할 것이다

	@Override
	public void paint(Graphics g) {
		System.out.println("paint스레드를 움직이는 스레드 : " + Thread.currentThread().getName());
		g.drawString("마우스를 움직여 보세요", 10, 50);
		g.drawString("*", this.x, this.y);
	}
	// penal image객체를 이용하면 지워 지지 않고 가능하다.
	@Override
	public void update(Graphics g) {
		
		System.out.println("update스레드를 움직이는 스레드 : " + Thread.currentThread().getName());
		paint(g);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		this.x = e.getX();
		this.y = e.getY();

		this.repaint();
	}

}
