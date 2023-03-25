package sec02_env;

public class SystemEnvExample {

	public static void main(String[] args) {
		String javaHome = System.getenv("JAVA_HOME");
		String path = System.getenv("PATH");
		String temp = System.getenv("TEMP");
		
		System.out.println("[JAVA_HOME] "+javaHome);
		System.out.println("[PATH] "+path);
		System.out.println("[TEMP] "+temp);

	}

}
