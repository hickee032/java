package sec01_exam;

public class SwitchCharExample {

	public static void main(String[] args) {

		char grade = 'B';
		switch(grade) {
		case'A':
		case'B':
			System.out.println("���ȸ��");
			break;
		case'b':
		case'd':
			System.out.println("�Ϲ�ȸ��");
			break;
			//default�� �ɼ�
		default:	
			System.out.println("�մ�");
			
		}

	}

}
