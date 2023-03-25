package sec01_firstArray;

public class ArrayExample02 {

	public static void main(String[] args) {

	int sum = 0; //총점을 저장하기 위한 변수
	//float average = 0.0f; //(float)을 붙여준다
	Double average = 0.0;
	
	//선언과 동시에 초기화
				//new int[] 컴파일러가 알아서 {}값을 지정  이경우는 5
	int[] score = new int[] {100, 88, 100, 100, 90};
	
	System.out.println("배열의 길이" + score.length);
	
	for(int i=0;i<score.length;i++) {
		System.out.println("더해지는 값"+score[i]); //출력을 해보면 디버깅 없어도 값을 알수있다.
		sum +=score[i]; //+= 복합대입연산자
		}
		average =  sum /(double)score.length;
		//average =  sum /(float)score.length;
		//float + int = float
		//char + int = int
		//애니타입 +"문자열" = 문자열
		System.out.println("총점"+sum);
		System.out.println("평균"+average);
	}
	}


