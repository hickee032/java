package sec05.exam04_Graphics_image02;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class GraphicsExample2 extends Frame implements MouseMotionListener {

	Image img = null;
	Graphics gimg = null;
	int width = 0;
	int height = 0;
	
	int x = 0;
	int y = 0;

	public GraphicsExample2(String title) {
		super(title);
		this.addMouseMotionListener(this);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		img = toolkit.getImage("D:\\JAVA�۾�\\Practice_Chap31(AWT-GUI����)\\src\\sec05\\images\\�迬��.jpg");
		this.setBounds(100, 100, 500, 500);
		this.setVisible(true);
		
		this.img = this.createImage(500, 500);
		this.gimg = img.getGraphics();

	}

	@Override
	public void paint(Graphics g) {
		if (img == null) {
			return;
		}
		this.width = this.getWidth();
		this.height = this.getHeight();
		System.out.println("���� " + this.width + ", ���� " + this.height);

		int imgwidth = img.getWidth(this);
		int imgheight = img.getHeight(this);
		System.out.println(Thread.currentThread().getName());
		System.out.println("�̹��� ���� " + imgwidth + ", ����" + imgheight);

		g.drawImage(img, (this.width - imgwidth) / 2, (this.height - imgheight) / 2, this);
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
	public void mouseMoved(MouseEvent e) {
	}

}
