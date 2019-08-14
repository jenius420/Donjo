package adminService.model.dao;

import static common.JDBCTemplate.*;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import emp.model.vo.Emp;
import ownerService.model.vo.Incruit;

public class ManageIncruitDao {
	
	private Properties prop = new Properties();
	
	public ManageIncruitDao() {
		
		String fileName = ManageIncruitDao.class.getResource("/sql/adminService/adminService_query.properties").getPath();
		
		try {
			prop.load(new FileReader(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public ArrayList<Incruit> selectIngIncruitList(Connection conn) {
		
		ArrayList<Incruit> list = null;	
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = prop.getProperty("selectIngIncruitList");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {

				list.add(new Incruit(
						//가져올 컬럼 넣기
									rs.getInt("ENUM"),
									));
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		
		return list;
		
	}
	
	public ArrayList<Incruit> selectDoneIncruitList(Connection conn) {
		
		ArrayList<Incruit> list = null;	
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = prop.getProperty("selectDoneIncruitList");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {

				list.add(new Incruit(
						//위 메소드랑 동일 컬럼
									rs.getInt("ENUM"),
									));
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		
		return list;
		
	}

}
