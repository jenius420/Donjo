package adminService.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import adminService.model.dao.ManageIncruitDao;
import adminService.model.dao.ManageMemDao;
import owner.model.vo.Owner;
import ownerService.model.vo.Incruit;
import ownerService.model.vo.IncruitProduct;

public class ManageIncruitService {
	
	public ArrayList<Incruit> selectIngIncruitList() {
		
		Connection conn = getConnection();

		ArrayList<Incruit> list = new ManageIncruitDao().selectIngIncruitList(conn);

		close(conn);

		return list;
		
	}
	
	public ArrayList<Incruit> selectDoneIncruitList() {
		
		Connection conn = getConnection();

		ArrayList<Incruit> list = new ManageIncruitDao().selectDoneIncruitList(conn);

		close(conn);

		return list;
		
	}
	
	public ArrayList<IncruitProduct>  selectIncruitProduct() {
		
		Connection conn = getConnection();

		ArrayList<IncruitProduct> list = new ManageIncruitDao().selectIncruitProduct(conn);

		close(conn);

		return list;
		
	}
	
	public Incruit watchingIncruit(int wNum) {
		
		Connection conn = getConnection();

		ArrayList<Incruit> incruit = new ManageIncruitDao().watchingIncruit(conn, wNum);

		close(conn);

		return incruit;
		
	}

}
