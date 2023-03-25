package sec01_exam_OverraidingExample;

public class UsbMemory extends HDDdisk {
	
	int capacity;
	int rpm;
	
	//조상 클래스의 생성자 호출 . 자기자신의 멤버변수 초기화
	public UsbMemory(int capacity,int rpm) {
		super(10,50);
		this.capacity = capacity;
		this.rpm = rpm;
		
	}
	
	@Override
	public String toString() {
		
		return "USB메모리 용량은"+super.capacity+"GB, RPM은"+super.rpm;
	}

}
