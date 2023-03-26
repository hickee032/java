package Ex;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Omok extends Frame implements MouseListener {
	
	final int LINE_NUM = 9; // ������ �� ��
	final int LINE_WIDTH = 30; // ������ �� ����
	final int BOARD_SIZE = LINE_WIDTH * (LINE_NUM-1); // �������� ũ��
	final int STONE_SIZE = (int)(LINE_WIDTH * 0.8); // ���� ũ��
	final int X0; // ������ ������ġ x��ǥ
	final int Y0; // ������ ������ġ y��ǥ
	final int FRAME_WIDTH; // Frame�� ��
	final int FRAME_HEIGHT; // Frame�� ����
	Image img = null;
	Graphics gImg = null;
	
	public Omok(String title) {
		super(title);
		// Event Handler�� ����Ѵ�.
		addMouseListener(this);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	
		setVisible(true); // Frame�� ȭ�鿡 ���̰� �Ѵ�.

		Insets insets = getInsets(); // ȭ�鿡 ���̱� ������ Insets�� ���� ���� �� ����.

		// ������ �׷��� ��ġ(LEFT, TOP)�� ��ǥ X0, Y0�� �����Ѵ�.
		X0 = insets.left + LINE_WIDTH;
		Y0 = insets.top + LINE_WIDTH;
		// Frame�� ũ�⸦ ����Ѵ�.
		FRAME_WIDTH = BOARD_SIZE+LINE_WIDTH*2+insets.left+insets.right;
		FRAME_HEIGHT = BOARD_SIZE+LINE_WIDTH*2+insets.top+insets.bottom;
		// Frame�� ȭ���� (100,100)�� ��ġ�� ���� ũ��� ���̰� �Ѵ�.
		setBounds(100,100, FRAME_WIDTH, FRAME_HEIGHT);
		img = createImage(FRAME_WIDTH, FRAME_HEIGHT);
		gImg = img.getGraphics();
		setResizable(false); // Frame�� ũ�⸦ �������� ���ϰ� �Ѵ�.
		drawBoard(gImg);
	}
	
	public void drawBoard(Graphics g) {
		
		for(int i=0; i<LINE_NUM;i++) {
			g.drawLine(X0,Y0+i*LINE_WIDTH,X0+BOARD_SIZE, Y0+i*LINE_WIDTH);
			g.drawLine(X0+i*LINE_WIDTH,Y0, X0+i*LINE_WIDTH, Y0+BOARD_SIZE);
		}
	}
	
	public void paint(Graphics g) {
		if(img==null) return;
			g.drawImage(img,0,0,this); // ����ȭ�鿡 �׷��� �׸��� Frame�� ����
	}
	
	public void mousePressed(MouseEvent e) { // MouseListener
		int x = e.getX(); // ���콺 �������� x��ǥ
		int y = e.getY(); // ���콺 �������� y��ǥ
		
		//1. x �Ǵ� y�� ���� �������� ���� ��� ���̸� �޼��带 �����Ѵ�.
		if(x < X0-LINE_WIDTH/2 || x > X0+(LINE_NUM-1)*LINE_WIDTH+LINE_WIDTH/2)
			return;
		if(y < Y0-LINE_WIDTH/2 || y > Y0+(LINE_NUM-1)*LINE_WIDTH+LINE_WIDTH/2)
			return;
		
		// 2. x�� y�� ���� Ŭ���� ������ ���� ����� ���������� �����Ѵ�.(�ݿø�)
		x = (x-X0 + LINE_WIDTH/2)/LINE_WIDTH * LINE_WIDTH + X0;
		y = (y-Y0 + LINE_WIDTH/2)/LINE_WIDTH * LINE_WIDTH + Y0;
		
		// 3. x�� y�� ������ ���� ũ��(STONE_SIZE)�� ������ ���� Ŭ���� ���� ���� �׷�����.
		x -= STONE_SIZE / 2;
		y -= STONE_SIZE / 2;
		
		// 4. ������ ��ư�� ���콺 ���� ��ư�̸�, (x,y)�� ��ġ�� ���� ���� �׸���
		if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK) {
			gImg.setColor(Color.black);
			gImg.fillOval(x,y,STONE_SIZE, STONE_SIZE);
		// ������ ��ư�� ���콺 ������ ��ư�̸�, (x,y)�� ��ġ�� �� ���� �׸���.
		} 
		else if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK) {
			gImg.setColor(Color.white);
			gImg.fillOval(x,y,STONE_SIZE, STONE_SIZE);
			// ��� ���� ���� ������ �׵θ��� �׸���.
			gImg.setColor(Color.black);
			gImg.drawOval(x,y,STONE_SIZE, STONE_SIZE);
		}
		// 5. repaint()�� ȣ���Ѵ�.
		repaint();
	}
	public void mouseClicked(MouseEvent e) {} // MouseListener
	public void mouseEntered(MouseEvent e) {} // MouseListener
	public void mouseExited(MouseEvent e) {} // MouseListener
	public void mouseReleased(MouseEvent e) {} // MouseListener
}
	
	
	
	
