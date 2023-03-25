package sec05_deep_clone;

import java.util.Arrays;

public class Member implements Cloneable {
	String name;
	int age;
	int[] scores = null;
	Car car = null;

	public Member(String name, int age, int[] scores, Car car) {
		this.age = age;
		this.name = name;
		this.scores = scores;
		this.car = car;

	}

	// 얕은 복제를 한 인스턴스 리턴
	public Member getMember() {
		Member cloned = null;

		try {
			cloned = (Member) this.clone(); // 이 클론은 오브젝트의 클론이다.
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 먼저 앝은 복제를 하기 위해서 -기본형 타입을 복제하기 위해서
		Member cloned = (Member) super.clone(); // this.cloned면 재귀 호출 자기 자신을 계속 호출하게된다.

		// 참조 타입의 경우는 반드시 프로그래머가 복제 되는 코드를 삽입해줘야한다.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		cloned.car = new Car(this.car.model);

		return cloned;
	}

	@Override
	public String toString() {

		return " name - " + this.name + " age - " + this.age + " score - " + this.scores + "car - " + this.car;
	}

}
