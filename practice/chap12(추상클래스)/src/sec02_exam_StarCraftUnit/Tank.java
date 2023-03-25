package sec02_exam_StarCraftUnit;

public class Tank extends Unit{
	
	String str;
	
	public Tank() {}

	@Override
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		
		System.out.println("탱크의 위치 : "+this.x+","+this.y+"로 이동");
		
		
	}
	
	public void sizeMode() {
		this.str = "공격모드 : 시즈 모드";
		System.out.println(this.str);
	}

}
