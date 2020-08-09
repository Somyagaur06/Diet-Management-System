package CapstoneProject.DietManagement.Pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ChallengerRegistration {
     
	private String batch;
	  
	private String fullName;
	  
	@Id
   private String  username;
	  
	private String mobileNo;
	  
	private String age;
	  
	private String gender;
	  
	private String state;
	  
	 private String city;
	  
	 private String address;
	  
	 private String pinCode;
	  
	 private int weight;
	  
	 private int height;

	private String joiningReason;
	  
	private String medicalCondition;
	  
	private String pregnancyStatus;
	    
	private String dietery;

	private String status;

	private String referralCode ;
	
	private String dieteryRestriction;
	
	private int bmi;
	

	public ChallengerRegistration() {
		
	}


	public String getBatch() {
		return batch;
	}


	public void setBatch(String batch) {
		this.batch = batch;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPinCode() {
		return pinCode;
	}


	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public String getJoiningReason() {
		return joiningReason;
	}


	public void setJoiningReason(String joiningReason) {
		this.joiningReason = joiningReason;
	}


	public String getMedicalCondition() {
		return medicalCondition;
	}


	public void setMedicalCondition(String medicalCondition) {
		this.medicalCondition = medicalCondition;
	}


	public String getPregnancyStatus() {
		return pregnancyStatus;
	}


	public void setPregnancyStatus(String pregnancyStatus) {
		this.pregnancyStatus = pregnancyStatus;
	}


	public String getDietery() {
		return dietery;
	}


	public void setDietery(String dietery) {
		this.dietery = dietery;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getReferralCode() {
		return referralCode;
	}


	public void setReferralCode(String referralCode) {
		this.referralCode = referralCode;
	}


	public String getdieteryRestriction() {
		return dieteryRestriction;
	}


	public void setDieteryRestriction(String dieteryRestriction) {
		this.dieteryRestriction = dieteryRestriction;
	}


	public int getbmi() {
		return bmi;
	}


	public void setbmi(int bmi) {
		this.bmi = bmi;
	}


	public ChallengerRegistration(String batch, String fullName, String username, String mobileNo, String age,
			String gender, String state, String city, String address, String pinCode, int weight, int height,
			String joiningReason, String medicalCondition, String pregnancyStatus, String dietery, String status,
			String referralCode, String dieteryRestriction, int bmi) {
		super();
		this.batch = batch;
		this.fullName = fullName;
		this.username = username;
		this.mobileNo = mobileNo;
		this.age = age;
		this.gender = gender;
		this.state = state;
		this.city = city;
		this.address = address;
		this.pinCode = pinCode;
		this.weight = weight;
		this.height = height;
		this.joiningReason = joiningReason;
		this.medicalCondition = medicalCondition;
		this.pregnancyStatus = pregnancyStatus;
		this.dietery = dietery;
		this.status = status;
		this.referralCode = referralCode;
		this.dieteryRestriction = dieteryRestriction;
		this.bmi = bmi;
	}


	@Override
	public String toString() {
		return "ChallengerRegistration [batch=" + batch + ", fullName=" + fullName + ", username=" + username
				+ ", mobileNo=" + mobileNo + ", age=" + age + ", gender=" + gender + ", state=" + state + ", city="
				+ city + ", address=" + address + ", pinCode=" + pinCode + ", weight=" + weight + ", height=" + height
				+ ", joiningReason=" + joiningReason + ", medicalCondition=" + medicalCondition + ", pregnancyStatus="
				+ pregnancyStatus + ", dietery=" + dietery + ", status=" + status + ", referralCode=" + referralCode
				+ ", DieteryRestriction=" + dieteryRestriction + ", bmi=" + bmi + "]";
	}
	
	
	

	
	
	
	
	
	
	
}