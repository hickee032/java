package sec03.exam04_CardLayout;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CardLayout_Example {

	public static void main(String[] args) {
		Frame f = new Frame("CardLayout Ex");
		CardLayout card = new CardLayout(10, 10);
		f.setLayout(card);

		// 프레임에 종속될 컨테이너인 패널을 3개 작성
		Panel card1 = new Panel();
		card1.setBackground(Color.LIGHT_GRAY);
		card1.add(new Label("Card-1"));

		Panel card2 = new Panel();
		card2.setBackground(Color.ORANGE);
		card2.add(new Label("Card-2"));

		Panel card3 = new Panel();
		card3.setBackground(Color.CYAN);
		card3.add(new Label("Card-3"));

		// Frame에 3개의 Pannel을 추가하고 있다.
		// 자바FX의 stackPane과 비슷한것이다.

		f.add(card1);
		f.add(card2);
		f.add(card3);

		class Handler extends MouseAdapter {

			public void mouseClicked(MouseEvent e) {

				if (e.getModifiers() == MouseEvent.BUTTON2_MASK) {
					System.out.println(e.getModifiers());
					card.previous(f);

				} else {
					System.out.println(e.getModifiers());
					card.next(f);
				}

			}

		}
		card1.addMouseListener(new Handler());
		card2.addMouseListener(new Handler());
		card3.addMouseListener(new Handler());

		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		f.setSize(300, 300);
		f.setLocation(500, 300);
		;
		f.setVisible(true);

		card.first(f);
	}

}
