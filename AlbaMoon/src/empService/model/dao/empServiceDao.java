package empService.model.dao;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import empService.model.vo.ApplicationState;
import empService.model.vo.EmpEvaluation;
import empService.model.vo.EmpEvaluationBefore;
import owner.model.vo.Resume;
import static common.JDBCTemplate.*;

public class empServiceDao {

	private Properties prop = new Properties();
	
	public empServiceDao() {
		
		String fileName = empServiceDao.class.getResource("/sql/empService/empService_query.properties").getPath();
		
		try {
			prop.load(new FileReader(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public int enrollResume(Connection conn, Resume resume) {

		int result = 0;

		PreparedStatement pstmt = null;

		String sql = prop.getProperty("enrollResume");

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, resume.getResumeTitle());
			pstmt.setInt(2, resume.getEmpNum());
			pstmt.setString(3, resume.getDistrict());
			pstmt.setString(4, resume.getType());
			pstmt.setString(5, resume.getComment());
			pstmt.setString(6, resume.사진경로);
			pstmt.setString(7, resume.getDesireForm());
			pstmt.setInt(8, resume.getDesireIncome());
			pstmt.setString(9, resume.getOpenSet());
			pstmt.setString(10, resume.getEdu());
			

			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return result;
		
	}
	
	
	public ArrayList<ApplicationState> selectApplicationState(Connection conn, int empNum){
		
		ArrayList<ApplicationState> list = null;	
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = prop.getProperty("selectApplicationState");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empNum);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				list.add(new ApplicationState(
									rs.getInt("APPLYNUM"),
									rs.getInt("ENUM"),
									rs.getInt("WNUM"),
									rs.getString("WTITLE"),
									rs.getString("OPNAME"),
									rs.getDate("APPLYDATE"),
									rs.getString("PASSORFAIL")
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
	
	public ArrayList<EmpEvaluation> selectEmpEval(Connection conn, int empNum) {
		
		ArrayList<EmpEvaluation> list = null;	
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = prop.getProperty("selectEmpEval");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empNum);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				list.add(new EmpEvaluation(
									rs.getString("OPNAME"),
									rs.getInt("EEVALUPOINT"),
									rs.getString("EEVALCOMMENT"),
									rs.getDate("ENROLLDATE")
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
	
	public ArrayList<EmpEvaluationBefore> selectEmpEvalBefore(Connection conn, int empNum) {
		
		ArrayList<EmpEvaluationBefore> list = null;	
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = prop.getProperty("selectEmpEvalBefore");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empNum);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				list.add(new EmpEvaluationBefore(
									rs.getString("OPNAME"),
									rs.getString("WTITLE"),
									rs.getDate("WORKSTARTTERM"),
									rs.getDate("WORKENDTERM")
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
