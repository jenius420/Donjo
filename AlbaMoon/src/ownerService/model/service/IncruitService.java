package ownerService.model.service;

import ownerService.model.dao.IncruitDao;
import ownerService.model.vo.Incruit;
import static common.JDBCTemplate.*;

import java.sql.Connection;


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

}
