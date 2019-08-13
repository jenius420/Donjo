package ownerService.model.service;

import ownerService.model.dao.IncruitDao;
import ownerService.model.vo.Incruit;
import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import emp.model.vo.Emp;


public class IncruitService {
	
	public int enrollIncruit(Incruit incruit) {
		
		Connection conn = getConnection();

		int result = new IncruitDao().enrollIncruit(conn, incruit);

		if (result > 0) {
			commit(conn);

		} else {
			rollback(conn);
		}

		close(conn);

		return result;
		
	}
	
	public ArrayList<Incruit> selectIncruitList(int oNum) {
		
		Connection conn = getConnection();

		ArrayList<Incruit> list = new IncruitDao().selectIncruitList(conn, oNum);

		close(conn);

		return list;
		
	}
	
	public ArrayList<??> selectManageEmp(int oNum){
		
		Connection conn = getConnection();

		ArrayList<??> list = new IncruitDao().selectManageEmp(conn, oNum);

		close(conn);

		return list;
		
	}

}
