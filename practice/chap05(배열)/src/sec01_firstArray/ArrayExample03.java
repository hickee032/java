package sec01_firstArray;

import java.util.Arrays;

public class ArrayExample03 {

	public static void main(String[] args) {


		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10]; //선언과 0으로 자동 초기화 40byte
		int[] iArr3 = new int[] {100,95,80,70,60};
		int[] iArr4 = new int[] {100,95,80,70,60};
		
		char[] chArr = new char[] {'a','b','c','d'}; //8byte char=2byte
		
		System.out.print("배열i의 초기화 값 : ");
		
		for(int i =0; i<iArr1.length;i++) {
			System.out.print(iArr1[i]);
		}
				System.out.println();
				
				for (int i=0;i<iArr1.length;i++) {
					iArr1[i] = i + 1; //1~10의 숫자를 순서대로 배열에 넣는 다.
					}
				
				for (int i=0;i<iArr2.length;i++) {
					iArr2[i] = (int)(Math.random()*10) +1; //1~10의 값을 배열에 저장
					}
				
				//배열에 저장된 값 출력
				for (int i=0;i<iArr1.length;i++) {
					if(i==9) {
						System.out.print(iArr1[i]);
					}
					else {
						System.out.print(iArr1[i]+",");
					}
					
				}
					System.out.println();
					//int[] 에서 toString 호출 할 경우 String 형태로 반환
					System.out.println(Arrays.toString(iArr2));//[배열값, 배열값,...형태 출력
										//정적 매서드 호출  class + . to iArr 
					System.out.println(Arrays.toString(iArr3));
					System.out.println(Arrays.toString(iArr4));
					
					System.out.println(Arrays.toString(chArr));
					
					System.out.println(iArr3.toString());
					System.out.println(iArr3);
					System.out.println(chArr.toString());
					//char타입은 toString 호출 해야 주소값
					System.out.println(chArr.toString());
					System.out.println(chArr); //값을 출력 (char배열만)
				}
	}
	


