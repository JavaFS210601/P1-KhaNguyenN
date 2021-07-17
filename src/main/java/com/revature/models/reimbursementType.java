package com.revature.models;

public class reimbursementType {

	
	private int reimb_type_id;
	private String reimb_type;
	private int reim_type_pk;
	
	
	public reimbursementType(int reimb_type_id, String reimb_type, int reim_type_pk) {
		super();
		this.reimb_type_id = reimb_type_id;
		this.reimb_type = reimb_type;
		this.reim_type_pk = reim_type_pk;
	}


	public reimbursementType(int reimb_type_id, String reimb_type) {
		super();
		this.reimb_type_id = reimb_type_id;
		this.reimb_type = reimb_type;
	}


	public reimbursementType() {
		super();
	}


	@Override
	public String toString() {
		return "reimbursementType [reimb_type_id=" + reimb_type_id + ", reimb_type=" + reimb_type + ", reim_type_pk="
				+ reim_type_pk + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + reim_type_pk;
		result = prime * result + ((reimb_type == null) ? 0 : reimb_type.hashCode());
		result = prime * result + reimb_type_id;
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
		reimbursementType other = (reimbursementType) obj;
		if (reim_type_pk != other.reim_type_pk)
			return false;
		if (reimb_type == null) {
			if (other.reimb_type != null)
				return false;
		} else if (!reimb_type.equals(other.reimb_type))
			return false;
		if (reimb_type_id != other.reimb_type_id)
			return false;
		return true;
	}


	public int getReimb_type_id() {
		return reimb_type_id;
	}


	public void setReimb_type_id(int reimb_type_id) {
		this.reimb_type_id = reimb_type_id;
	}


	public String getReimb_type() {
		return reimb_type;
	}


	public void setReimb_type(String reimb_type) {
		this.reimb_type = reimb_type;
	}


	public int getReim_type_pk() {
		return reim_type_pk;
	}


	public void setReim_type_pk(int reim_type_pk) {
		this.reim_type_pk = reim_type_pk;
	}
	
	
}
