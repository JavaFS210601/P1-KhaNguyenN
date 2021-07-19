package com.revature.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.utils.ConnectionUtil;

import jdk.internal.org.jline.utils.Log;

import com.revature.models.reimbursement;

public class EmployeeDAO implements EmployeeInterface{
	
	
	
	
	
	//this needs to change so that it only views their specific ticket, probablymatching their id 
	@Override
	public List<reimbursement> viewPastTicketsList() {
		
		try(Connection connection = ConnectionUtil.getConnection()) {
			
			ResultSet resultSet = null; // intialize an empty resultset that will store the results of our query.
			//sql statement to get all of the info from reimbursement
			String sql = "select * from reimbursement;";
			
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
					resultSet.getInt("reim_status_id"),
					resultSet.getInt("reim_type_id"),
					
					resultSet.getInt("users_fk_auth"),
					resultSet.getInt("users_fk_reslvr"),
					resultSet.getInt("reimbursement_status_fk"),
					resultSet.getInt("reimbursemtn_type_fk"),
					
					resultSet.getInt("reimbursement_pk")
					
					
					
					);
			pastTickets.add(employee);
			
		}return pastTickets;
		
	
		
	}catch (SQLException e) {
		System.out.println("Something went wrwong when trying to access your DB");
		e.printStackTrace();
		Log.error("Didn't access databse");
	}


	return null;
}
	
	
	
	public void  submitReimbursements(int reimamount, String reim_description) {
		
		try(Connection connection = ConnectionUtil.getConnection()) {
			
			ResultSet resultSet = null; // intialize an empty resultset that will store the results of our query.
			//sql statement to get all of the info from reimbursement
			String sql = "insert into reimbursement (reimamount, reim_description) "
					+ "values (?,?)";
			
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql); 
			
			preparedStatement.setInt(2, reimamount );
			preparedStatement.setString(5, reim_description );
			
			
		
		}catch (Exception e) {
		// TODO: handle exception
	}
		

	}
	
	public List<reimbursement> getPendingList() {
	try(Connection connection = ConnectionUtil.getConnection()) {
			
			ResultSet resultSet = null; // intialize an empty resultset that will store the results of our query.
			//sql statement to get all of the info from reimbursement
			String sql = "select * order by reim_status_id";
			
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
					resultSet.getInt("reim_status_id"),
					resultSet.getInt("reim_type_id"),
					
					resultSet.getInt("users_fk_auth"),
					resultSet.getInt("users_fk_reslvr"),
					resultSet.getInt("reimbursement_status_fk"),
					resultSet.getInt("reimbursemtn_type_fk"),
					
					resultSet.getInt("reimbursement_pk")
					
					
					
					);
			pastTickets.add(employee);
			
		}return pastTickets;
		
	
		
	}catch (SQLException e) {
		System.out.println("Something went wrwong when trying to access your DB");
		e.printStackTrace();
		Log.error("Didn't access databse");
	}


	return null;
}
		
		
		
	}





