package MammalFish;

public class MammalFishExample {

	public static void main(String[] args) {
		Mammal m = new Whale();
		m.bear(m, "고래");
		Fish f = new Fish() {

			@Override
			void swim(Object obj, String str) {
				if (obj instanceof Fish) {
					System.out.println(str + "는 헤엄치며 움직입니다");
				} else {
					System.out.println(str + "는 헤엄치지 못합니다.");
				}
			}
		};
		f.swim(f, "물고기");
	};

}
