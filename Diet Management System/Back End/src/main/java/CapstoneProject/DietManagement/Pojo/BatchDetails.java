package CapstoneProject.DietManagement.Pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BatchDetails {
	
	
	
	private String batchName;
	
	@Id
	private String batchStartDate;
	
	private String batchEndDate;
	
	private String batchStatus;

	public BatchDetails(String batchName, String batchStartDate, String batchEndDate,String bathStatus) {
		super();
		this.batchName = batchName;
		this.batchStartDate = batchStartDate;
		this.batchEndDate = batchEndDate;
		this.batchStatus=batchStatus;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public String getBatchStartDate() {
		return batchStartDate;
	}

	public void setBatchStartDate(String batchStartDate) {
		this.batchStartDate = batchStartDate;
	}

	public String getBatchEndDate() {
		return batchEndDate;
	}

	public void setBatchEndDate(String batchEndDate) {
		this.batchEndDate = batchEndDate;
	}
	
	
	

	public String getBatchStatus() {
		return batchStatus;
	}

	public void setBatchStatus(String batchStatus) {
		this.batchStatus = batchStatus;
	}

	public BatchDetails() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
