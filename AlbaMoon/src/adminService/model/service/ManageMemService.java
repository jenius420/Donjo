package adminService.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import adminService.model.dao.ManageMemDao;
import emp.model.vo.Emp;
import empService.model.dao.ResumeDao;

import static common.JDBCTemplate.*;
import owner.model.vo.Owner;

public class ManageMemService {
	
	public ArrayList<Emp> selectEmpList() {
		
		Connection conn = getConnection();

		ArrayList<Emp> list = new ManageMemDao().selectEmpList(conn);

		close(conn);

		return list;
		
	}
	
	public ArrayList<Owner> selectOwnerList() {
		
		Connection conn = getConnection();

		ArrayList<Owner> list = new ManageMemDao().selectOwnerList(conn);

		close(conn);

		return list;
		
	}
	
	public int warnMem(int memNum) {
		
		Connection conn = getConnection();

		int result = new ManageMemDao().warnMem(conn, memNum);

		if (result > 0) {
			commit(conn);

		} else {
			rollback(conn);
		}

		close(conn);

		return result;
		
	}
	
	public int deleteMem(int memNum) {
		
		Connection conn = getConnection();

		int result = new ManageMemDao().deleteMem(conn, memNum);

		if (result > 0) {
			commit(conn);

		} else {
			rollback(conn);
		}

		close(conn);

		return result;
		
	}

}
