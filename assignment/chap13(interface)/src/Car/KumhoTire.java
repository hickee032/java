package Car;

public class KumhoTire implements Tire {

	static int i;
	
	@Override
	public void roll() {
		
		System.out.println((++i)+"번째 금호 타이어가 굴러갑니다.");
		
	}
	
	

}
