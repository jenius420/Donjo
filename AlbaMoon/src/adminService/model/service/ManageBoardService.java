package adminService.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import adminService.model.dao.ManageBoardDao;
import adminService.model.dao.ManageMemDao;
import board.model.vo.Board;
import board.model.vo.Comment;
import owner.model.vo.Owner;

public class ManageBoardService {
	
	public ArrayList<Board> selectBoardReportList() {
		
		Connection conn = getConnection();

		ArrayList<Board> list = new ManageBoardDao().selectBoardReportList(conn);

		close(conn);

		return list;
		
		
	}
	
	public ArrayList<Comment> selectCommentReportList() {
		
		Connection conn = getConnection();

		ArrayList<Comment> list = new ManageBoardDao().selectCommentReportList(conn);

		close(conn);

		return list;
		
	}
	
	public int deleteBoard(int tNum) {
		
		Connection conn = getConnection();
		
		int result = 0;
		
		result = new ManageBoardDao().deleteBoard(conn, tNum);

		if (result > 0) {
			commit(conn);

		} else {
			rollback(conn);
		}

		close(conn);

		return result;
		
	}
	
	
	public int deleteComment(int deleteComment) {
		
		Connection conn = getConnection();
		
		int result = 0;
		
		result = new ManageBoardDao().deleteComment(conn, deleteComment);

		if (result > 0) {
			commit(conn);

		} else {
			rollback(conn);
		}

		close(conn);

		return result;
		
	}

}
