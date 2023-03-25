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
			// 지정된 영역의 화면을 지운다.
			System.out.println(Thread.currentThread().getName());
			graphics.clearRect(0, 0, 300, 300);
			System.out.println("스크롤 바의 값 : " + paintFrame.speed + " i값 : " + i);
			graphics.drawString("Hi~~", i, 150);

			i = (i < 300 ? i : 0);

		}
	}

}
