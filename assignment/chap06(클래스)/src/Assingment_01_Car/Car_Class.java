package Assingment_01_Car;

public class Car_Class {
	
	String 	company = "현대자동차";
	String 	model = "그랜저";
	String 	color = "검정";
	
	String [] cArr = new String [5];
	
//	for (i = 0; i < Car.cArr.length; i++) {
//		cArr[i] = "인스턴스 생성";
//
//		System.out.println("cArr[" + i + "] " + cArr[i]);
//	}
//	
	
	int maxSpeed = 350;
	int speed;
	
	@Override
	public String toString() {
	 return " 제작회사 : " + this.company + "\n 모델명 : " + this.model + "\n 색깔 : " + this.color
			 +"\n 최고속도 : " +this.maxSpeed + "\n 현재속도 : " + speed;
	}
}



