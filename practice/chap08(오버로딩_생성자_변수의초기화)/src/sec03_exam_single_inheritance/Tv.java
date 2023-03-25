package sec03_exam_single_inheritance;

public class Tv {
	
	boolean power;
	int channel = 10;
	
	public  Tv() {
		super();//object생성자 호출
		System.out.println("Tv조상클래스 생성자 호출");
		
	}
	
	public void power() {
		this.power = !this.power;
		System.out.println("조상 클래스 Tv의 power메서드 호출");
	}
	
	public void channelUp() {
		++this.channel;
		System.out.println("조상 클래스 Tv의 channerUp메서드 호출");
		
	}
	
	public void channelDown() {
		--this.channel;
		System.out.println("조상 클래스 Tv의 channerDown메서드 호출");
		
	}

}
