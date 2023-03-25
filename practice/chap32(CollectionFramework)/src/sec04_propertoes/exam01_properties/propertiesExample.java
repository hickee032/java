package sec04_propertoes.exam01_properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

public class propertiesExample {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties properties = new Properties();

		String path = propertiesExample.class.getResource("database.properties").getPath();

		System.out.println(path); // -->16진수로 표시된다. 디코딩해줄 필요가 있다(사람이 편하게)

		// 한글을 표시하기위해 디코딩

		path = URLDecoder.decode(path, "utf-8");

		System.out.println(path);
		// 파일을 읽어올 준비가 완료
		properties.load(new FileReader(path));

		// 키를 주고 값으로 얻는다.
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		// 얻어온 값 출력
		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("username : " + username);
		System.out.println("password : " + password);
	}

}
