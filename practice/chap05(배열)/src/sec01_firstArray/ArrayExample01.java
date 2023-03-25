package sec01_firstArray;

public class ArrayExample01 {

	public static void main(String[] args) {
			//int형 배열명 score(참조변수)에 int[5] = 20바이트 생성후 주소값 넘김
		int[] score = new int[10]; //10개의 방을 0으로 자동 초기화 //배열명은 주소를 가르킨다.
		
		int k=1;
		score[0]=50;
		score[1]=60;	// score[1] = 변수와 동일
		score[k+1]=70; //score[2] = 70
		score[3]=80;
		score[4]=90;
		//score : int[] 주소값 저장
		//score[i] 인덱스에 있는 실제값을 의미
		
		int tmp = score[k+2] +score[4];
		
		//for문으로 배열의 모든 요소 출력
		for (int i=0; i<score.length; i++) {
			//           0~n-1까지  9까지
			System.out.println("score["+i+"]"+score[i]);
		}
		System.out.println("tmp :"+ tmp);
		System.out.println("score[7] :" + score[7]);
		System.out.println(score); //주소갑 출력
}
}