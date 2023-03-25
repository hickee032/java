package sec04_exam_generic_method_2;

public class Utill {

	// ���׸� �޼����� compare()�� Pair��� 2���� ���׸� ��ü�� �޾Ƽ� K,V��� ��ü�� ���� �� �ϴ� �޼��� �̴�.
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {

		// K,V�� �ݵ�� equals()�� �������̵��� �Ǿ��־�߸� �Ʒ� �ڵ尡 ������ �����ϴ�.
		boolean kCompare = p1.getK().equals(p2.getK());
		boolean vCompare = p1.getV().equals(p2.getV());

		// �Ѵ� true���� true�� �����Ѵ�.
		return kCompare && vCompare;
	}

}
