package sec01.exam14_FileDialog;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FileDialogExample {

	public static void main(String[] args) {
		Frame f = new Frame("Parent");
		f.setSize(200, 200);
		
		FileDialog fileOpen = new FileDialog(f,"파일열기",FileDialog.LOAD);
		
		//FileDialog fileOpen = new FileDialog(f,"파일저장",FileDialog.SAVE);
		
		
		f.setVisible(true);
		fileOpen.setVisible(true);
		//getFile()과 getDirectory()를 통해 파일이름과 위치한 디렉토리 패스를 얻을수 있다.
		System.out.println(fileOpen.getDirectory()+fileOpen.getFile());
		
		//윈도우 이벤트 처리 부분 추가
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		

	}

}
