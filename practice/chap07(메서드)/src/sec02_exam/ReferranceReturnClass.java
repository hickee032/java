package sec02_exam;

public class ReferranceReturnClass {

	public static void main(String[] args) {

		Data d = new Data();
		d.x = 10;
		
		//copy()�޼���� �Ű������� dataŸ���� �ν��Ͻ��ּҸ� ������ �ִ�
		//�ƿ﷯ ������ �޴µ� dataŬ���� Ÿ������ �ް��ִ�.
		Data result = ReferranceReturnClass.copy(d);
		
		System.out.println("���� �޼��忡�� d �ּҰ� : "+result);
		System.out.println("���� �޼��忡�� copy()�޼��带 ȣ���ϰ� ���� ���� �ּҰ� : "+result);
		System.out.println("d.x :" + d.x);
		System.out.println("result.x :" + result.x);
	}
	
	public static Data copy(Data d) {
		Data d2 = new Data();
			d2.x=d.x;
			System.out.println("copy �޼��忡�� ���� d2 : "+d2);		
		
			//���� Ÿ�� ������ Ŭ���� Ÿ���̹Ƿ� ���� ���� �ݵ�� ������ Ŭ������ �ν��Ͻ��� �ּҰ� �ȴ�. 
		return d2;
	}

}
