package empService.model.service;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.commit;
import static common.JDBCTemplate.getConnection;
import static common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import empService.model.dao.ResumeDao;
import empService.model.vo.ApplicationState;
import empService.model.vo.Resume;

public class ResumeService {

	/**
	 * 이력서 등록
	 * @param resume
	 * @return 1-성공 0-실패
	 */
	public int enrollResume(Resume resume) {

		Connection conn = getConnection();

		int result = new ResumeDao().enrollResume(conn, resume);

		if (result > 0) {
			commit(conn);

		} else {
			rollback(conn);
		}

		close(conn);

		return result;
	}
	
	

}
