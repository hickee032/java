package Phone;

//���� Ŭ���� & �߻� Ŭ����
public abstract class Phone {

	String owner;

	public Phone(String owner) {
		this.owner = owner;
		System.out.println(this.getOwner() + " �� ���Դϴ�.");
		//String str = this.owner + " �� ���Դϴ�.";

	}

	

	public String getOwner() {
		return owner;
	}



	abstract void turnOn();

	abstract void turnOff();
}
