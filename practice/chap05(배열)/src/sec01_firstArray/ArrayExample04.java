package sec01_firstArray;

public class ArrayExample04 {

	public static void main(String[] args) {
			//��Ʈ���� Ŭ������
		String[] names = new String[3];
		
		//attach
		names[0] = new String ("�迬��");
		names[1] = new String ("�տ���");
		names[2] = new String ("����");
		
		for(int i=0; i< names.length; i++) {
			System.out.println("names[" + i + "]:" +names[i]);
		}											//names[i].toString ��Ʈ�� Ÿ���̱� ������ toString�� �ڵ�
		
		String tmp = names[2];
		
		
		System.out.println("tmp: " + tmp);

		names[0] = "Yu";
		
		for(int i=0;i<names.length;i++) {
			System.out.println("names[" + i + "]:" +names[i]);
		}
	}

}
