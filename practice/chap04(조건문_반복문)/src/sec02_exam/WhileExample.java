package sec02_exam;

public class WhileExample {

	public static void main(String[] args) {

		int sum = 0;
		int i =1;
		//i가100이 될때까지
		
		while(i<=100) {
			sum += i; //i값을 누적
			i++;
		}
		System.out.println("1~"+ (i-1)+ "합:" + sum);
	}

}
