package sec01_exam_FighterExample;

public class FighterExample {

	public static void main(String[] args) {

		Fighter f = new Fighter();

		/*
		 * 인터페이스 필드의 다형성 - 인터페이스도 일종의 조상이다. 근본을 벗어나지 못하므로 Fighter인스턴스의 있는 메서드 근본에 있는 멤버만
		 * 사용이 가능하다.
		 */
		// Fightable fi = new Fighter();
		// Moveable mi = new Fighter();
		// Attackable ai = new Fighter();
		
		// 클래스간 상속을 전제하고 있을때 필드의 다형성
		// Unit u = new Fighter();

		/*
		 * u. 
		 * f. 근본에 따라 사용할수 있는 메서드가 다르다.
		 */

		// 아래코드가 다 참으로 나온다는 것은 전부 형변환이 가능하다는 것
		// 다시말해서 조상이다 이 말이다.
		if (f instanceof Unit) {
			System.out.println("f는 Unit 으로 변형가능 합니다.");
		}

		if (f instanceof Fightable) {
			System.out.println("f는 Fightable 으로 변형가능 합니다.");
		}

		if (f instanceof Moveable) {
			System.out.println("f는 Moveable 으로 변형가능 합니다.");
		}

		if (f instanceof Attackable) {
			System.out.println("f는 Attackable 으로 변형가능 합니다.");
		}

		f.move(100, 100);
		f.attack(new Fighter());

	}

}
