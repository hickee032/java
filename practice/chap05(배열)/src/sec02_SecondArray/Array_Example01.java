package sec02_SecondArray;

public class Array_Example01 {

	public static void main(String[] args) {
		
		int[][] score = new int [][] {
										{100,100,100},
										{ 20, 20, 20},
										{ 30, 30, 30},  //0부터 시작하니까 30을 접근하기위해서는 score[2][3]
										{ 40, 40, 40}
									};
									
		// score[i][j] 변수와 동일
		int sum = 0;
		System.out.println("2차원 배열주소값 : " + score); //[[I@15db9742 2차원 배열의 경우 주소값에서 [[
													 //[I@6d06d69c 1차원 배열의 경우 주소값에서 [
		System.out.println("score의 길이" + score.length);
		//2차원 배열에 접근하기 위해 중복 for문을 사용
		
		//아래 for문의 경우 2차원 배열의 값 을 단순히 출력하고있다. (12번 반복)
		//공식은 1차원 배열의경우에는 싱글루프 2차원 배열의 경우 더블루프
		for(int i=0; i<score.length; i++) {
			//2차원 배열에서는 1차원 배열의 값이 주소가 되기 때문에  아래에 출력해보았다.
			System.out.println("1차원 배열의 주소값" + score[i]);
			for(int j=0 ;j<score[i].length; j++) {
				System.out.println("score["+i+"]"+"["+j+"] =" + " " +score[i][j]);
				
			}	
		}
		//향상된 for문 JDK1.5이상
		//후에 컬렉션 프레임 웍 부분에서 객체를 접근할때 아래와 같이
		//향상된 for문을 사용
		//가져올 타입 변수 :가져올 장소(주소)
		for(int[] tmp :score) {
			//1차원 배열타입
			for(int i :tmp) {
				sum += i;
			}
		}
		System.out.println("sum = " + sum);
	}

}
