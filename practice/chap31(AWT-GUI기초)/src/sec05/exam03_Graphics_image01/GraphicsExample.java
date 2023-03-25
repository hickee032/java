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
		// 가상 화면이 될곳 -->image객체
		this.img = this.createImage(500, 500);
		this.gimg = img.getGraphics();
		this.gimg.drawString("왼쪽 버튼을 누른채로 마우스를 움직여 보세요", 10, 50);
		//repaint();
	}

	@Override
	public void paint(Graphics g) {
		if (this.img != null) {
//			가상화면에 그려진 그림을 프레임에 복사하고 있다. 
//			이부분이 이미지에 그려진 내용을 계속해서 this(프레임)에 복사 하고있다.
//			하여 다른 화면에 가려져 다시보여도 그대로인것이다.
//			여기서 imageObserber를 this로 설정해주는 데 imageObserber인터페이스는 모든 컴포넌트가 구현한 클래스인데 이미지가 로딩되는 데 시간이 걸리기 때문에 
//			로딩이 진행되는 상태에 따라 화면에 다시그려줘야 한다. 그래서 이미지가 로딩되고있는 상태를 알려줄 대상을 imageObserber로 지정해줘야한다.
//			하여 통상 component자신을 넣어주는 것이다.
			
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
			gimg.drawString("*", this.x, this.y); // 이건 프레임에 그리고 있는 것
			repaint(); // 화면 갱신이 이루어짐
		}

	}

	@Override
	public void mouseMoved(MouseEvent e) {}

}
