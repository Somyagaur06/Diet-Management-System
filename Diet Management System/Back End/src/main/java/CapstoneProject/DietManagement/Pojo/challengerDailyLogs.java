package CapstoneProject.DietManagement.Pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class challengerDailyLogs {
	
	@Id
	private String username;
	
	private String fullName;
	

	private String date;
	
	private String breakfast;
	
	private String lunch;
	
	private String dinner;
	
	private String fruits;
	
	private String vegetables;
	
	private String workout;
	
	private String extraActivity;
	
	private String batchName;
	
	private String batchGroup;
	
	

	public challengerDailyLogs(String username, String date, String breakfast, String lunch, String dinner,
			String fruits, String vegetables, String workout, String extraActivity,String fullName,String batchGroup,String batchName) {
		super();
		this.username = username;
		this.date = date;
		this.breakfast = breakfast;
		this.lunch = lunch;
		this.dinner = dinner;
		this.fruits = fruits;
		this.vegetables = vegetables;
		this.workout = workout;
		this.extraActivity = extraActivity;
		this.fullName=fullName;
		this.batchGroup=batchGroup;
		this.batchName=batchName;
	}

	public challengerDailyLogs() {
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	
	
	
	
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getBreakfast() {
		return breakfast;
	}

	public void setBreakfast(String breakfast) {
		this.breakfast = breakfast;
	}

	public String getLunch() {
		return lunch;
	}

	public void setLunch(String lunch) {
		this.lunch = lunch;
	}

	public String getDinner() {
		return dinner;
	}

	public void setDinner(String dinner) {
		this.dinner = dinner;
	}

	public String getFruits() {
		return fruits;
	}

	public void setFruits(String fruits) {
		this.fruits = fruits;
	}

	public String getVegetables() {
		return vegetables;
	}

	public void setVegetables(String vegetables) {
		this.vegetables = vegetables;
	}

	public String getWorkout() {
		return workout;
	}

	public void setWorkout(String workout) {
		this.workout = workout;
	}

	public String getExtraActivity() {
		return extraActivity;
	}

	public void setExtraActivity(String extraActivity) {
		this.extraActivity = extraActivity;
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

	@Override
	public String toString() {
		return "challengerDailyLogs [username=" + username + ", fullName=" + fullName + ", date=" + date
				+ ", breakfast=" + breakfast + ", lunch=" + lunch + ", dinner=" + dinner + ", fruits=" + fruits
				+ ", vegetables=" + vegetables + ", workout=" + workout + ", extraActivity=" + extraActivity + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
