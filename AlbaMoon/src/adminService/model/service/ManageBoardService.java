package adminService.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import adminService.model.dao.ManageBoardDao;
import adminService.model.dao.ManageMemDao;
import board.model.vo.Board;
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

}
