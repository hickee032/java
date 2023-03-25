package sec14_exam01_thread_group;

public class AutoSaveThread extends Thread {

	public void save() {
		System.out.println("작업 내용 저장");
	}

	@Override
	public void run() {
		// 1초 단위로 세이브
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			this.save();
		}
	}
}
