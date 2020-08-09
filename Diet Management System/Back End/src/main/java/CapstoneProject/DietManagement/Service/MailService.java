package CapstoneProject.DietManagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.crypto.password.PasswordEncoder;

import CapstoneProject.DietManagement.DataRepository.UserRepository;
import CapstoneProject.DietManagement.Pojo.User;

@Configuration
public class MailService {

	
	@Autowired
	UserRepository userRepository;
	
	
	@Autowired
	JavaMailSender javaMail;
	
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	                     
	public void sendAcceptanceMail(User user) {
		
		
		
		try {
			
			
			SimpleMailMessage message=new SimpleMailMessage();
			
			
			message.setTo(user.getUsername());
			message.setFrom("somyagaur0605@gmail.com");
			message.setSubject("Registration Acceptance for Online Diet Management");
			
			message.setText(
					
					"Congratulations your request for Online Diet Management has been accepted.Your login password with rest of the details are as follows"
					+
					"Batch-Name =" +user.getBatchName()+" "+
					"Batch-Group =" +user.getBatchGroup()+" "+
					"Username ="+user.getUsername()+" "+
					"Password=" +"wipro@123"
					
					
					
					
					);
			javaMail.send(message);
			
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	public void rejectionMail(String username) {
		
		try{
		SimpleMailMessage message=new SimpleMailMessage();
		
		message.setTo(username);
		message.setFrom("Diet-Management@gmail.com");
		message.setSubject("Registration rejection for Online Diet Management");
		
		message.setText("Sorry to inform you but your registration request for Online Diet Management has been rejected.");
		
		javaMail.send(message);
		
		}
		
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	public void  forgotPassword(User user) {
		
		try {
			
			SimpleMailMessage message=new SimpleMailMessage();
			
			String password=user.getBatchName()+""+user.getUsername();
			
			message.setTo(user.getUsername());
			message.setText("Your new Password is :"+" "+ password );
			user.setPassword(this.passwordEncoder.encode(password));
			this.userRepository.save(user);
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
}
