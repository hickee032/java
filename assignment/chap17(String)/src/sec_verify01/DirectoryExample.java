package sec_verify01;

public class DirectoryExample {

	public static void main(String[] args) {
		String data = "D:/������/photo/2016/travel/food.jpg";
		// 25
		String filename = data.substring(25, 29);
		System.out.println("���� �̸� : " + filename);

		String extence = data.substring(30);
		System.out.println("Ȯ���� : " + extence);

		String foldername = data.substring(0, 24);
		System.out.println("���� �̸� : " + foldername);
	}

}
