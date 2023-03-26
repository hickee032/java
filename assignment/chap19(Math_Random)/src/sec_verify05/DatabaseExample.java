package sec_verify05;

public class DatabaseExample {

	final static int RECORD_NUM = 10; // 생성할 레코드의 수를 정한다.
	final static String TABLE_NAME = "TEST_TABLE";
	final static String[] CODE1 = { "010", "011", "017", "018", "019" };
	final static String[] CODE2 = { "남자", "여자" };
	final static String[] CODE3 = { "10대", "20대", "30대", "40대", "50대" };

	static String getRandArr(String[] arr) {

		int a = (int) (Math.random() * arr.length);
		return arr[a];
	}

	static int getRand(int a, int b) {

		int add = a + (int) (Math.random() * a);

		if (add > b) {
			add = add - a;
		}

		return add;
	}

	public static void main(String[] args) {
		for (int i = 0; i < RECORD_NUM; i++) {
			System.out.println(" INSERT INTO " + TABLE_NAME + " VALUES (" + " '" + getRandArr(CODE1) + "'" + ", '"
					+ getRandArr(CODE2) + "'" + ", '" + getRandArr(CODE3) + "'" + ",  " + getRand(100, 200) // 100~200
																											// 사이의 값을
																											// 얻는다.
					+ "); ");
		}

	}

}
