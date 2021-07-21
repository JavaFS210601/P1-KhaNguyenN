package com.revature.controllers;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.ReimbursementsDTO;
import com.revature.services.ManagerService;

public class ManagerController {

	
	private ObjectMapper om = new ObjectMapper();
	private ManagerService ms = new ManagerService();
	

	public void resolveTicket(HttpServletRequest req, HttpServletResponse res) throws IOException{
		if(req.getMethod().equals("POST")) {
			BufferedReader reader = req.getReader();
			
			StringBuilder sb = new StringBuilder();
			
			String line = reader.readLine();
			
			while(line != null) {
				sb.append(line);
				line = reader.readLine();
			}
			
			String body = new String(sb);
			
			ReimbursementsDTO rDTO = om.readValue(body, ReimbursementsDTO.class);
			ms.resolveTicket(rDTO.reim_id, rDTO.reimb_status_id);
			res.setStatus(200);
		}
	}
}
