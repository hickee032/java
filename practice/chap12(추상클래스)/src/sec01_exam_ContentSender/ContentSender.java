package sec01_exam_ContentSender;

//추상클래스란? 1개이상의 추상 메서드를 포함 하고있는 클래스
//추상클래스는 인스턴스를 생성할수 없다.
public abstract class ContentSender {

	//필드
	String title;
	String nm;
	
	public ContentSender(String title,String nm) {
		this.title = title;
		this.nm = nm;
	}
	//추상메서드 상속을 통해서 반드시 재정의 (오버라이딩) 되어야만
	//비로소 인스턴스를 생성할수 있다.(중요)
	abstract void sendMsg(String content);
}
