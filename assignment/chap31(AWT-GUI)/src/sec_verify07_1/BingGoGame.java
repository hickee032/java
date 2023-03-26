package sec_verify07_1;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class BingGoGame extends Frame {

	public BingGoGame() {
		this.setTitle("BingGoGame");
		this.setSize(500, 500);
		this.setLayout(new GridLayout(5, 5));

		String a[] = { "참새", "두루미", "황새", "비둘기", "까오기", "오리", "타조", "부엉이", "올배미", "뱁새", "꿩", "닭", "구관조", "잉꼬", "매",
				"거위", "독수리", "콘돌", "봉황", "공작", "까치", "까마귀", "앵무새", "꾀꼬리", "고니" };
		for (int i = 0; i < a.length; i++) {
			// this.add(new Button(a[i]));
			Button ok = new Button(a[i]);
			this.add(ok);
			

			ok.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println(ok.getLabel());
					Color c = new Color((int) (Math.random() * 255), (int) (Math.random() * 255),
							(int) (Math.random() * 255));
					
					ok.setBackground(c);

				}
			});
		}

		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		this.setVisible(true);
	}

}
