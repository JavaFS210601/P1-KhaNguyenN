package com.revature.services;

import java.util.List;

import com.revature.daos.EmployeeDAO;
import com.revature.daos.EmployeeInterface;
import com.revature.models.reimbursement;
public class EmployeeService {

	
	private EmployeeInterface eDAO = new EmployeeDAO();
	
	public List<reimbursement> viewPastTicketsList() {
		return eDAO.viewPastTicketsList();
		
	}
	
	public List<reimbursement> getPendingList() {
		return eDAO.getPendingList();
	}
	
	public void  submitReimbursements(int reimb_type_id, int reimb_amount, String reimb_description) {
		if(reimb_type_id > 0 && reimb_type_id < 5) {
			eDAO.submitReimbursements(reimb_type_id, reimb_amount, reimb_description);
		}else {
			System.out.println("Unable to add a new transaction");
		}
}
	
}
