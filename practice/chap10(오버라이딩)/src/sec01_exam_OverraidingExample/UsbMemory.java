package sec01_exam_OverraidingExample;

public class UsbMemory extends HDDdisk {
	
	int capacity;
	int rpm;
	
	//���� Ŭ������ ������ ȣ�� . �ڱ��ڽ��� ������� �ʱ�ȭ
	public UsbMemory(int capacity,int rpm) {
		super(10,50);
		this.capacity = capacity;
		this.rpm = rpm;
		
	}
	
	@Override
	public String toString() {
		
		return "USB�޸� �뷮��"+super.capacity+"GB, RPM��"+super.rpm;
	}

}
