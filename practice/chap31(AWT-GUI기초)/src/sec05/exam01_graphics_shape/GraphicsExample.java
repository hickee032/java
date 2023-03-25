package sec05.exam01_graphics_shape;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class GraphicsExample extends Frame {

	public GraphicsExample(String title) {
		super(title);
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		this.setBounds(100, 100, 400, 300);
		this.setVisible(true);
	}

	//AWT스레드가 페인트를 불러온다.
	@Override
	public void paint(Graphics g) {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isDaemon());
		// 문자열을 찍는 메서드
		g.drawString("Graphics 객체를 이용하여 그림을 그림니다.", 10, 50);

		// 타원을 그리는 메서드
		g.drawOval(50, 100, 50, 50);
		// 일종의 붓 역할을 한다
		g.setColor(Color.BLUE);
		g.fillOval(100, 100, 20, 50);
		
		try {
			Thread.sleep(3000); //AWT스레드를 3초간 정지 
		} catch (InterruptedException e) {}

		// 둥근 사각형 그리기
		g.fillRoundRect(200, 100, 120, 80, 30, 30);
		//다각형
		g.setColor(Color.ORANGE);
		g.fillPolygon(new int[] {50,100,150,200},
					  new int[] {250,200,200,250},4);
		//호를 그린다.
		g.setColor(Color.CYAN);
		g.fillArc(250, 200, 100, 100, 0, 120);
		System.out.println(Thread.currentThread().getName());
		
	}

}
