package sec05_Throw;

public class ThrowExample03 {

	public static void main(String[] args) {
		
		String file1 = ThrowExample03.createFile("test.txt");
		String file2 = ThrowExample03.createFile("");
		System.out.println(file1+"������ ���������� ����");
		System.out.println(file2+"������ ���������� ����");
	}
	public static String createFile(String filename) {
		try {
			if(filename==null||filename.equals("")){
				throw new Exception("�����̸��� ��ȿ���� �ʽ��ϴ�."); //���� ���� �߻�
			}
		
		} catch (Exception e) {
			filename = "���� ����.txt";
		}
		return filename; //�����̸��� "���� ����.txt"���� ������.
						 //�׷��� ������� ������ ������.
	}
}
