package Assignment_04_Circle;

public class Circle_Class {

	int radius;
	String name = "자바 피자";

	// double getArea;
	// = radius * radius * 3.14;;

	public double getArea() {

		return radius * radius * 3.14;
	}

	public String toString() {
		return name + "의 면적은 ";

	}
}
