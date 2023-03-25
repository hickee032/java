package sec04.exam05_PaintFrame;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class PaintFrame extends Frame {
	int speed = 1;
	Scrollbar sb = new Scrollbar(Scrollbar.HORIZONTAL, 0, 5, 0, 50);
	Label lSpeed = new Label("속도 : 1");

	public PaintFrame(String name) {
		super(name);
		this.lSpeed.setBackground(Color.ORANGE);
		this.lSpeed.setBounds(10, 30, 65, 15);
		this.sb.setBounds(20, 250, 260, 20);
		this.add(lSpeed);
		this.add(sb);

		this.sb.addAdjustmentListener(new MyHandler());

		this.addWindowListener(new MyHandler());

		this.setBounds(500, 300, 300, 300);

		this.setLayout(null);

		this.setVisible(true);
		this.setResizable(false);
	}

	/*
	 * 중첩클래스 WindowAdapter 상속 AdjustmentListener구현
	 * 
	 * Adjustment Event 형식 
	 * - AdjustmentEvent 스크롤바 움직일때 발생하는 이벤트
	 * - AdjustmentEventListener 처리하기 위한 이벤트 핸들러
	 * 
	 * AdjustmentEvent관련 
	 *  - AdjustmentListener 인터페이스 메서드가 하나이기때문에 Adapter클래스는 없다.
	 *  - public void AdjustmentListener(AdjustmentEvent e) { }
	 */
	
	class MyHandler extends WindowAdapter implements AdjustmentListener {

		// Fx에서의 속성감시 비슷한것이다.
		@Override
		public void adjustmentValueChanged(AdjustmentEvent e) {
			speed = sb.getValue(); // 스크롤바 값이 변하면 변하는 값을 대입한다.
			lSpeed.setText("속도 :" + speed); // 라벨값을 갱신한다.
		}

		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}

	}

}
