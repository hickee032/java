package sec_verify07;

public class DeepCloneExample {

	public static void main(String[] args) {

		Rectangle ori = new Rectangle(10, 10, -5, -5);

		Rectangle cloned;

		try {
			cloned = (Rectangle) ori.clone();
			// ori.changePos(2, 2, 7, 7);
			System.out.println("���� ���簢���� ����Ʈ");
			ori.showPosition();
			
			System.out.println();
			
			System.out.println("���� ���簢���� ����Ʈ");
			cloned.changePos(2, 2, 7, 7);
			cloned.showPosition();

		} catch (CloneNotSupportedException e) {

			e.printStackTrace();
		}

	}
}
