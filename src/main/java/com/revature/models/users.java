package com.revature.models;

public class users {

	
	private int users_id;
	private String username;
	private String password;
	private String first_name;
	private String last_name;
	private String user_email;
	private int user_role_id;
	
	private int user_roles_fk;
	
	private int users_pk;

	public users(int users_id, String username, String password, String first_name, String last_name, String user_email,
			int user_role_id, int user_roles_fk, int users_pk) {
		super();
		this.users_id = users_id;
		this.username = username;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
		this.user_email = user_email;
		this.user_role_id = user_role_id;
		this.user_roles_fk = user_roles_fk;
		this.users_pk = users_pk;
	}

	public users(int users_id, String username, String password, String first_name, String last_name, String user_email,
			int user_role_id, int user_roles_fk) {
		super();
		this.users_id = users_id;
		this.username = username;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
		this.user_email = user_email;
		this.user_role_id = user_role_id;
		this.user_roles_fk = user_roles_fk;
	}

	public users() {
		super();
	}

	@Override
	public String toString() {
		return "users [users_id=" + users_id + ", username=" + username + ", password=" + password + ", first_name="
				+ first_name + ", last_name=" + last_name + ", user_email=" + user_email + ", user_role_id="
				+ user_role_id + ", user_roles_fk=" + user_roles_fk + ", users_pk=" + users_pk + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first_name == null) ? 0 : first_name.hashCode());
		result = prime * result + ((last_name == null) ? 0 : last_name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((user_email == null) ? 0 : user_email.hashCode());
		result = prime * result + user_role_id;
		result = prime * result + user_roles_fk;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		result = prime * result + users_id;
		result = prime * result + users_pk;
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
		users other = (users) obj;
		if (first_name == null) {
			if (other.first_name != null)
				return false;
		} else if (!first_name.equals(other.first_name))
			return false;
		if (last_name == null) {
			if (other.last_name != null)
				return false;
		} else if (!last_name.equals(other.last_name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (user_email == null) {
			if (other.user_email != null)
				return false;
		} else if (!user_email.equals(other.user_email))
			return false;
		if (user_role_id != other.user_role_id)
			return false;
		if (user_roles_fk != other.user_roles_fk)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		if (users_id != other.users_id)
			return false;
		if (users_pk != other.users_pk)
			return false;
		return true;
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

	public int getUser_roles_fk() {
		return user_roles_fk;
	}

	public void setUser_roles_fk(int user_roles_fk) {
		this.user_roles_fk = user_roles_fk;
	}

	public int getUsers_pk() {
		return users_pk;
	}

	public void setUsers_pk(int users_pk) {
		this.users_pk = users_pk;
	}
	
	
	
	
}
