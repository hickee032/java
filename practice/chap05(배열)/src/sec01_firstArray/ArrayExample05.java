package sec01_firstArray;

public class ArrayExample05 {

	public static void main(String[] args) {

int[] arr = new int[5];// �����������

for(int i=0; i< arr.length;i++) {
	arr[i] = i+1; //�迭arr�� 1~5�� ����
}
System.out.println("������ - arr.length : " +arr.length);
for(int i=0; i <arr.length;i++) {
	System.out.println("arr["+i+"]:"+arr[i]);
}
int[] tmp = new int[arr.length*2];
 //�迭 arr�� ����� ���� �迭 tmp�� ����
for(int i=0; i<arr.length;i++) {
	tmp[i] =arr[i];
}
arr = tmp; //tmp�� ����� �ּҰ��� ����
System.out.println("������ - arr.length : " +arr.length);
for(int i=0; i <arr.length;i++) {
	System.out.println("arr["+i+"]"+arr[i]);
}
	}

}
