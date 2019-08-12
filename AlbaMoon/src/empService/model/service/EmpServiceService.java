package empService.model.service;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import emp.model.vo.Emp;

import empService.model.dao.EmpServiceDao;
import empService.model.vo.ApplicationState;

public class EmpServiceService {

	/**
	 * 알바 지원 현황
	 * @param emp
	 * @return 세션유저가 지원한 알바 리스트
	 */
	public ArrayList<ApplicationState> selectApplicationState(int empNum) {

		Connection conn = getConnection();

		ArrayList<ApplicationState> list = new EmpServiceDao().selectApplicationState(conn, empNum);

		close(conn);

		return list;
	}
	
	public ArrayList<InterestOwner> selectInterestOwner(String empNum){
		
		Connection conn = getConnection();

		int[] listNum = new EmpServiceDao().selectInterestOwnerNum(conn, empNum);
		ArrayList<InterestOwner> iList = new EmpServiceDao().selectInterestOwner(conn, listNum);
		
		//관심기업에 해당하는 공고들 가져오는 DAO

		close(conn);

		return iList;
		
	}

}
