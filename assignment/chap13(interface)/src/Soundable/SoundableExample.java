package Soundable;

public class SoundableExample {

	public static void main(String[] arug) {
		
		
		

		Soundable n = new Soundable() {

			@Override
			public void sound() {
				System.out.println("ù��° �͸�����ü :����");
				System.out.println("���� ���� ����ϴ�.");

			}
	
		};
		
		
		
		Soundable g = new Soundable() {

			@Override
			public void sound() {
				System.out.println("�ι�° �͸�����ü :��������");
				System.out.println("���������� ������ �մϴ�.");

			}

		};
		n.sound();
		g.sound();
	}

}
