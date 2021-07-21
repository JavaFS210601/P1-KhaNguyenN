package com.revature.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.utils.ConnectionUtil;



import com.revature.models.reimbursement;

public class EmployeeDAO implements EmployeeInterface{
	
	
	
	
	
	//this needs to change so that it only views their specific ticket, probablymatching their id 
	@Override
	public List<reimbursement> viewPastTicketsList() {
		
		try(Connection connection = ConnectionUtil.getConnection()) {
			
			ResultSet resultSet = null; // intialize an empty resultset that will store the results of our query.
			//sql statement to get all of the info from reimbursement
			String sql = "select * from \"P1\".reimbursement;";
			
			java.sql.Statement statement = connection.createStatement();
			
			resultSet = statement.executeQuery(sql);
			
			
			List<reimbursement> pastTickets = new ArrayList<>();
		
			
		while(resultSet.next()) {
			
			reimbursement employee = new reimbursement(
					
					resultSet.getInt("reim_id"),
					resultSet.getInt("reim_amount"),
					resultSet.getTime("reimb_submitted"),
					resultSet.getTime("reimb_resolved"),
					resultSet.getString("reimb_description"),
					resultSet.getInt("reimb_author"),
					resultSet.getInt("reimb_resolver"),
					resultSet.getInt("reimb_status_id"),
					resultSet.getInt("reimb_type_id")
					
//					resultSet.getInt("users_fk_auth"),
//					resultSet.getInt("users_fk_reslvr"),
//					resultSet.getInt("reimbursement_status_fk"),
//					resultSet.getInt("reimbursement_type_fk")
//					
//		
					);
			pastTickets.add(employee);
			
		}return pastTickets;
		
	
		
	}catch (SQLException e) {
		System.out.println("Something went wrong when trying to access your reimbursement employee");
		e.printStackTrace();
	
	}


	return null;
}
	
	
	
	public void  submitReimbursements(int reimb_type_id, int reimb_amount, String reimb_description) {
		
		try(Connection connection = ConnectionUtil.getConnection()) {
			
			ResultSet resultSet = null; // intialize an empty resultset that will store the results of our query.
			//sql statement to get all of the info from reimbursement
			String sql = "INSERT into \"P1\".reimbursement (reimb_amount, reimb_submitted, reimb_resolved, reimb_description, reimb_author, reimb_resolver, reimb_status_id, reimb_type_id)"
					+ "values (?, current_timestamp, null, ?, 5, 6, 1, ?);";
			
			
			java.sql.Statement statement = connection.createStatement();
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql); 
		
			
			preparedStatement.setInt(1, reimb_amount);
			preparedStatement.setString(2, reimb_description);
			preparedStatement.setInt(3, reimb_type_id);
			
			statement.executeQuery(sql);
		
		}catch (Exception e) {
		// TODO: handle exception
	}
		

	}
	
	public List<reimbursement> getPendingList() {
	try(Connection connection = ConnectionUtil.getConnection()) {
			
			ResultSet resultSet = null; // intialize an empty resultset that will store the results of our query.
			//sql statement to get all of the info from reimbursement
			String sql = "select * from reimbursement where reimb_status_id=1 and sort by reimb_status;";
			
			java.sql.Statement statement = connection.createStatement();
			
			resultSet = statement.executeQuery(sql);
			
			
			List<reimbursement> pastTickets = new ArrayList<>();
		
			
		while(resultSet.next()) {
			
			reimbursement employee = new reimbursement(
					
					resultSet.getInt("reim_id"),
					resultSet.getInt("reimamount"),
					resultSet.getTime("reim_submittedTime"),
					resultSet.getTime("reim_resolved"),
					resultSet.getString("reim_description"),
					resultSet.getInt("reimb_author"),
					resultSet.getInt("reimb_resolver"),
					resultSet.getInt("reimb_status_id"),
					resultSet.getInt("reimb_type_id")
					
//					resultSet.getInt("users_fk_auth"),
//					resultSet.getInt("users_fk_reslvr"),
//					resultSet.getInt("reimbursement_status_fk"),
//					resultSet.getInt("reimbursement_type_fk")
//					
//					
					
					
					);
			pastTickets.add(employee);
			
		}return pastTickets;
		
	
		
	}catch (SQLException e) {
		System.out.println("Something went wrong when trying to access your DB");
		e.printStackTrace();
	
	}


	return null;
}
		
		
		
	}





