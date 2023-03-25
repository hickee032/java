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

		System.out.println(path); // -->16������ ǥ�õȴ�. ���ڵ����� �ʿ䰡 �ִ�(����� ���ϰ�)

		// �ѱ��� ǥ���ϱ����� ���ڵ�

		path = URLDecoder.decode(path, "utf-8");

		System.out.println(path);
		// ������ �о�� �غ� �Ϸ�
		properties.load(new FileReader(path));

		// Ű�� �ְ� ������ ��´�.
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		// ���� �� ���
		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("username : " + username);
		System.out.println("password : " + password);
	}

}
