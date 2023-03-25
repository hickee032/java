package sec05_exam_feneric_polimorphism;

//Box<T>를 상속 받으며 Zoobox에 추가할 객체를 Animal하위 클래스로 제한-- 익상 수하
public class Zoobox<T extends Animal> extends Box<T> {

}
