package Car;

public class HankookTire implements Tire {

	static int i;
	
	@Override
	public void roll() {		
		System.out.println((++i)+"��° �ѱ� Ÿ�̾ �������ϴ�.");
		
	}
	
	

}
