package sec04.exam05_PaintFrame;

import java.awt.Color;
import java.awt.Graphics;

public class Main {

	public static void main(String[] args) {
		PaintFrame paintFrame = new PaintFrame("PaintFrame");

		Graphics graphics = paintFrame.getGraphics();
		graphics.setColor(Color.RED);

		for (int i = 0; true; i += paintFrame.speed) {

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
			// ������ ������ ȭ���� �����.
			System.out.println(Thread.currentThread().getName());
			graphics.clearRect(0, 0, 300, 300);
			System.out.println("��ũ�� ���� �� : " + paintFrame.speed + " i�� : " + i);
			graphics.drawString("Hi~~", i, 150);

			i = (i < 300 ? i : 0);

		}
	}

}
