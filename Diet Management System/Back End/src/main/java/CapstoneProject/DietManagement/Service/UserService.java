package CapstoneProject.DietManagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;

import CapstoneProject.DietManagement.DataRepository.ChallengerRegistrationRepository;
import CapstoneProject.DietManagement.DataRepository.UserRepository;
import CapstoneProject.DietManagement.Pojo.ChallengerRegistration;
import CapstoneProject.DietManagement.Pojo.User;

@Controller
public class UserService {

	@Autowired
	ChallengerRegistrationRepository challengerRegistrationRepository;
	
	@Autowired
	UserRepository userRepository;
	
	
	@Autowired
	MailService mailService;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	 
	
	
	
	public void approvedRequest(ChallengerRegistration userData) {
		
		
		try {
			
			User user=new User();
			
			user.setUsername(userData.getUsername());
			user.setRole("challenger");
			user.setName(userData.getFullName());
			String password="wipro@123";
			user.setPassword(this.passwordEncoder.encode(password));
			user.setBatchMonth("July-Sept");
			user.setBatchStatus("Ongoing");
			user.setUserStatus("active");
			userData.setStatus("approved");
			
			
			user.setMobile(userData.getMobileNo());
			
			if(userData.getbmi()>25)
			{
				
				user.setBatchName("Above Bmi 25");
				user.setBatchGroup(userData.getCity());
			}
			
			
			else {
				if(userData.getbmi()<25)
				
				user.setBatchName("Below Bmi 25");
				user.setBatchGroup("NA");
			}
		
			
			this.challengerRegistrationRepository.save(userData);
			this.userRepository.save(user);
			
			this.mailService.sendAcceptanceMail(user);
			
			
			}
			
			catch(Exception e) {
				e.printStackTrace();
			}
			
	}
	
	
	
	
	
	public void deleteRequest(String username) {
		
		
		this.challengerRegistrationRepository.deleteById(username);
		
		this.mailService.rejectionMail(username);
		
	}
}
