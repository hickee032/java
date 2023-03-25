package sec05_exam_feneric_polimorphism;

public class ZooboxExample {

	// <T extend 상위타입> 상위 타입 자신이거나 자손클래스, 구현 클래스만 들어 올수 있다.
	// <T super 하위타입> 하위 타입 자신이거나 조상 클래스만

	public static void main(String[] args) {
		Zoobox<Animal> animal = new Zoobox<Animal>();
		animal.add(new Lion());
		animal.add(new Tiger());
		animal.add(new Animal());
		// animal.add(new Bird());

		System.out.println("Zoobox<T extends Animal> extends Box<T>의 결과");
		System.out.println(animal.toString());

	}

}
