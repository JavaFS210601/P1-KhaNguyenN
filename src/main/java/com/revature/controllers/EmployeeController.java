package com.revature.controllers;

import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.daos.EmployeeDAO;
import com.revature.models.ReimbursementsDTO;
import com.revature.models.reimbursement;
import com.revature.services.EmployeeService;

public class EmployeeController {
	

	private EmployeeService es = new EmployeeService();
	private ObjectMapper om = new ObjectMapper();
	
	
	public void viewPastTickets(HttpServletResponse res) throws IOException{
		
		
		List<reimbursement> reimbursementList = es.viewPastTicketsList();
		
		String json = om.writeValueAsString(reimbursementList);
		
		
		res.getWriter().print(json);
		
		
		
		res.setStatus(200);
	}
	
	public void viewPending(HttpServletResponse res) throws IOException {
		
		List<reimbursement> reimbursementList = es.getPendingList();
		
		String json = om.writeValueAsString(reimbursementList);
		
		
		res.getWriter().print(json);
		
		
		
		res.setStatus(200);
	}
	
//should submit 3 infos into javascript for it to update the database	
public void submitReimbursements(HttpServletResponse res, HttpServletRequest req) throws IOException {
	
	if(req.getMethod().equals("POST")) {
		BufferedReader reader = req.getReader();
		
		StringBuilder sb = new StringBuilder();
		
		String line = reader.readLine();
		
		
		
		while(line != null) {
			sb.append(line);
			line = reader.readLine();
		}
		String strings = new String(sb);
		
		ReimbursementsDTO rDTO = om.readValue(strings, ReimbursementsDTO.class);
		es.submitReimbursements(rDTO.reimb_type_id, rDTO.reimb_amount, rDTO.reimb_description);
		res.setStatus(200);
	}


}
}
