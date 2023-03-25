package sec01.exam11_Panel;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PanelExample {

	public static void main(String[] args) {
		Frame f = new Frame("Panel");
		f.setBounds(500, 300, 500, 300); // setsize()+setlocation
		f.setLayout(null);
		
		/*
		 * Panel은 종속적인 컨테이너로서 기본적으로 Flowlayout이다 
		 * 따라서 Panel안에 들어갈 컴포넌트 의 위치를 따로 지정해 주지 않아도 된다.
		 */

		Panel p = new Panel();
		p.setBackground(Color.BLUE);
		p.setBounds(50, 50, 150, 150);
		
		/*
		 * 현재버튼들이 Panel 컨테이너에 추가가 되고 있기 때문에 프레임 컨테이너에 영향을 받는 것이 아니라 
		 * Panel 컨테이너의 레이아웃 매니저의 영향을 받는다.
		 */ 

		Button ok = new Button("OK");
		Button cc = new Button("CANCEL");
		
		ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("OK버튼 눌러짐");
				
			}
		});
		
		cc.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("CANCEL버튼 눌러짐");
				
			}
		});

		p.add(ok);
		p.add(cc);
		f.add(p);
		f.setVisible(true);

		f.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

}
