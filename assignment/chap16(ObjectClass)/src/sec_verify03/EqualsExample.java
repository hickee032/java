package sec_verify03;

public class EqualsExample {

	public static void main(String[] args) {
		System.out.println("현재 생성된 인스턴스이다.");

		Point num1 = new Point(2, 3);
		Point num2 = new Point(2, 3);
		Point num3 = new Point(3, 4);

//		System.out.println("Point num1의 필드 값  : x - " + num1.getX() + "이며 y - " + num1.getY() + "이다.");
//		System.out.println("Point num2의 필드 값  : x - " + num2.getX() + "이며 y - " + num2.getY() + "이다.");
//		System.out.println("Point num3의 필드 값  : x - " + num3.getX() + "이며 y - " + num3.getY() + "이다.");
		
		System.out.println("Point num1의 필드 값  : " + num1.toString());
		System.out.println("Point num1의 필드 값  : " + num2.toString());
		System.out.println("Point num1의 필드 값  : " + num3.toString());

		if (num1.equals(num2)) {
			System.out.println("num1의 필드와 num2의 필드는 같다.");
		} else {
			System.out.println("num1의 필드와 num2의 필드는 다르다.");
		}
	}

}
