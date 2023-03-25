package sec02_exam;

public class ForExample_2 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 0;   
		
		for(i=1;i<=100;i++) {
			sum += i; //복합대입연산자
		}
		System.out.println("1~"+ (i-1)+ "합:" + sum);
	}

}
