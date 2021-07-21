package com.revature.services;

import com.revature.daos.ManagerDAO;

public class ManagerService {
	
	private ManagerDAO md = new ManagerDAO();


	public void resolveTicket(int reim_id, int reimb_status_id) {
		if(reimb_status_id > 0 && reimb_status_id < 4) {
			md.resolveTicket(reim_id, reimb_status_id);
		} else {
			
		}
		
	}


	

}
