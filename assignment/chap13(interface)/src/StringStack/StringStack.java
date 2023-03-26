package StringStack;

import java.util.Scanner;

public class StringStack implements Stack {

	Scanner scan = new Scanner(System.in);

	private String[] arr;
	private int i;

	@Override // arr배열의 길이
	public int length() {
		System.out.print("스택영역 입력");
		i = scan.nextInt();
		scan.nextLine();
		arr = new String[i];
		System.out.println(i + "개의 스택영역이 생성되었습니다.");
		return i;
	}

	@Override // arr 배열값을 리턴
	public Object pop() {
//		System.out.println("스택은 후입선출 개념입니다.(LIFO)\r\n" + "스택에 있는 문장들을 출력합니다.");
//
//		for (int i = arr.length-1; i >=0 ; i--) {
//			System.out.println((i+1) + "스택에 저장된 문장을 출력합니다.");
//			System.out.println(arr[i]);}
		if (this.i == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		this.i--;// String 배열에서 꺼내가기 때문에 인덱스 감소
		return this.arr[this.i];
	}

	@Override // arr배열의 값을 입력 저장
	public void push(Object o) {
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print("저장하고 싶은 문장을 입력하세요 : ");
//			arr[i] = scan.nextLine();
//			System.out.println(arr[i] + " 가 스택에 저장 되었습니다.");
//			System.out.println(arr[i] + " 가 " + (i+1) + " 에 저장");
//		}

		// String 타입 체크
		if (this.i == this.arr.length) {
			System.out.println("스택이 오버플로우 발생.");
			return;
		}

		if (o instanceof String) {
			String str = (String) o; // 강제 캐스팅 = 다운 캐스팅
			this.arr[this.i] = str; // String []에다가 저장.
			this.i++;
		}

	}

	public String[] getArr() {
		return arr;
	}

}
