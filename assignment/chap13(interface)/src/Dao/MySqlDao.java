package Dao;

public class MySqlDao implements DataAccessObject {

	@Override//검색
	public void select() {
		System.out.println("MySql DB에서 검색");
	}

	@Override//삽입
	public void insert() {
		System.out.println("MySql DB에 삽입");
	}

	@Override//수정
	public void update() {
		System.out.println("MySql DB를 수정");
	}

	@Override//삭제
	public void delete() {
		System.out.println("MySql DB에서 삭제");
	}

}
