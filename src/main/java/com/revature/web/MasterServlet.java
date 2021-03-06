package com.revature.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.revature.controllers.LoginController;
import com.revature.controllers.ManagerController;
import com.revature.services.LoginService;
import com.revature.controllers.EmployeeController;

//remember, this is our front controller - ALL requests that come in will have to hit this first.
public class MasterServlet extends HttpServlet {

	private EmployeeController employeeController = new EmployeeController();
	private ManagerController mangController = new ManagerController();
	private LoginController lc = new LoginController();
	private LoginService ls = new LoginService();
	private int thisID;
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		//returing a value from login service then using it to determine if its management or employee
		ls.returningID(thisID);
		System.out.print(ls.returningID(thisID));
		res.setContentType("application/json"); //set the content of our response object to be JSON
		
		//by default, Tomcat will send back a successful status code (200) if a request gets handled.
		//since we have a master servlet that takes all requests, this means all requests will get hendled.
		//this can lead to problems - we don't want a 200 if the request isn't handled correctly
		//thus, by default, we'll set the status code to 404, and change it in our code upon success.
		res.setStatus(404);
		
		
		//Now we want to write some code that will determine where requests get sent.
		
		String URI = req.getRequestURI().replace("/P1-KhaNguyenN/", "");
		//getting the request URI, and stripping out the base URL
		//so we'll just be left with the endpoint (e.g. "avengers", "login") to use in a switch
		
		switch(URI) {
		
		case "getReimbursements":
			employeeController.viewPastTickets(res);		
			break;
		case "viewPending":
			employeeController.viewPending(res);
			break;
		case "submitReimbursements":
			employeeController.submitReimbursements(res, req);
			break;
		case "resolve":
			mangController.resolveTicket(req, res);
			break;
		case "login": 
			lc.login(req, res);
			break;	
			
		}
		
	}
	
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
		//this sends every POST request to the doGet method, why???
		//I only want one switch statement in this Servlet. It can get very messy otherwise
		//and we'll differentiate get from post in the controllers instead of the servlet.
		
	}
	
}
