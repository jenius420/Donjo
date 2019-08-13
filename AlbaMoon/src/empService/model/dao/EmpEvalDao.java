package empService.model.dao;

import static common.JDBCTemplate.close;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import empService.model.vo.EmpEvaluation;
import empService.model.vo.EmpEvaluationBefore;

public class EmpEvalDao {
	
	private Properties prop = new Properties();
	
	public EmpEvalDao() {
		
		String fileName = EmpEvalDao.class.getResource("/sql/empService/empService_query.properties").getPath();
		
		try {
			prop.load(new FileReader(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}

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
									rs.getInt("EEVALNUM"),
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
									rs.getInt("APPLYNUM"),
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
