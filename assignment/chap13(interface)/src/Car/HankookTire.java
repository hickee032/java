package Car;

public class HankookTire implements Tire {

	static int i;
	
	@Override
	public void roll() {		
		System.out.println((++i)+"번째 한국 타이어가 굴러갑니다.");
		
	}
	
	

}
