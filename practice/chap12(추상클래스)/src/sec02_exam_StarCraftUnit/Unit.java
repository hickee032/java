package sec02_exam_StarCraftUnit;

//추상 클래스 추상 메서드 (move())를 포함 하고 있다. 1개이상의 추상 메서드를 포함하고있을 경우 = 추상 클래스
//인스턴스를 생성할수 없다.
public abstract class Unit {
	
	int x;
	int y;
	String str;
	
	//추상 메서드 구현부가 없다.
	public abstract void move(int x, int y);
	
	public void stop(String str, int x, int y) {
		this.x = x;
		this.y = y;
		this.str = str;
		System.out.println("현재위치 : " + this.x+","+this.y+" 에 "+this.str+" 멈춤");
		
	}

}
