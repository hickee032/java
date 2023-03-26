package MammalFish;

public class Whale extends Fish implements Mammal {

	@Override //새끼
	public void bear(Object obj,String str) {
		if(obj instanceof Mammal) {
			System.out.println(str+" 는 새끼를 낳습니다.");
		}
		else {
			System.out.println(obj+" 는 새끼를 낳지 않습니다.");
		}
		
	//System.out.println("고래는 새끼를 낳습니다.");
		
	}

	@Override //헤엄
	void swim(Object obj,String str) {
		if(obj instanceof Whale) {
			System.out.println(obj+"헤엄치며 움직입니다");
		}
		else {
			System.out.println(obj+"헤엄치지 못합니다.");
		}
		
	}

	
	
}
