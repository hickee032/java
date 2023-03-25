package sec05.exam07_Comparable;

public class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

//	@Override
//	public int compareTo(Person o) {
//
//		return this.age - o.age;
//	}

// TreeSet�� ��쿡�� hashCode, equals�� ȣ�� ���� �ʴ� ��.
//	@Override
//	public int hashCode() {
//		return Objects.hash(this.name, this.age);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (obj instanceof Person) {
//			Person person = (Person) obj;
//			return this.name.compareTo(person.name) == 0 && this.age == person.age;
//		}
//		return false;
//	}

	@Override
	public int compareTo(Person o) {
		return this.name.compareTo(o.name)*1; //��������
		//return this.name.compareTo(o.name)*-1; //��������
//		if(this.name.compareTo(o.name)<1){
//			return -1;
//		}
//		else if(this.name.compareTo(o.name)<1){
//			return 0;
//		}
//		else {
//		return 1;}
	}

}
