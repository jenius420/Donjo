package empService.model.service;

import empService.model.dao.ResumeDao;
import empService.model.vo.ApplicationState;
import empService.model.vo.Resume;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

public class ResumeService {
	
	/**
	 * 이력서 등록
	 * @param resume
	 * @return 1-성공 0-실패
	 */
	public int enrollResume(Resume resume) {
	
		Connection conn = getConnection();
		
		int result = new ResumeDao().enrollResume(conn, resume);
				
		if(result > 0) {
			commit(conn);
			
		}else {
			rollback(conn);
		}
		
		close(conn);
		
				
		return result;
	}
	
	/**
	 * 알바 지원 현황
	 * @param emp
	 * @return 세션유저가 지원한 알바 리스트
	 */
	public ArrayList<ApplicationState> selectApplicationState(int empNum){
		
		Connection conn = getConnection();
		
		ArrayList<ApplicationState> list = new ResumeDao().selectApplicationState(conn, empNum);
		
		close(conn);
		
		return list;
	}

}
