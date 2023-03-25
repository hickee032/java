package sec01_exam;

public class VarEx1 {
	
	public static void main(String[] args) {
		
		int year = 0;
		int age = 14;
		boolean t = true;
		
		System.out.println("year =" + year + " age =" + age);
		System.out.println(year);
		//변수명 대입하고 출력후, 개행한다.
		System.out.println(age + " " + "김진환" +" " + t);
		System.out.println();
		
		year = age +2000; //변수 age값에 2000을 더해서 변수 year에 저장
		age = age + 1; //변수 age에 저장된 값을 1증가시칸다.
		
		System.out.println(year);
		System.out.println(age);		
	}
}
