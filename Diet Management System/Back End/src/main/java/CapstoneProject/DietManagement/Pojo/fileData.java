package CapstoneProject.DietManagement.Pojo;



import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class fileData {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	
	private String name;
	
	
	private String type;
	
	
	private String sentTo;
	
	
	@Lob
	private byte[] file;


	public fileData() {
		
	}


	public fileData(String name, String type, byte[] file,String sentTo) {
		super();
		this.name = name;
		this.type = type;
		this.file = file;
		this.sentTo=sentTo;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	
	


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public byte[] getFile() {
		return file;
	}


	public void setFile(byte[] file) {
		this.file = file;
	}

	
	
	
	
	
	
	
	
	
	
	
	

	public String getSentTo() {
		return sentTo;
	}


	public void setSentTo(String sentTo) {
		this.sentTo = sentTo;
	}


	@Override
	public String toString() {
		return "fileData [id=" + id + ", name=" + name + ", type=" + type + ", file=" + Arrays.toString(file) + "]";
	}
	
	
	
	
	
	

}
