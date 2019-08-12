package empService.model.service;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

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

}
