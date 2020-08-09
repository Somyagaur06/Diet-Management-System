package CapstoneProject.DietManagement.Pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ChallengerMonthlyLogs {
	
	@Id
	private String username;
	
	private String fullName;
	
	private String month;
	
    private String height;
    
    private String weight;
    
    private String chest;
    
    private String waist;
    
    private String shoulders;
    
    private String biceps;
    
    private String forearms;
    
    private String thighs;
    
    private String batchName;
    
    private String batchGroup;

	public ChallengerMonthlyLogs() {
		
	}

	public ChallengerMonthlyLogs(String username, String fullName, String height, String weight, String chest,
			String waist, String shoulders, String biceps, String forearms, String thighs,String month,String batchName,String batchGroup) {
		
		this.username = username;
		this.fullName = fullName;
		this.height = height;
		this.weight = weight;
		this.chest = chest;
		this.waist = waist;
		this.shoulders = shoulders;
		this.biceps = biceps;
		this.forearms = forearms;
		this.thighs = thighs;
		this.month=month;
		this.batchGroup=batchGroup;
		this.batchName=batchName;
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

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getChest() {
		return chest;
	}

	public void setChest(String chest) {
		this.chest = chest;
	}

	public String getWaist() {
		return waist;
	}

	public void setWaist(String waist) {
		this.waist = waist;
	}

	public String getShoulders() {
		return shoulders;
	}

	public void setShoulders(String shoulders) {
		this.shoulders = shoulders;
	}

	public String getBiceps() {
		return biceps;
	}

	public void setBiceps(String biceps) {
		this.biceps = biceps;
	}

	public String getForearms() {
		return forearms;
	}

	public void setForearms(String forearms) {
		this.forearms = forearms;
	}

	public String getThighs() {
		return thighs;
	}

	public void setThighs(String thighs) {
		this.thighs = thighs;
		
	}
	
	
	
	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
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
		return "ChallengerMonthlyLogs [username=" + username + ", fullName=" + fullName + ", month=" + month
				+ ", height=" + height + ", weight=" + weight + ", chest=" + chest + ", waist=" + waist + ", shoulders="
				+ shoulders + ", biceps=" + biceps + ", forearms=" + forearms + ", thighs=" + thighs + "]";
	}

	
    
    
	
	
    
    
    
    
    
    
    
    
	

}
