package Assingment_01_Car;

public class Car_Class {
	
	String 	company = "�����ڵ���";
	String 	model = "�׷���";
	String 	color = "����";
	
	String [] cArr = new String [5];
	
//	for (i = 0; i < Car.cArr.length; i++) {
//		cArr[i] = "�ν��Ͻ� ����";
//
//		System.out.println("cArr[" + i + "] " + cArr[i]);
//	}
//	
	
	int maxSpeed = 350;
	int speed;
	
	@Override
	public String toString() {
	 return " ����ȸ�� : " + this.company + "\n �𵨸� : " + this.model + "\n ���� : " + this.color
			 +"\n �ְ�ӵ� : " +this.maxSpeed + "\n ����ӵ� : " + speed;
	}
}



