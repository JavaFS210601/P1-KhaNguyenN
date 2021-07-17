package com.revature.models;

public class userRoles {
	
	
	
	
	private int user_role_id;
	private String user_role;
	private int user_roles_pk;
	
	
	public userRoles(int user_role_id, String user_role, int user_roles_pk) {
		super();
		this.user_role_id = user_role_id;
		this.user_role = user_role;
		this.user_roles_pk = user_roles_pk;
	}
	
	public userRoles(int user_role_id, String user_role) {
		super();
		this.user_role_id = user_role_id;
		this.user_role = user_role;
	}

	
	
	public userRoles() {
		super();
	}

	@Override
	public String toString() {
		return "userRoles [user_role_id=" + user_role_id + ", user_role=" + user_role + ", user_roles_pk="
				+ user_roles_pk + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((user_role == null) ? 0 : user_role.hashCode());
		result = prime * result + user_role_id;
		result = prime * result + user_roles_pk;
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
		userRoles other = (userRoles) obj;
		if (user_role == null) {
			if (other.user_role != null)
				return false;
		} else if (!user_role.equals(other.user_role))
			return false;
		if (user_role_id != other.user_role_id)
			return false;
		if (user_roles_pk != other.user_roles_pk)
			return false;
		return true;
	}

	public int getUser_role_id() {
		return user_role_id;
	}

	public void setUser_role_id(int user_role_id) {
		this.user_role_id = user_role_id;
	}

	public String getUser_role() {
		return user_role;
	}

	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}

	public int getUser_roles_pk() {
		return user_roles_pk;
	}

	public void setUser_roles_pk(int user_roles_pk) {
		this.user_roles_pk = user_roles_pk;
	}
	
	
	
}
