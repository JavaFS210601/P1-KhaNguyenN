package com.revature.models;

import java.sql.Time;
import java.util.Objects;

public class reimbursement {

	
	private int reim_id;
	private int reim_amount;
	private Time reimb_submitted;
	private Time reimb_resolved;
	private String reimb_description;
	private int reimb_author;
	private int reimb_resolver;
	private int reimb_status_id;
	private int reimb_type_id;
	public reimbursement(int reim_id, int reim_amount, Time reimb_submitted, Time reimb_resolved,
			String reimb_description, int reimb_author, int reimb_resolver, int reimb_status_id, int reimb_type_id) {
		super();
		this.reim_id = reim_id;
		this.reim_amount = reim_amount;
		this.reimb_submitted = reimb_submitted;
		this.reimb_resolved = reimb_resolved;
		this.reimb_description = reimb_description;
		this.reimb_author = reimb_author;
		this.reimb_resolver = reimb_resolver;
		this.reimb_status_id = reimb_status_id;
		this.reimb_type_id = reimb_type_id;
	}
	public reimbursement(int reim_amount, Time reimb_submitted, Time reimb_resolved, String reimb_description,
			int reimb_author, int reimb_resolver, int reimb_status_id, int reimb_type_id) {
		super();
		this.reim_amount = reim_amount;
		this.reimb_submitted = reimb_submitted;
		this.reimb_resolved = reimb_resolved;
		this.reimb_description = reimb_description;
		this.reimb_author = reimb_author;
		this.reimb_resolver = reimb_resolver;
		this.reimb_status_id = reimb_status_id;
		this.reimb_type_id = reimb_type_id;
	}
	public reimbursement() {
		super();
	}
	@Override
	public String toString() {
		return "reimbursement [reim_id=" + reim_id + ", reim_amount=" + reim_amount + ", reimb_submitted="
				+ reimb_submitted + ", reimb_resolved=" + reimb_resolved + ", reimb_description=" + reimb_description
				+ ", reimb_author=" + reimb_author + ", reimb_resolver=" + reimb_resolver + ", reimb_status_id="
				+ reimb_status_id + ", reimb_type_id=" + reimb_type_id + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(reim_amount, reim_id, reimb_author, reimb_description, reimb_resolved, reimb_resolver,
				reimb_status_id, reimb_submitted, reimb_type_id);
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
		return reim_amount == other.reim_amount && reim_id == other.reim_id && reimb_author == other.reimb_author
				&& Objects.equals(reimb_description, other.reimb_description)
				&& Objects.equals(reimb_resolved, other.reimb_resolved) && reimb_resolver == other.reimb_resolver
				&& reimb_status_id == other.reimb_status_id && Objects.equals(reimb_submitted, other.reimb_submitted)
				&& reimb_type_id == other.reimb_type_id;
	}
	public int getReim_id() {
		return reim_id;
	}
	public void setReim_id(int reim_id) {
		this.reim_id = reim_id;
	}
	public int getReim_amount() {
		return reim_amount;
	}
	public void setReim_amount(int reim_amount) {
		this.reim_amount = reim_amount;
	}
	public Time getReimb_submitted() {
		return reimb_submitted;
	}
	public void setReimb_submitted(Time reimb_submitted) {
		this.reimb_submitted = reimb_submitted;
	}
	public Time getReimb_resolved() {
		return reimb_resolved;
	}
	public void setReimb_resolved(Time reimb_resolved) {
		this.reimb_resolved = reimb_resolved;
	}
	public String getReimb_description() {
		return reimb_description;
	}
	public void setReimb_description(String reimb_description) {
		this.reimb_description = reimb_description;
	}
	public int getReimb_author() {
		return reimb_author;
	}
	public void setReimb_author(int reimb_author) {
		this.reimb_author = reimb_author;
	}
	public int getReimb_resolver() {
		return reimb_resolver;
	}
	public void setReimb_resolver(int reimb_resolver) {
		this.reimb_resolver = reimb_resolver;
	}
	public int getReimb_status_id() {
		return reimb_status_id;
	}
	public void setReimb_status_id(int reimb_status_id) {
		this.reimb_status_id = reimb_status_id;
	}
	public int getReimb_type_id() {
		return reimb_type_id;
	}
	public void setReimb_type_id(int reimb_type_id) {
		this.reimb_type_id = reimb_type_id;
	}
	
	
//	private int users_fk_auth;
//	private int users_fk_reslvr;
//	private int reimbursement_status_fk;
//	private int reimbursement_type_fk;
	
	
	
	
	
	

	
	
	
	
	//alt+shift+s boiler plate
}