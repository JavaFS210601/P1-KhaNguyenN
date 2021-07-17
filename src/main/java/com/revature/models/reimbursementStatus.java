package com.revature.models;

public class reimbursementStatus {

	private int reimb_status_id;
	private String reim_status;
	private int reim_status_pk;
	
	
	
	public reimbursementStatus(int reimb_status_id, String reim_status, int reim_status_pk) {
		super();
		this.reimb_status_id = reimb_status_id;
		this.reim_status = reim_status;
		this.reim_status_pk = reim_status_pk;
	}



	public reimbursementStatus(int reimb_status_id, String reim_status) {
		super();
		this.reimb_status_id = reimb_status_id;
		this.reim_status = reim_status;
	}



	public reimbursementStatus() {
		super();
	}



	@Override
	public String toString() {
		return "reimbursementStatus [reimb_status_id=" + reimb_status_id + ", reim_status=" + reim_status
				+ ", reim_status_pk=" + reim_status_pk + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((reim_status == null) ? 0 : reim_status.hashCode());
		result = prime * result + reim_status_pk;
		result = prime * result + reimb_status_id;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		reimbursementStatus other = (reimbursementStatus) obj;
		if (reim_status == null) {
			if (other.reim_status != null)
				return false;
		} else if (!reim_status.equals(other.reim_status))
			return false;
		if (reim_status_pk != other.reim_status_pk)
			return false;
		if (reimb_status_id != other.reimb_status_id)
			return false;
		return true;
	}



	public int getReimb_status_id() {
		return reimb_status_id;
	}



	public void setReimb_status_id(int reimb_status_id) {
		this.reimb_status_id = reimb_status_id;
	}



	public String getReim_status() {
		return reim_status;
	}



	public void setReim_status(String reim_status) {
		this.reim_status = reim_status;
	}



	public int getReim_status_pk() {
		return reim_status_pk;
	}



	public void setReim_status_pk(int reim_status_pk) {
		this.reim_status_pk = reim_status_pk;
	}
	
	
	
	
}
