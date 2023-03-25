package sec04_getProperty;

import java.util.Properties;
import java.util.Set;

public class PropertyExample {

	public static void main(String[] args) {

		String osName = System.getProperty("os.name");
		System.out.println("os이름 : " + osName);

		String userName = System.getProperty("user.name");
		System.out.println("사용자 이름 : " + userName);

		String userHome = System.getProperty("user.Home");
		System.out.println("사용자 홈 디텍토리 : " + userHome);

		/*
		 * Property를 얻어내어 Set객체를 생성 하여 keySet으로 저장호 출력 Properties컬렉션은 hashTable을 상속 받았기
		 * 때문에 Map계열 Properties 키와 값의 객체가 String 여기서는 Properties컬렉션의 기값만 가져와서 Set컬렉션을
		 * 만들고 출력 왜냐면 map계열은 키값만 알아도 값을 가져오는 문제 없기 때문이다.
		 */

		Properties props = System.getProperties();

		// props는 맵계열.
		// 맵계열에서 key값만 set계열로 바꿔주는 메서드.
		Set<Object> keys = props.keySet();

		for (Object obj : keys) {
			if (obj instanceof String) {
				String key = (String) obj;
				System.out.println("[" + key + "] - " + System.getProperty(key));
			}
		}

	}

}
