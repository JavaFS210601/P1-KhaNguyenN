package com.revature.models;

public class ReimbursementsDTO {

public int reim_id;
	
	public int reimb_type_id;
	
	public int reimb_status_id;
	
	public int reimb_amount;
	
	public String reimb_description;

	public Object reimb_id;
	
	public ReimbursementsDTO(int reimb_status_id) {
		super();
		this.reimb_status_id = reimb_status_id;
	}
	
	public ReimbursementsDTO(int reim_id, int reimb_status_id) {
		super();
		this.reim_id = reim_id;
		this.reimb_status_id = reimb_status_id;
	}
	
	public ReimbursementsDTO() {
		super();
	}

	public ReimbursementsDTO(int reimb_type_id, int reimb_amount, String reimb_description) {
		super();
		this.reimb_type_id = reimb_type_id;
		this.reimb_amount = reimb_amount;
		this.reimb_description = reimb_description;
	}
	
	
	
	
	
	
}