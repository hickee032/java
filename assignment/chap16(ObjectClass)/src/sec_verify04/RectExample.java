package sec_verify04;

public class RectExample {

	public static void main(String[] args) {

		Rect num1 = new Rect(5, 15);
		Rect num2 = new Rect(15, 5);
		Rect num3 = new Rect(3, 10);

		System.out.println("현재 생성된 인스턴스이다.");
		System.out.println("Rect num1의 필드 값  : " + num1.toString());
		System.out.println("Rect num2의 필드 값  : " + num2.toString());
		System.out.println("Rect num3의 필드 값  : " + num3.toString());
		
		if(num1.equals(num2)) {
			System.out.println("rect1사각형 면적과 rect2사각형 면적은 같다.");
		}
		else {
			System.out.println("rect1사각형 면적과 rect2사각형 면적은 다르다.");
		}
	}

}
