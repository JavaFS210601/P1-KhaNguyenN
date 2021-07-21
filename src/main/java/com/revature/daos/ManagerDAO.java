package com.revature.daos;
 
 import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
 import java.sql.SQLException;
 import java.util.ArrayList;
 import java.util.List;
 
 import com.revature.models.reimbursement;
 import com.revature.models.users;
 import com.revature.utils.ConnectionUtil;
 
 import jdk.internal.org.jline.utils.Log;
 
 public class ManagerDAO implements ManagerInterface{
 
 	

 	
 	@Override
 	public List<users> getAllEmployeeList() {
 		
 		try(Connection connection = ConnectionUtil.getConnection()) {
 			
 			ResultSet resultSet = null; // intialize an empty resultset that will store the results of our query.
 			//sql statement to get all of the info from reimbursement
 			String sql = "select * from users;";
 			
 			java.sql.Statement statement = connection.createStatement();
 			
 			resultSet = statement.executeQuery(sql);
 			
 			
 			List<users> pastTickets = new ArrayList<>();
 		
 			
 		while(resultSet.next()) {
 			
 			users employee = new users(
 					resultSet.getInt("users_id"),
 					resultSet.getString("username"),
 					resultSet.getString("password"),
 					resultSet.getString("first_name"),
 					resultSet.getString("last_name"),
 					resultSet.getString("user_email"),
 					resultSet.getInt("user_role_id")
// 					resultSet.getInt("user_roles_fk"),
// 					resultSet.getInt("users_pk")
 				
 					);
 			pastTickets.add(employee);
 			
 		}return pastTickets;
 		
 	
 		
 	}catch (SQLException e) {
 		System.out.println("Something went wrong when trying to access your DB");
 		e.printStackTrace();
 		Log.error("Didn't access databse");
 	}
 
 
 	return null;
 }
 	public List<reimbursement> getAllReimbursements() {
 		try(Connection connection = ConnectionUtil.getConnection()) {
 				
 				ResultSet resultSet = null; // intialize an empty resultset that will store the results of our query.
 				//sql statement to get all of the info from reimbursement
 				String sql = "select * reimbursement";
 				
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
 						
// 						resultSet.getInt("users_fk_auth"),
// 						resultSet.getInt("users_fk_reslvr"),
// 						resultSet.getInt("reimbursement_status_fk"),
// 						resultSet.getInt("reimbursemtn_type_fk"),
// 						
// 						resultSet.getInt("reimbursement_pk")
// 						
 						
 						
 						);
 				pastTickets.add(employee);
 				
 			}return pastTickets;
 			
 		
 			
 		}catch (SQLException e) {
 			System.out.println("Something went wrong when trying to access your DB");
 			e.printStackTrace();
 			Log.error("Didn't access databse");
 		}
 
 
 		return null;
 	}
	
 	
 	
 	
 	
 	
 	public void resolveTicket(int reim_id, int reimb_status_id) {
		
 		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "UPDATE \"P1\".reimbursement "
					+ "SET reimb_status_id = ?, reimb_resolver = 2, reimb_resolved = current_timestamp WHERE reim_id = ?;";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, reimb_status_id);
			ps.setInt(2, reim_id);
			ps.executeUpdate();
		} catch(SQLException e) {
			System.out.println("ERROR: Resolution failed!");
			e.printStackTrace();
		}
	}
	}
 		
	


	