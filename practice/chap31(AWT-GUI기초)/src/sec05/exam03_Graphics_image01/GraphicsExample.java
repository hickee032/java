package sec05.exam03_Graphics_image01;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class GraphicsExample extends Frame implements MouseMotionListener {

	int x = 0;
	int y = 0;
	Image img = null;
	Graphics gimg = null;

	public GraphicsExample(String title) {
		super(title);
		this.addMouseMotionListener(this);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		this.setBounds(100, 100, 500, 500);
		this.setVisible(true);
		// ���� ȭ���� �ɰ� -->image��ü
		this.img = this.createImage(500, 500);
		this.gimg = img.getGraphics();
		this.gimg.drawString("���� ��ư�� ����ä�� ���콺�� ������ ������", 10, 50);
		//repaint();
	}

	@Override
	public void paint(Graphics g) {
		if (this.img != null) {
//			����ȭ�鿡 �׷��� �׸��� �����ӿ� �����ϰ� �ִ�. 
//			�̺κ��� �̹����� �׷��� ������ ����ؼ� this(������)�� ���� �ϰ��ִ�.
//			�Ͽ� �ٸ� ȭ�鿡 ������ �ٽú����� �״���ΰ��̴�.
//			���⼭ imageObserber�� this�� �������ִ� �� imageObserber�������̽��� ��� ������Ʈ�� ������ Ŭ�����ε� �̹����� �ε��Ǵ� �� �ð��� �ɸ��� ������ 
//			�ε��� ����Ǵ� ���¿� ���� ȭ�鿡 �ٽñ׷���� �Ѵ�. �׷��� �̹����� �ε��ǰ��ִ� ���¸� �˷��� ����� imageObserber�� ����������Ѵ�.
//			�Ͽ� ��� component�ڽ��� �־��ִ� ���̴�.
			
			System.out.println(Thread.currentThread().getName());
			System.out.println("Paint");
			g.drawImage(img, 0, 0, this);
		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		if (e.getModifiers() == MouseEvent.BUTTON1_MASK) {
			this.x = e.getX();
			this.y = e.getY();
			gimg.drawString("*", this.x, this.y); // �̰� �����ӿ� �׸��� �ִ� ��
			repaint(); // ȭ�� ������ �̷����
		}

	}

	@Override
	public void mouseMoved(MouseEvent e) {}

}
