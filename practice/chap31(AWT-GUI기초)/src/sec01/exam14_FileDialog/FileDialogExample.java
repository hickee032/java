package sec01.exam14_FileDialog;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FileDialogExample {

	public static void main(String[] args) {
		Frame f = new Frame("Parent");
		f.setSize(200, 200);
		
		FileDialog fileOpen = new FileDialog(f,"���Ͽ���",FileDialog.LOAD);
		
		//FileDialog fileOpen = new FileDialog(f,"��������",FileDialog.SAVE);
		
		
		f.setVisible(true);
		fileOpen.setVisible(true);
		//getFile()�� getDirectory()�� ���� �����̸��� ��ġ�� ���丮 �н��� ������ �ִ�.
		System.out.println(fileOpen.getDirectory()+fileOpen.getFile());
		
		//������ �̺�Ʈ ó�� �κ� �߰�
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		

	}

}
