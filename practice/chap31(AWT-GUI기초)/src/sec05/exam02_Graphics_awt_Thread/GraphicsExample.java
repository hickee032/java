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
		// �Ű������� this�� ���ü� �ִ� ����?
		// --> �����ӿ��� ���� �س��Ƽ� �����ϴ�
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
	
//	 AWT������ ��� ���� �����ϴٰ� Gut���ø����̼� ���α׷��� ���۵Ǹ�
//	   paint()�� ȣ���Ѵ� AWT�����带 ���� �ڵ������� ȭ���� ���ŵǴ� ��Ȳ��
//	    �Ʒ��� ���� �����ߴ�
//	    1.ó��ȭ�鿡 ��Ÿ����
//	    2.�ٸ�ȭ�鿡 ������ �ִ� �κ��� �ٽ� ȭ�鿡 ��Ÿ����
//	    3.������ ȭ �Ǿ� �ִٰ� ���� ũ��� ȭ�鿡 ��Ÿ�� ��
//	    ������ ���� ��Ȳ �̿ܿ��� ȭ�鿡 �ٽ� �׷������� ��û�� �� �ִ� �� ����� �ٷ�
//	    repeint()�� ȣ���ϴ� ���̴� ����ڰ� repaint()�� ȣ���ϸ� AWT�����忡��
//	    �ٽ� ȭ���� �׸���� ��û�ϴ� ���̴�
//	    AWT������� update()�� ȣ���ϸ� update()�� paint()�� ȣ���ϴ� ������ ���̴�
//	    repaint()  - aWT�����忡�� ȭ���� ������ ���� ��û�� 0.1�ʸ��� Ȯ���ؼ� ��û�� ������
//	    update() ȣ�� 
//	    update(Graphies g) - ȭ���� ġ��� paint(Graphies g)�� ȣ���Ѵ�
//	    ��� ���� �����Ͽ� UI���� �����尡 ��� �����̴����� �˰� ���α׷����� ���� �� ���̴�

	@Override
	public void paint(Graphics g) {
		System.out.println("paint�����带 �����̴� ������ : " + Thread.currentThread().getName());
		g.drawString("���콺�� ������ ������", 10, 50);
		g.drawString("*", this.x, this.y);
	}
	// penal image��ü�� �̿��ϸ� ���� ���� �ʰ� �����ϴ�.
	@Override
	public void update(Graphics g) {
		
		System.out.println("update�����带 �����̴� ������ : " + Thread.currentThread().getName());
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
