package Ex;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BouncingBall extends Frame {

	int BALL_SIZE = 20;
	int FRAME_WIDTH = 400;
	int FRAME_HEIGHT = 300;
	int TOP;
	int BOTTOM;
	int LEFT;
	int RIGHT;
	int SPEED = 3;
	int x = 100;
	int y = 100;
	int xStep = SPEED;
	int yStep = SPEED;

	public BouncingBall(String title) {
		super(title);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		this.setBounds(300, 200, FRAME_WIDTH, FRAME_HEIGHT);
		setResizable(false);
		setVisible(true);
		Insets insets = getInsets(); // Frame�� �׵θ��� �β��� ���´�.
		TOP = insets.top;
		LEFT = insets.left;
		//System.out.println(TOP + "," + LEFT);
		BOTTOM = FRAME_HEIGHT - insets.bottom;
		RIGHT = FRAME_WIDTH - insets.right;
	}

	public void start() {
		while (true) {
			x += xStep;
			y += yStep;

			// 1. x�� ���� ���� �׵θ�(LEFT)���� �۰ų� ������
			// x�� ���� LEFT�� �ٲٰ� x�� �̵�����(xStep)�� �ݴ�� �Ѵ�.
			if (x <= LEFT) {
				x = LEFT;
				xStep = -xStep;
			}

			// 2. x�� ���� ������ �׵θ�(RIGHT-BALL_SIZE)���� ũ�ų� ������
			// x�� ���� RIGHT-BALL_SIZE�� �ٲٰ� x�� �̵�����(xStep)�� �ݴ�� �Ѵ�.
			if (x >= RIGHT - BALL_SIZE) {
				x = RIGHT - BALL_SIZE;
				xStep = -xStep;
			}

			// 3. y�� ���� �� �� �׵θ�(TOP)���� �۰ų� ������
			// y�� ���� TOP���� �ٲٰ� y�� �̵�����(yStep)�� �ݴ�� �Ѵ�.
			if (y <= TOP) {
				y = TOP;
				yStep = -yStep;
			}

			// 4. y�� ���� �Ʒ� �� �׵θ�(BOTTON-BALL_SIZE)���� ũ�ų� ������
			// y�� ���� BOTTON-BALL_SIZE�� �ٲٰ� y�� �̵�����(yStep)�� �ݴ�� �Ѵ�.
			if (y >= BOTTOM - BALL_SIZE) {
				y = BOTTOM - BALL_SIZE;
				yStep = -yStep;
			}

			repaint();

			try {
				Thread.sleep(10);
			} catch (Exception e) {
			}
		}
	} // start()

	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(x, y, BALL_SIZE, BALL_SIZE);
	}
}
