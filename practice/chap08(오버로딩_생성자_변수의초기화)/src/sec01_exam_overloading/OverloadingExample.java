package sec01_exam_overloading;

public class OverloadingExample {

	public static void main(String[] args) {
		
		Overloading mm = new Overloading();
		
		System.out.println("Overloading add(3,3) ��� : " + mm.add(3,3));
		System.out.println("Overloading add(3L,3) ��� : " + mm.add(3L,3));
		System.out.println("Overloading add(3,3L) ��� : " + mm.add(3,3L));
		System.out.println("Overloading add(3L,3L) ��� : " + mm.add(3L,3L));
		
		int [] a = new int [] {100,200,300};
		
		System.out.println("Overloading.add(a) ��� : " +mm.add(a));
		System.out.println("Overloading.add(a) ��� : " +mm.add(new int[] {500,600,700}));

	}

}
