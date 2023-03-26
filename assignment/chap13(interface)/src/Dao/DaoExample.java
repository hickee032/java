package Dao;

public class DaoExample {
	
	static void dbWork(DataAccessObject dao) {
		if (dao instanceof OracleDao) {
			dao.select();
			dao.insert();
			dao.update();
			dao.delete();
		}
		if(dao instanceof MySqlDao) {
			dao.select();
			dao.insert();
			dao.update();
			dao.delete();
		}
	}

	public static void main(String[] args) {
		
		DataAccessObject odb = new OracleDao();
		DaoExample.dbWork(odb);
		
		DataAccessObject mdb = new MySqlDao();
		DaoExample.dbWork(mdb);
		
	}

}
