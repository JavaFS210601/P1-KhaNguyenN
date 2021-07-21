package com.revature.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.revature.utils.ConnectionUtil;

public class LoginService {
//username and password with id identifier
	//0 for false, 1 for employee and 2 for manager
	public boolean login(String username, String password, int id) {
		
		//Hardcoding user/pass because I don't want to create a whole users table to check username/password
		//Plus I have to hold your hands less as we get new projects, so I don't want to give you all the keys here
		//Typically, you'll want to validate the given username/password against some username/password in the DB.
		
		
try(Connection connection = ConnectionUtil.getConnection()) {
			
			ResultSet resultSet = null; // intialize an empty resultset that will store the results of our query.
			//sql statement to get all of the info from reimbursement
			String sql = "select * from users where username =? and pass=? and user_role_id=?";
			
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql); 
			
			preparedStatement.setString(1, username );
			preparedStatement.setString(2, password );
			preparedStatement.setInt(3, id);
			
			preparedStatement.executeUpdate();
			
			
			if (resultSet.next()) {
				return true;
				
			}
			else {
				return false;
			}
			
		
		}catch (Exception e) {
		// TODO: handle exception
	}
return true;
	}
	//
	public static int returningID (int id) {
		return id;
	}

}
		

	
		
		
		
//		if(username.equals("demoMan") && password.equals("password") && id == (1) ) {
//			return true;
//		}
//		
//		return false;
//	}