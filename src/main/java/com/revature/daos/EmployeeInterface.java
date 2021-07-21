package com.revature.daos;

import java.util.List;

import com.revature.models.reimbursement;

public interface EmployeeInterface {
	
	//view all the tickets
	public List<reimbursement> viewPastTicketsList();

	//submit new reimb
	public void submitReimbursements(int reimb_type_id, int reimb_amount, String reim_description);
	
	public List<reimbursement> getPendingList();

}
