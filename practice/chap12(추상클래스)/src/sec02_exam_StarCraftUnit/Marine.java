package sec02_exam_StarCraftUnit;

public class Marine extends Unit {
	
	String str;
	
	public Marine() {}

	@Override
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		
		System.out.println("마린의 위치 : "+this.x+","+this.y+"로 이동");
		
		
	}
	
	public void steamMode() {
		this.str = "공격 모드 : 스팀팩 장전";
		System.out.println(this.str);
	}

}


