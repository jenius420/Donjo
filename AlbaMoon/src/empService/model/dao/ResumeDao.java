package empService.model.dao;

import static common.JDBCTemplate.close;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import empService.model.vo.Resume;

public class ResumeDao {
	
private Properties prop = new Properties();
	
	public ResumeDao() {
		
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

}
