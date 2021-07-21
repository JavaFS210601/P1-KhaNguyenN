package com.revature.models;

import java.util.Objects;

public class users {

	
	private int users_id;
	private String username;
	private String password;
	private String first_name;
	private String last_name;
	private String user_email;
	private int user_role_id;
	public users(int users_id, String username, String password, String first_name, String last_name, String user_email,
			int user_role_id) {
		super();
		this.users_id = users_id;
		this.username = username;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
		this.user_email = user_email;
		this.user_role_id = user_role_id;
	}
	public users(String username, String password, String first_name, String last_name, String user_email,
			int user_role_id) {
		super();
		this.username = username;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
		this.user_email = user_email;
		this.user_role_id = user_role_id;
	}
	public users() {
		super();
	}
	@Override
	public String toString() {
		return "users [users_id=" + users_id + ", username=" + username + ", password=" + password + ", first_name="
				+ first_name + ", last_name=" + last_name + ", user_email=" + user_email + ", user_role_id="
				+ user_role_id + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(first_name, last_name, password, user_email, user_role_id, username, users_id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		users other = (users) obj;
		return Objects.equals(first_name, other.first_name) && Objects.equals(last_name, other.last_name)
				&& Objects.equals(password, other.password) && Objects.equals(user_email, other.user_email)
				&& user_role_id == other.user_role_id && Objects.equals(username, other.username)
				&& users_id == other.users_id;
	}
	public int getUsers_id() {
		return users_id;
	}
	public void setUsers_id(int users_id) {
		this.users_id = users_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public int getUser_role_id() {
		return user_role_id;
	}
	public void setUser_role_id(int user_role_id) {
		this.user_role_id = user_role_id;
	}
	
//	private int user_roles_fk;
//	
//	private int users_pk;

	
	
}
