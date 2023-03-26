package Assignment_04_Circle;

public class Circle_Example {

	public static void main(String[] args) {
		
	Circle_Class Circle = new Circle_Class();
	
	Circle.radius = 10;
		
	System.out.print(Circle);
	System.out.println(Circle.getArea());
	
	Circle.radius = 2;
	Circle.name = "ÀÚ¹Ù µµ³Ó";
	
	
	System.out.print(Circle);
	System.out.println(Circle.getArea());
	}

}
