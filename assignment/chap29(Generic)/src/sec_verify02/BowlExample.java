package sec_verify02;

public class BowlExample {

	public static void main(String[] args) {

		Bowl<String, String> b1 = new Bowl<String, String>();
		b1.setK("박근혜");
		b1.setV("508");
		System.out.println("타입파라메터에 <String, String>으로 객체 생성 후 저장값 불러오기");
		System.out.println("이름 : " + b1.getK());
		System.out.println("직업 : " + b1.getV());

		Bowl<String, Integer> b2 = new Bowl<String, Integer>();
		b2.setK("박근혜");
		b2.setV(65);
		System.out.println(
				"타입파라메터에 <String, Integer>으로 객체 생성 후 저장값 불러오기" + "\n이름 : " + b2.getK() + "\n나이 : " + b2.getV());

	}

}
