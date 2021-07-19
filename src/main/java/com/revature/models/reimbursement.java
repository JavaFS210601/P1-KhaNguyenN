package com.revature.models;

import java.sql.Time;

public class reimbursement {

	
	private int reim_id;
	private int reimamount;
	private Time reim_submittedTime;
	private Time reim_resolved;
	private String reim_description;
	private int reimb_author;
	private int reim_resolver;
	private int reim_status_id;
	private int reim_type_id;
	
	private int users_fk_auth;
	private int users_fk_reslvr;
	private int reimbursement_status_fk;
	private int reimbursement_type_fk;
	
	private int reimbursement_pk;
	//alt+shift+s boiler plate

	public reimbursement(int reim_id, int reimamount, Time reim_submittedTime, Time reim_resolved,
			String reim_descriptionString, int reimb_author, int reim_resolver, int reim_status_id, int reim_type_id,
			int users_fk_auth, int users_fk_reslvr, int reimbursement_status_fk, int reimbursement_type_fk,
			int reimbursement_pk) {
		super();
		this.reim_id = reim_id;
		this.reimamount = reimamount;
		this.reim_submittedTime = reim_submittedTime;
		this.reim_resolved = reim_resolved;
		this.reim_description = reim_descriptionString;
		this.reimb_author = reimb_author;
		this.reim_resolver = reim_resolver;
		this.reim_status_id = reim_status_id;
		this.reim_type_id = reim_type_id;
		this.users_fk_auth = users_fk_auth;
		this.users_fk_reslvr = users_fk_reslvr;
		this.reimbursement_status_fk = reimbursement_status_fk;
		this.reimbursement_type_fk = reimbursement_type_fk;
		this.reimbursement_pk = reimbursement_pk;
	}
	public reimbursement(int reim_id, int reimamount, Time reim_submittedTime, Time reim_resolved,
			String reim_descriptionString, int reimb_author, int reim_resolver, int reim_status_id, int reim_type_id,
			int users_fk_auth, int users_fk_reslvr, int reimbursement_status_fk, int reimbursement_type_fk) {
		super();
		this.reim_id = reim_id;
		this.reimamount = reimamount;
		this.reim_submittedTime = reim_submittedTime;
		this.reim_resolved = reim_resolved;
		this.reim_description = reim_descriptionString;
		this.reimb_author = reimb_author;
		this.reim_resolver = reim_resolver;
		this.reim_status_id = reim_status_id;
		this.reim_type_id = reim_type_id;
		this.users_fk_auth = users_fk_auth;
		this.users_fk_reslvr = users_fk_reslvr;
		this.reimbursement_status_fk = reimbursement_status_fk;
		this.reimbursement_type_fk = reimbursement_type_fk;
	}
	public reimbursement() {
		super();
	}
	@Override
	public String toString() {
		return "reimbursement [reim_id=" + reim_id + ", reimamount=" + reimamount + ", reim_submittedTime="
				+ reim_submittedTime + ", reim_resolved=" + reim_resolved + ", reim_descriptionString="
				+ reim_description + ", reimb_author=" + reimb_author + ", reim_resolver=" + reim_resolver
				+ ", reim_status_id=" + reim_status_id + ", reim_type_id=" + reim_type_id + ", users_fk_auth="
				+ users_fk_auth + ", users_fk_reslvr=" + users_fk_reslvr + ", reimbursement_status_fk="
				+ reimbursement_status_fk + ", reimbursement_type_fk=" + reimbursement_type_fk + ", reimbursement_pk="
				+ reimbursement_pk + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((reim_description == null) ? 0 : reim_description.hashCode());
		result = prime * result + reim_id;
		result = prime * result + ((reim_resolved == null) ? 0 : reim_resolved.hashCode());
		result = prime * result + reim_resolver;
		result = prime * result + reim_status_id;
		result = prime * result + ((reim_submittedTime == null) ? 0 : reim_submittedTime.hashCode());
		result = prime * result + reim_type_id;
		result = prime * result + reimamount;
		result = prime * result + reimb_author;
		result = prime * result + reimbursement_pk;
		result = prime * result + reimbursement_status_fk;
		result = prime * result + reimbursement_type_fk;
		result = prime * result + users_fk_auth;
		result = prime * result + users_fk_reslvr;
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
		reimbursement other = (reimbursement) obj;
		if (reim_description == null) {
			if (other.reim_description != null)
				return false;
		} else if (!reim_description.equals(other.reim_description))
			return false;
		if (reim_id != other.reim_id)
			return false;
		if (reim_resolved == null) {
			if (other.reim_resolved != null)
				return false;
		} else if (!reim_resolved.equals(other.reim_resolved))
			return false;
		if (reim_resolver != other.reim_resolver)
			return false;
		if (reim_status_id != other.reim_status_id)
			return false;
		if (reim_submittedTime == null) {
			if (other.reim_submittedTime != null)
				return false;
		} else if (!reim_submittedTime.equals(other.reim_submittedTime))
			return false;
		if (reim_type_id != other.reim_type_id)
			return false;
		if (reimamount != other.reimamount)
			return false;
		if (reimb_author != other.reimb_author)
			return false;
		if (reimbursement_pk != other.reimbursement_pk)
			return false;
		if (reimbursement_status_fk != other.reimbursement_status_fk)
			return false;
		if (reimbursement_type_fk != other.reimbursement_type_fk)
			return false;
		if (users_fk_auth != other.users_fk_auth)
			return false;
		if (users_fk_reslvr != other.users_fk_reslvr)
			return false;
		return true;
	}
	public int getReim_id() {
		return reim_id;
	}
	public void setReim_id(int reim_id) {
		this.reim_id = reim_id;
	}
	public int getReimamount() {
		return reimamount;
	}
	public void setReimamount(int reimamount) {
		this.reimamount = reimamount;
	}
	public Time getReim_submittedTime() {
		return reim_submittedTime;
	}
	public void setReim_submittedTime(Time reim_submittedTime) {
		this.reim_submittedTime = reim_submittedTime;
	}
	public Time getReim_resolved() {
		return reim_resolved;
	}
	public void setReim_resolved(Time reim_resolved) {
		this.reim_resolved = reim_resolved;
	}
	public String getReim_descriptionString() {
		return reim_description;
	}
	public void setReim_descriptionString(String reim_descriptionString) {
		this.reim_description = reim_descriptionString;
	}
	public int getReimb_author() {
		return reimb_author;
	}
	public void setReimb_author(int reimb_author) {
		this.reimb_author = reimb_author;
	}
	public int getReim_resolver() {
		return reim_resolver;
	}
	public void setReim_resolver(int reim_resolver) {
		this.reim_resolver = reim_resolver;
	}
	public int getReim_status_id() {
		return reim_status_id;
	}
	public void setReim_status_id(int reim_status_id) {
		this.reim_status_id = reim_status_id;
	}
	public int getReim_type_id() {
		return reim_type_id;
	}
	public void setReim_type_id(int reim_type_id) {
		this.reim_type_id = reim_type_id;
	}
	public int getUsers_fk_auth() {
		return users_fk_auth;
	}
	public void setUsers_fk_auth(int users_fk_auth) {
		this.users_fk_auth = users_fk_auth;
	}
	public int getUsers_fk_reslvr() {
		return users_fk_reslvr;
	}
	public void setUsers_fk_reslvr(int users_fk_reslvr) {
		this.users_fk_reslvr = users_fk_reslvr;
	}
	public int getReimbursement_status_fk() {
		return reimbursement_status_fk;
	}
	public void setReimbursement_status_fk(int reimbursement_status_fk) {
		this.reimbursement_status_fk = reimbursement_status_fk;
	}
	public int getReimbursement_type_fk() {
		return reimbursement_type_fk;
	}
	public void setReimbursement_type_fk(int reimbursement_type_fk) {
		this.reimbursement_type_fk = reimbursement_type_fk;
	}
	public int getReimbursement_pk() {
		return reimbursement_pk;
	}
	public void setReimbursement_pk(int reimbursement_pk) {
		this.reimbursement_pk = reimbursement_pk;
	}
	
	
}
