package sec01_equals;

public class MemberExample {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");

		if (obj1.equals(obj2)) { //같은 값을 지니고 있다.
			System.out.println("obj1 과 obj2 는 논리적 동등합니다.");
		} else {
			System.out.println("obj1 과 obj2 는 논리적 동등하지 않습니다.");
		}

		if (obj1.equals(obj3)) {//다른 값을 가지고 있다.
			System.out.println("obj1 과 obj3 는 논리적 동등합니다.");
		} else {
			System.out.println("obj1 과 obj3 는 논리적 동등하지 않습니다.");
		}

	}

}
