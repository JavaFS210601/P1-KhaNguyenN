package com.revature.daos;

import java.util.List;

import com.revature.models.reimbursement;

public interface EmployeeInterface {

	List<reimbursement> viewPastTicketsList();


	void submitReimbursements(int reimamount, String reim_description);

}
