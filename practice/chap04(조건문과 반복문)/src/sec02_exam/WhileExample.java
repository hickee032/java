package sec02_exam;

public class WhileExample {

	public static void main(String[] args) {

		int sum = 0;
		int i =1;
		//i��100�� �ɶ�����
		
		while(i<=100) {
			sum += i; //i���� ����
			i++;
		}
		System.out.println("1~"+ (i-1)+ "��:" + sum);
	}

}
