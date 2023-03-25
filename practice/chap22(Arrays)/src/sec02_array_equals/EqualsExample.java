package sec02_array_equals;

import java.util.Arrays;
import java.util.Objects;

//class Car {
//	String model;
//
//	public Car(String model) {
//		this.model = model;
//
//	}
//
////	@Override
////	public String toString() {
////
////		return this.model;
////	}
//}

public class EqualsExample {

	public static void main(String[] args) {

//		Car[] c1 = new Car[2];
//		c1[0] = new Car("�׷���");
//		c1[1] = new Car("Ʈ��");
//
//		Car[] c2 = Arrays.copyOf(c1, c1.length);
//
//		// Arrays.equals()-----���� �񱳸� �Ѵ�.
//
//		System.out.println("��ü �迭�� ���� �� �� : " + Arrays.equals(c1, c2));
//		System.out.println("��ü �迭�� ���� �� �� : " + Objects.equals(c1, c2));
//		System.out.println("c1 �迭�� ������ : " + c1);
//		System.out.println("c2 �迭�� ������ : " + c2);
//
//		// Arrays.deepEquals()-----���� �񱳸� �Ѵ�.
//		System.out.println("��ü �迭�� ���� �� �� : " + Arrays.deepEquals(c1, c2));
//		System.out.println("c1[0] �迭�� ������ : " + c1[0]);
//		System.out.println("c2[0] �迭�� ������ : " + c2[0]);
//		System.out.println("c1[1] �迭�� ������ : " + c1[1]);
//		System.out.println("c2[1] �迭�� ������ : " + c2[1]);

		//2���� �迭 ����
		   int[][] original = new int[][]{   
		                              { 1, 2 },
		                              { 3, 4 } 
		                          };
		   
		   //���� ���� �� ��
		   System.out.println("[���� ������ ��]");
		   //2���� �迭 �� ����
		   int[][] cloned1 = Arrays.copyOf(original, original.length);   
		   //Object�� equals���� ��
		   System.out.println("�迭 ���� ��: " + original.equals(cloned1)); 
		   System.out.println("original�迭 ���� : " + original);
		   System.out.println("cloned1 �迭 ���� : " + cloned1);   
		   System.out.println();   
		   System.out.println("1�� �迭 �׸� ��: " + Arrays.equals(original, cloned1));
		   System.out.println("original[0]�迭 ���� : " + original[0]);
		   System.out.println("cloned1[0] �迭 ���� : " + cloned1[0]);
		   System.out.println("original[1]�迭 ���� : " + original[1]);
		   System.out.println("cloned1[1] �迭 ���� : " + cloned1[1]);   
		   System.out.println();   
		   System.out.println("��ø ��`�� �׸� ��: " + Arrays.deepEquals(original, cloned1));
		   System.out.println("original[0][0]�� : " + original[0][0]);
		   System.out.println("cloned1[0][0]�� : " + cloned1[0][0]);
		   System.out.println("original[0][1]�� : " + original[0][1]);
		   System.out.println("cloned1[0][1]�� : " + cloned1[0][1]);
		   System.out.println("original[1][0]�� : " + original[1][0]);
		   System.out.println("cloned1[1][0]�� : " + cloned1[1][0]);
		   System.out.println("original[1][1]�� : " + original[1][1]);
		   System.out.println("cloned1[1][1]�� : " + cloned1[1][1]);
		   
		   //���� ������ ��
		   System.out.println("\n[���� ������ ��]");
		   int[][] cloned2 = Arrays.copyOf(original, original.length);  //2���� �迭 �� ����
		   
		   cloned2[0] = Arrays.copyOf(original[0], original[0].length); //1���� �迭 ������
		   cloned2[1] = Arrays.copyOf(original[1], original[1].length); //1���� �迭 ������
		   
		   System.out.println("�迭 ���� ��: " + original.equals(cloned2));
		   System.out.println("original�迭 ���� : " + original);
		   System.out.println("cloned2 �迭 ���� : " + cloned2);   
		   System.out.println();   
		   System.out.println("1�� �迭 �׸� ��: " + Arrays.equals(original, cloned2));
		   System.out.println("original[0]�迭 ���� : " + original[0]);
		   System.out.println("cloned2[0] �迭 ���� : " + cloned2[0]);
		   System.out.println("original[1]�迭 ���� : " + original[1]);
		   System.out.println("cloned2[1] �迭 ���� : " + cloned2[1]);   
		   System.out.println();   
		   System.out.println("��ø �迭 �׸� ��: " + Arrays.deepEquals(original, cloned2));
		   System.out.println("original[0][0]�� : " + original[0][0]);
		   System.out.println("cloned2[0][0]�� : " + cloned2[0][0]);
		   System.out.println("original[0][1]�� : " + original[0][1]);
		   System.out.println("cloned2[0][1]�� : " + cloned2[0][1]);
		   System.out.println("original[1][0]�� : " + original[1][0]);
		   System.out.println("cloned2[1][0]�� : " + cloned2[1][0]);
		   System.out.println("original[1][1]�� : " + original[1][1]);
		   System.out.println("cloned2[1][1]�� : " + cloned2[1][1]);
	}

}
