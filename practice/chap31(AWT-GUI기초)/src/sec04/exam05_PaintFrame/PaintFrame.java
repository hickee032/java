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
	Label lSpeed = new Label("�ӵ� : 1");

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
	 * ��øŬ���� WindowAdapter ��� AdjustmentListener����
	 * 
	 * Adjustment Event ���� 
	 * - AdjustmentEvent ��ũ�ѹ� �����϶� �߻��ϴ� �̺�Ʈ
	 * - AdjustmentEventListener ó���ϱ� ���� �̺�Ʈ �ڵ鷯
	 * 
	 * AdjustmentEvent���� 
	 *  - AdjustmentListener �������̽� �޼��尡 �ϳ��̱⶧���� AdapterŬ������ ����.
	 *  - public void AdjustmentListener(AdjustmentEvent e) { }
	 */
	
	class MyHandler extends WindowAdapter implements AdjustmentListener {

		// Fx������ �Ӽ����� ����Ѱ��̴�.
		@Override
		public void adjustmentValueChanged(AdjustmentEvent e) {
			speed = sb.getValue(); // ��ũ�ѹ� ���� ���ϸ� ���ϴ� ���� �����Ѵ�.
			lSpeed.setText("�ӵ� :" + speed); // �󺧰��� �����Ѵ�.
		}

		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}

	}

}
