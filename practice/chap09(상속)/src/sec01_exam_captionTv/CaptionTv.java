package sec01_exam_captionTv;

//자손클래스(자식클래스,sub)멤버갯수 7개
//Tv ,CaptionTv 간에 직접적 관계 형성
public class CaptionTv extends Tv {

	boolean caption; // 캡션상태 온 오프

	public CaptionTv() {
		super();// 조상클래스의 기본 생성자의 호출 //매개변수가 있는 생성자가 있다면 반드시 super(); 가 반드시 있어야 한다.
		System.out.println("자손 클래스의 생성자 호출");
	}

	public void display(String text) {

		// 1번째 호출시에는 false 2번째는 true
		// caption on(true)일때만 text를 보여준다.
		if (this.caption) {
			System.out.println(text);
		}
	}
}
