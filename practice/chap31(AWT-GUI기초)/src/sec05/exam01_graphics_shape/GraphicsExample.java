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

	//AWT�����尡 ����Ʈ�� �ҷ��´�.
	@Override
	public void paint(Graphics g) {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isDaemon());
		// ���ڿ��� ��� �޼���
		g.drawString("Graphics ��ü�� �̿��Ͽ� �׸��� �׸��ϴ�.", 10, 50);

		// Ÿ���� �׸��� �޼���
		g.drawOval(50, 100, 50, 50);
		// ������ �� ������ �Ѵ�
		g.setColor(Color.BLUE);
		g.fillOval(100, 100, 20, 50);
		
		try {
			Thread.sleep(3000); //AWT�����带 3�ʰ� ���� 
		} catch (InterruptedException e) {}

		// �ձ� �簢�� �׸���
		g.fillRoundRect(200, 100, 120, 80, 30, 30);
		//�ٰ���
		g.setColor(Color.ORANGE);
		g.fillPolygon(new int[] {50,100,150,200},
					  new int[] {250,200,200,250},4);
		//ȣ�� �׸���.
		g.setColor(Color.CYAN);
		g.fillArc(250, 200, 100, 100, 0, 120);
		System.out.println(Thread.currentThread().getName());
		
	}

}
