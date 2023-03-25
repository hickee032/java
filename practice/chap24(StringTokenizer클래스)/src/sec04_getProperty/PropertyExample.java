package sec04_getProperty;

import java.util.Properties;
import java.util.Set;

public class PropertyExample {

	public static void main(String[] args) {

		String osName = System.getProperty("os.name");
		System.out.println("os�̸� : " + osName);

		String userName = System.getProperty("user.name");
		System.out.println("����� �̸� : " + userName);

		String userHome = System.getProperty("user.Home");
		System.out.println("����� Ȩ �����丮 : " + userHome);

		/*
		 * Property�� ���� Set��ü�� ���� �Ͽ� keySet���� ����ȣ ��� Properties�÷����� hashTable�� ��� �޾ұ�
		 * ������ Map�迭 Properties Ű�� ���� ��ü�� String ���⼭�� Properties�÷����� �Ⱚ�� �����ͼ� Set�÷�����
		 * ����� ��� �ֳĸ� map�迭�� Ű���� �˾Ƶ� ���� �������� ���� ���� �����̴�.
		 */

		Properties props = System.getProperties();

		// props�� �ʰ迭.
		// �ʰ迭���� key���� set�迭�� �ٲ��ִ� �޼���.
		Set<Object> keys = props.keySet();

		for (Object obj : keys) {
			if (obj instanceof String) {
				String key = (String) obj;
				System.out.println("[" + key + "] - " + System.getProperty(key));
			}
		}

	}

}
