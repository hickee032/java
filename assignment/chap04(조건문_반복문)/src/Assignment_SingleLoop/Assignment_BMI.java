package Assignment_SingleLoop;

import java.util.Scanner;

public class Assignment_BMI {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Double weight = 0.0; //weight 0.0���� �ʱ�ȭ ������
		Double height = 0.0; //height 0.0���� �ʱ�ȭ Ű
		
		System.out.print("Ű(m) �Է�  : ");
		height = scan.nextDouble(); //�Է½�Ʈ��  ����(�Ǽ�)���̱� ������ nextDouble�� �Է� �޴´�.
		
		System.out.print("������ �Է�  : ");
		weight = scan.nextDouble(); 
		
		Double bmi = 0.0; //bmi 0.0 �ʱ�ȭ  
		                  // weight/height*height ����� ���
		
		//bmi ����
		bmi = weight/(height*height);

		//���׿�����
		 String result = (bmi >= 20) && (bmi <25) ? "ǥ���Դϴ�." : "ü�߰����� �ʿ��մϴ�.";
		 
		 
		 System.out.println(result);
		 
		 if ((bmi>=20) && (bmi<25)) {
			 System.out.println("ǥ���Դϴ�.");	  }
		 
		 else {
			 System.out.println("ü�߰����� �ʿ��մϴ�.");  }	
		 
		 scan.close();
}
}
