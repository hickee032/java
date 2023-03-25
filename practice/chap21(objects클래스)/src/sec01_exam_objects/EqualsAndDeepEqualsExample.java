package sec01_exam_objects;

import java.util.Arrays;
import java.util.Objects;

public class EqualsAndDeepEqualsExample {

	public static void main(String[] args) {
		
		Integer o1 = new Integer(1000);
		Integer o2 = new Integer(1000);
		
		//��� ���尴ü WrapperŬ������ equals()�� �������̵� �Ǿ��ִ�.
		System.out.println(o1.equals(o2));
		
//		���� ���� ������ �Ǵ� ��ü�� �񱳰� �Ǵ� ��ü�� �и��س��� ���� �� �ٸ��Ͱ� ���ҷ��� ��� ������ �ٲ� �ʿ䰡 �����Ѵ�.
//		������ �Ʒ��� ���� Objects.equals()���������� ����� �����ϴ�-->������ �� ������� ���ϰ� .
		
		//���� ���� ���鿡�� Objects.equals(,)�� �� ����.
		System.out.println(Objects.equals(o1, o2));
		
		Integer[] arr1 = {new Integer(1),new Integer(2)};
		Integer[] arr2 = {1,2};
		
		//Objects.equals() --> ���� Ÿ���� ������ �ּ� ��
		System.out.println(Objects.equals(arr1, arr2));
		
		//Objects.deepEquals() --> ������
		//Arrays.deepEquals() ��
		System.out.println(Objects.deepEquals(arr1, arr2));
		System.out.println(Arrays.deepEquals(arr1, arr2));
							
				
		

	}

}
