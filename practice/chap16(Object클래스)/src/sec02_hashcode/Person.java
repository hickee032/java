package sec02_hashcode;

//hashcode 메모리 주소를 정수값으로 나타낸다.
public class Person {

	int number;

	public Person(int number) {
		this.number = number;
	}

	// 1차적 논리적 동등을 위해서는 아래와 같이 hashcode()를 오버라이딩 해야한다.
	// 아래와 같이 hash시리즈에 저장및 값을 가져오기 위해서는 리턴 하는 값이 같아야지만 동등객체로 인정한다.

	@Override
	public int hashCode() {
		System.out.println("hashcode() 호출");
		return this.number;
	}

	// 2차적은 equals()를 호출해서 값비교를 해서 같으면 논리적 동등으로 인정
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals() 호출");
		if (obj instanceof Person) {
			Person key = (Person) obj;
			if (this.number == key.number) {
				return true;
			}
		}
		return false;
	}
}
