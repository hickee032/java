package sec01_exam_runtime_exception;

public class NullPointException {

	public static void main(String[] args) {

		String data = null;

//		try {
			System.out.println(data.toString());
			//클래스 명과 같으면 안된다.
//		} catch (NullPointerException e) {
//			System.out.println("예외발생 - " + e.toString());
//		}
	}

}
