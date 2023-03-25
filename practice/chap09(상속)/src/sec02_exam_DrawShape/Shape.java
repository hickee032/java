package sec02_exam_DrawShape;

//조상 클래스
public class Shape {

	String color = "black";

	public Shape() {
		System.out.println("shape 기본생성자 호출");
		System.out.println();
	}

	public void Draw() {
		System.out.println("[ color = " + this.color + " ]");

	}

}
