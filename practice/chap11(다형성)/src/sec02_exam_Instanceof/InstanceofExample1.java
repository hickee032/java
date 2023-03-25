package sec02_exam_Instanceof;

//���� Ŭ����
class Car{
	
}

//�ڼ� Ŭ����
class FireEngine extends Car {
	
}

class Ambulance extends Car {
	
}

//ctrl+t�� ��Ӱ������� �����ش�.
//��Ӱ������� �׷�����.
public class InstanceofExample1 {

	public static void main(String[] args) {
	
		FireEngine fe  = new FireEngine();
		
		//instanceof �����ڰ� ���� �� ����ȯ�� �����ϴ�.
		if(fe instanceof FireEngine) {
			System.out.println("this is a FireEngine instance");
		}
		if(fe instanceof Car) {
			System.out.println("this is a Car instance");
		}
		if(fe instanceof Object) {
			System.out.println("this is a Object instance");
		}
		//�Ʒ� ���ܰ� �߻��ϴ� ������ FireEngine�� Ambulance�� �ƹ��� ���谡 ����. (�ٺ��� �ٸ���.)
		if(fe instanceof Ambulance) {
			System.out.println("this is a Object instance");
		}
	}

}
