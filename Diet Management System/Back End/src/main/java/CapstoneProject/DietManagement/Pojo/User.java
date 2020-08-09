package CapstoneProject.DietManagement.Pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	
	@Id
	private String username;
	
	private String name;
	
	private String password;
	
	private String role;
	
	private String batchName;
	
	private String batchGroup;
	
	private String batchMonth;
	
	private String mobile;
	
	private String batchStatus;
	
	private String userStatus;
	
	
	
	public User() {
		
	}
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public String getBatchGroup() {
		return batchGroup;
	}

	public void setBatchGroup(String batchGroup) {
		this.batchGroup = batchGroup;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	
	

	public String getBatchMonth() {
		return batchMonth;
	}


	public void setBatchMonth(String batchMonth) {
		this.batchMonth = batchMonth;
	}
	
	
	
	
	
	
	
	
	


	public String getUserStatus() {
		return userStatus;
	}


	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}


	public String getBatchStatus() {
		return batchStatus;
	}


	public void setBatchStatus(String batchStatus) {
		this.batchStatus = batchStatus;
	}


	public User(String username, String name, String password, String role, String batchName, String batchGroup,
			String mobile,String batchMonth,String batchStatus,String userStatus) {
	
		this.username = username;
		this.name = name;
		this.password = password;
		this.role = role;
		this.batchName = batchName;
		this.batchGroup = batchGroup;
		this.mobile = mobile;
		this.batchMonth=batchMonth;
		this.batchStatus=batchStatus;
		this.userStatus=userStatus;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", name=" + name + ", password=" + password + ", role=" + role
				+ ", batchName=" + batchName + ", batchGroup=" + batchGroup + ", mobile=" + mobile + "]";
	}
	
	
}
