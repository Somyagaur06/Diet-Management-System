package CapstoneProject.DietManagement.Pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Messages {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int messageId;
	
	private String sentBy;
	
	private String sentTo;
	
   private String senderRole;
	
	private String receiverRole;
	
	private String message;
	
	
	
	
	public Messages() {
		
	}
	
	
	public Messages(String sentBy, String sentTo, String senderRole, String receiverRole, String message) {
		super();
		this.sentBy = sentBy;
		this.sentTo = sentTo;
		this.senderRole = senderRole;
		this.receiverRole = receiverRole;
		this.message = message;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	


	

	public String getSentBy() {
		return sentBy;
	}


	public void setSentBy(String sentBy) {
		this.sentBy = sentBy;
	}


	public String getSentTo() {
		return sentTo;
	}


	public void setSentTo(String sentTo) {
		this.sentTo = sentTo;
	}


	public String getSenderRole() {
		return senderRole;
	}


	public void setSenderRole(String senderRole) {
		this.senderRole = senderRole;
	}


	public String getReceiverrRole() {
		return receiverRole;
	}


	public void setReceiverRole(String receiverRole) {
		this.receiverRole = receiverRole;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	@Override
	public String toString() {
		return "Messages [messageId=" + messageId + ", sentBy=" + sentBy + ", sentTo=" + sentTo + ", senderRole="
				+ senderRole + ", userRole=" + receiverRole + ", message=" + message + "]";
	}
	
	
	
	
	
	

}
