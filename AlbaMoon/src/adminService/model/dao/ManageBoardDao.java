package adminService.model.dao;

import static common.JDBCTemplate.*;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ManageBoardDao {
	
	private Properties prop = new Properties();
	
	public ManageBoardDao() {
		
		String fileName = ManageBoardDao.class.getResource("/sql/adminService/adminService_query.properties").getPath();
		
		try {
			prop.load(new FileReader(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
