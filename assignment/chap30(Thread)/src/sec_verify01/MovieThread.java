package sec_verify01;

public class MovieThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("동영상을 재생합니다.");
			try {
				Thread.sleep(400);
			} catch (Exception e) {

			}

		}
	}
}
