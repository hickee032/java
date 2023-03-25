package sec02_Exam;

public class Tv_Example03 {

	public static void main(String[] args) {
		
		Tv[] tvArr = new Tv[3];//길이 3인  tv배열 생성
		// tv 객체 배열 = 2차원 배열의 형태다.
		// attach 작업이 필요하다.(필수적)
		// 방만 할당하는 것 (메모리에 할당) 주소 할당
		int i =0;
		
		for (i=0; i <tvArr.length ; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10; //tvArr[i] 에 i+10저장
			System.out.println(tvArr[i].channel);
		}
		for (i=0; i <tvArr.length ; i++) {
			tvArr[i].channelUp(); //tvArr[i] 매서드 호출  채널이 1증가
			System.out.printf("tvArr[%d].channel=%2d %n",i,tvArr[i].channel);
		}
		System.out.println();
		//향상된 for
		//가져올 타입 : 가져올 장소
		for(Tv tv:tvArr) {
			tv=new Tv();
			tv.channel=10; //tvArr 새로운 인스턴스 생성 channel에 10 저장
			System.out.println(tv.channel);
		}
	}

}
