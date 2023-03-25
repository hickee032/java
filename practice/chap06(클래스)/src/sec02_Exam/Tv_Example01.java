package sec02_Exam;

public class Tv_Example01 {

	public static void main(String[] args) {
		
		Tv t = null; // 인스턴스를 창조하기위해 t null초기화
		t = new Tv();//인스턴스 생성 생성자 호출
		
		t.channel=7;//멤버변수
		t.channelDown();
		System.out.println(t.channel);
		
	}

}
