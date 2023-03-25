package sec01_exam;

public class IncreDecreOperatorEx {

	public static void main(String[] args) {
		
		int x =10;
		int y =10;
		int z = 0;
		
		System.out.println("------------------");
		System.out.println("x=" + x++); //10
		x++;  //후위증가 11+1
		++x; //전위 증가 12+1
		System.out.println("x=" + x++); //13
		System.out.println("x=" + x); //14
		
		System.out.println("------------------");
		y--;/// 10-1
		--y;//9-1
		System.out.println("y=" + y); //8
		
		System.out.println("------------------");
		z=x++; ///14
		System.out.println("z=" + z); //14
		System.out.println("x=" + x); //15
		
		System.out.println("------------------");
		z=++x; //15+1
		System.out.println("z=" + z); //16
		System.out.println("x=" + x); //16
		
		System.out.println("------------------");
		z = (++x) +(y++); //(16+1)+8
		System.out.println("z=" + z); // 25
		System.out.println("x=" + x); //17
		System.out.println("y=" + y); //9

	}
}
