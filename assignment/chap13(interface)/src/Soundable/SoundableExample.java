package Soundable;

public class SoundableExample {

	public static void main(String[] arug) {
		
		
		

		Soundable n = new Soundable() {

			@Override
			public void sound() {
				System.out.println("첫번째 익명구현객체 :냄비");
				System.out.println("냄비에 물을 담습니다.");

			}
	
		};
		
		
		
		Soundable g = new Soundable() {

			@Override
			public void sound() {
				System.out.println("두번째 익명구현객체 :가스렌지");
				System.out.println("가스렌지에 가스를 켭니다.");

			}

		};
		n.sound();
		g.sound();
	}

}
