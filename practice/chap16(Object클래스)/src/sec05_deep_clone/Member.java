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

	// ���� ������ �� �ν��Ͻ� ����
	public Member getMember() {
		Member cloned = null;

		try {
			cloned = (Member) this.clone(); // �� Ŭ���� ������Ʈ�� Ŭ���̴�.
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// ���� ���� ������ �ϱ� ���ؼ� -�⺻�� Ÿ���� �����ϱ� ���ؼ�
		Member cloned = (Member) super.clone(); // this.cloned�� ��� ȣ�� �ڱ� �ڽ��� ��� ȣ���ϰԵȴ�.

		// ���� Ÿ���� ���� �ݵ�� ���α׷��Ӱ� ���� �Ǵ� �ڵ带 ����������Ѵ�.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		cloned.car = new Car(this.car.model);

		return cloned;
	}

	@Override
	public String toString() {

		return " name - " + this.name + " age - " + this.age + " score - " + this.scores + "car - " + this.car;
	}

}
