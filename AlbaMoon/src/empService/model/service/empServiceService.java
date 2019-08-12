package empService.model.service;

import empService.model.dao.empServiceDao;
import empService.model.vo.ApplicationState;
import empService.model.vo.EmpEvaluation;
import empService.model.vo.EmpEvaluationBefore;
import owner.model.vo.Resume;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

public class empServiceService {
	
	/**
	 * 이력서 등록
	 * @param resume
	 * @return 1-성공 0-실패
	 */
	public int enrollResume(Resume resume) {
	
		Connection conn = getConnection();
		
		int result = new empServiceDao().enrollResume(conn, resume);
				
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
		
		ArrayList<ApplicationState> list = new empServiceDao().selectApplicationState(conn, empNum);
		
		close(conn);
		
		return list;
	}
	
	/**
	 * 작성된 구직자 평가
	 * @param empNum
	 * @return 세션유저가 작성했었던 알바 평가 리스트
	 */
	public ArrayList<EmpEvaluation> selectEmpEval(int empNum){
		
		Connection conn = getConnection();
		
		ArrayList<EmpEvaluation> list = new empServiceDao().selectEmpEval(conn, empNum);
		
		close(conn);
		
		return list;
		
	}
	
	/**
	 * 작성 가능한(미작성) 구직자 평가
	 * @param empNum
	 * @return 세션유저가 작성 가능한 평가 리스트
	 */
	public ArrayList<EmpEvaluationBefore> selectEmpEvalBefore(int empNum){
		
		Connection conn = getConnection();
		
		ArrayList<EmpEvaluationBefore> list = new empServiceDao().selectEmpEvalBefore(conn, empNum);
		
		close(conn);
		
		return list;
		
	}

}
