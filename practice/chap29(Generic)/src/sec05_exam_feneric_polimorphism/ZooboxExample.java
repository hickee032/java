package sec05_exam_feneric_polimorphism;

public class ZooboxExample {

	// <T extend ����Ÿ��> ���� Ÿ�� �ڽ��̰ų� �ڼ�Ŭ����, ���� Ŭ������ ��� �ü� �ִ�.
	// <T super ����Ÿ��> ���� Ÿ�� �ڽ��̰ų� ���� Ŭ������

	public static void main(String[] args) {
		Zoobox<Animal> animal = new Zoobox<Animal>();
		animal.add(new Lion());
		animal.add(new Tiger());
		animal.add(new Animal());
		// animal.add(new Bird());

		System.out.println("Zoobox<T extends Animal> extends Box<T>�� ���");
		System.out.println(animal.toString());

	}

}
