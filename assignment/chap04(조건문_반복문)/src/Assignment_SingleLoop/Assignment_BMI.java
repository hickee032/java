package Assignment_SingleLoop;

import java.util.Scanner;

public class Assignment_BMI {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Double weight = 0.0; //weight 0.0으로 초기화 몸무게
		Double height = 0.0; //height 0.0으로 초기화 키
		
		System.out.print("키(m) 입력  : ");
		height = scan.nextDouble(); //입력스트링  더블(실수)값이기 떄문에 nextDouble로 입력 받는다.
		
		System.out.print("몸무게 입력  : ");
		weight = scan.nextDouble(); 
		
		Double bmi = 0.0; //bmi 0.0 초기화  
		                  // weight/height*height 계산의 결과
		
		//bmi 공식
		bmi = weight/(height*height);

		//삼항연산자
		 String result = (bmi >= 20) && (bmi <25) ? "표준입니다." : "체중관리가 필요합니다.";
		 
		 
		 System.out.println(result);
		 
		 if ((bmi>=20) && (bmi<25)) {
			 System.out.println("표준입니다.");	  }
		 
		 else {
			 System.out.println("체중관리가 필요합니다.");  }	
		 
		 scan.close();
}
}
