package sec02_exam_DrawShape;

//원이라는 도형은 우너점과 반지름이 필요하다.
public class Circle extends Shape{
	Point center = null;
	int radius;
	
	public Circle() {
		/*
		 * Circle(Point center, int radius) 호출 
		 * 호출하기전에 Point클래스의 생성자중 
		 *  public Point(int x,int y)호출하고 
		 *  Circle(Point center, int radius)을 호출하면서 
		 *  지역변수 center에게 point의 주소를 넘겨줌
		 */
		this(new Point(0,0),100);
		
	}

	public Circle(Point center, int radius) {
		super();
		this.center = center;
		this.radius = radius;
	}

	/*
	 * 조상클래스의 멤버메서드인 Draw()를 오버라이딩(재정의) 함 
	 * 원을 그리는 대신 정보 출력
	 *  (오버라이딩 선언부가 무조건 같다.구현부만다르게 구현)
	 */
	
	@Override
	public void	Draw() {
		System.out.println("색깔 :"+ this.color);
		System.out.println("원점 : (x : "+this.center.x + ", y : "+this.center.y+")");
		System.out.println("반지름 : " + this.radius);
	}

}
