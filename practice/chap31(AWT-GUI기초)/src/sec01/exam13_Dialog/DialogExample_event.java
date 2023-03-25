package sec01.exam13_Dialog;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DialogExample_event {

	public static void main(String[] args) {
		Frame f = new Frame("Parent");
		f.setSize(500, 500);

		Dialog info = new Dialog(f, "info", true);
		info.setSize(150, 100);
		info.setLocation(550, 50);
		info.setLayout(new FlowLayout());

		Label msg = new Label("이 라벨은 모달", Label.CENTER);

		Button ok = new Button("OK");
		/*
		 * OK버튼에 ActionListener를 추가 리스너는 감시하는 역할 하여 
		 * 매개값으로 인터 페이스인 ActionListener을 가지고 있고 그것을 익명 구현 
		 * 이제 OK버튼을 누르면 Diglog가 사라질것이다.
		 */

		ok.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				info.setVisible(false);
				info.dispose();

			}
		});

		/*
		 * 윈도우 이벤트 처리 부분 매개변수가 WindowAdapter 클래스
		 * WindowAdapter 클래스는 WindowListener 인터페이스에 있는 
		 * 7개의 추상 클래스를 구현해 놓았다.({}로만 해둠 ->즉 내용이 없다)
		 */
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {

				System.exit(0);
			}
		});

		info.add(msg);
		info.add(ok);
		f.add(info);

	}

}
