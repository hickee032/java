package MammalFish;

public class MammalFishExample {

	public static void main(String[] args) {
		Mammal m = new Whale();
		m.bear(m, "��");
		Fish f = new Fish() {

			@Override
			void swim(Object obj, String str) {
				if (obj instanceof Fish) {
					System.out.println(str + "�� ���ġ�� �����Դϴ�");
				} else {
					System.out.println(str + "�� ���ġ�� ���մϴ�.");
				}
			}
		};
		f.swim(f, "�����");
	};

}
