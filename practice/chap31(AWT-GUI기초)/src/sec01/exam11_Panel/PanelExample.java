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
		 * Panel�� �������� �����̳ʷμ� �⺻������ Flowlayout�̴� 
		 * ���� Panel�ȿ� �� ������Ʈ �� ��ġ�� ���� ������ ���� �ʾƵ� �ȴ�.
		 */

		Panel p = new Panel();
		p.setBackground(Color.BLUE);
		p.setBounds(50, 50, 150, 150);
		
		/*
		 * �����ư���� Panel �����̳ʿ� �߰��� �ǰ� �ֱ� ������ ������ �����̳ʿ� ������ �޴� ���� �ƴ϶� 
		 * Panel �����̳��� ���̾ƿ� �Ŵ����� ������ �޴´�.
		 */ 

		Button ok = new Button("OK");
		Button cc = new Button("CANCEL");
		
		ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("OK��ư ������");
				
			}
		});
		
		cc.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("CANCEL��ư ������");
				
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
