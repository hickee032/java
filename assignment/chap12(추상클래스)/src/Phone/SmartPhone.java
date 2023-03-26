package Phone;

public class SmartPhone extends Phone {

	public SmartPhone(String owner) {
		super(owner);
	}
	
	
	public void internetSearch() {
		System.out.println("네이버 검색 시작");
	}

	@Override
	public void turnOn() {
		System.out.println("power on");
		this.internetSearch();

	}

	@Override
	public void turnOff() {
		System.out.println("power off");

	}

}
