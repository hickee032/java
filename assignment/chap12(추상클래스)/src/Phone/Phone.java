package Phone;

//조상 클래스 & 추상 클래스
public abstract class Phone {

	String owner;

	public Phone(String owner) {
		this.owner = owner;
		System.out.println(this.getOwner() + " 의 폰입니다.");
		//String str = this.owner + " 의 폰입니다.";

	}

	

	public String getOwner() {
		return owner;
	}



	abstract void turnOn();

	abstract void turnOff();
}
