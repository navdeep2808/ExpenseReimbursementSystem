package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.ReimbursementPojo;

public class ReimbursementDaoImpl implements ReimbursementDao {

	@Override
	public ReimbursementPojo submitRequest(ReimbursementPojo reimbursementPojo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReimbursementPojo manUpdateRequest(ReimbursementPojo reimbursementPojo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReimbursementPojo empViewPending(ReimbursementPojo reimbursementPojo) {
		Connection connect;
		try {
			connect = DBUtil.dbConnection();
			Statement stmt = connect.createStatement();
			String query = "SELECT balance FROM account_details WHERE";   //I will fill this in                                                      
			ResultSet resultSet = stmt.executeQuery(query);
			resultSet.next();
			//reimbursementPojo.setBalance(resultSet.getDouble(1));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return reimbursementPojo;
	}

	@Override
	public ReimbursementPojo empViewResolved(ReimbursementPojo reimbursementPojo) {
		Connection connect;
		try {
			connect = DBUtil.dbConnection();
			Statement stmt = connect.createStatement();
			String query = "SELECT balance FROM account_details WHERE user_id=";    //I will fill this in                                                        
			ResultSet resultSet = stmt.executeQuery(query);
			resultSet.next();
			//reimbursementPojo.setBalance(resultSet.getDouble(1));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return reimbursementPojo;
	}

	@Override
	public ReimbursementPojo manViewAllPending(ReimbursementPojo reimbursementPojo) {
		Connection connect;
		try {
			connect = DBUtil.dbConnection();
			Statement stmt = connect.createStatement();
			String query = "SELECT balance FROM account_details WHERE user_id=";       //I will fill this in                                                     
			ResultSet resultSet = stmt.executeQuery(query);
			resultSet.next();
			//reimbursementPojo.setBalance(resultSet.getDouble(1));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return reimbursementPojo;
	}

	@Override
	public ReimbursementPojo manViewAllResolved(ReimbursementPojo reimbursementPojo) {
		Connection connect;
		try {
			connect = DBUtil.dbConnection();
			Statement stmt = connect.createStatement();
			String query = "SELECT balance FROM account_details WHERE user_id=";       //I will fill this in                                                     
			ResultSet resultSet = stmt.executeQuery(query);
			resultSet.next();
			//reimbursementPojo.setBalance(resultSet.getDouble(1));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return reimbursementPojo;
	}

	@Override
	public ReimbursementPojo manViewRequest(ReimbursementPojo reimbursementPojo) {
		// TODO Auto-generated method stub
		return null;
	}

}
