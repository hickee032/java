package sec01_exam_OverraidingExample;

public class HDDExample {

	public static void main(String[] args) {
		
		//�ν��Ͻ�����.
		HDDdisk hd = new HDDdisk(500,720);
		
		UsbMemory um = new UsbMemory(32, 520);
		
		String strhd = hd.status();
		
		
		System.out.println(strhd);
		
		String strum = um.status();
		
		System.out.println(strum);

	}

}
