package sec_verify08;

import java.util.Arrays;

public class DeepCloneDriveExample {

	public static void main(String[] args) {
		Drive ori = new Drive("C드라이브", 500, new String[] { "윈도우폴더", "시스템폴더" }, new Folder("야시", 15));
		System.out.println("[원본 드라이브의 필드 값]");
		System.out.println("이름 : " + ori.name);
		System.out.println("크기 : " + ori.size);
		System.out.println("폴더 목록 : " + Arrays.toString(ori.driverList));
		System.out.println("새 폴더명 : " + ori.folder.name);
		System.out.println("크기 : " + ori.folder.size);
		
		System.out.println();
		Drive cloned = ori.getDrive();
		
		System.out.println("[복제 드라이브의 필드 값]");
		System.out.println("이름 : " + cloned.name);
		System.out.println("크기 : " + cloned.size);
		System.out.println("폴더 목록 : " + Arrays.toString(cloned.driverList));
		System.out.println("새 폴더명 : " + cloned.folder.name);
		System.out.println("크기 : " + cloned.folder.size);

	}
	
	

}
