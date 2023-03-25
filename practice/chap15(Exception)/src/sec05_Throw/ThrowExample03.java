package sec05_Throw;

public class ThrowExample03 {

	public static void main(String[] args) {
		
		String file1 = ThrowExample03.createFile("test.txt");
		String file2 = ThrowExample03.createFile("");
		System.out.println(file1+"파일이 성공적으로 생성");
		System.out.println(file2+"파일이 성공적으로 생성");
	}
	public static String createFile(String filename) {
		try {
			if(filename==null||filename.equals("")){
				throw new Exception("파일이름이 유효하지 않습니다."); //강제 예외 발생
			}
		
		} catch (Exception e) {
			filename = "제목 없음.txt";
		}
		return filename; //파일이름을 "제목 없음.txt"으로 리턴함.
						 //그래서 제목없음 파일이 생성됨.
	}
}
