package sec01_exam;

public class IfDiceExample {

	public static void main(String[] args) {
		/*
		 * Math.random()��0.0~0.9999999������ ���ǰ� ��ȯ �׷��� int ������ ����ĳ������ �ڱⰡ ���ϴ� ���� ���ϰ� 1��
		 * ������
		 */

		int num = (int)(Math.random()*6) +1;
		//System.out.println(Math.random());
		
		if(num==1) {
			System.out.println("1���� ���Խ��ϴ�.");
		}
		else if(num==2) {
			System.out.println("2���� ���Խ��ϴ�.");
		}
		else if(num==3) {
			System.out.println("3���� ���Խ��ϴ�.");
		}
		else if(num==4) {
			System.out.println("4���� ���Խ��ϴ�.");
		}
		else if(num==5) {
			System.out.println("5���� ���Խ��ϴ�.");
		}
		else {
			System.out.println("6���� ���Խ��ϴ�.");
		}

	}

}
