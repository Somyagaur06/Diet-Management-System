package CapstoneProject.DietManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import CapstoneProject.DietManagement.DataRepository.BatchRepository;
import CapstoneProject.DietManagement.DataRepository.ChallengerRegistrationRepository;
import CapstoneProject.DietManagement.DataRepository.MessagesRepository;
import CapstoneProject.DietManagement.DataRepository.UserRepository;
import CapstoneProject.DietManagement.Pojo.ChallengerRegistration;
import CapstoneProject.DietManagement.Pojo.Messages;
import CapstoneProject.DietManagement.Pojo.User;

@Service
public class AdminService {
	
	
	
	
	@Autowired
	ChallengerRegistrationRepository challengerRegistrationRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	UserService service;
	
	@Autowired
	MessagesRepository messageRepository;
	
	@Autowired
	BatchRepository batchRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	//Fetching Request for admin-approval
	
		
		public List<ChallengerRegistration> getRequest() {
			
			
			
			List details=this.challengerRegistrationRepository.findByStatus("pending");
			
			return details;
			
			
		}
		
		//Accepting Challenger Registration
		
		public boolean acceptRequest( ChallengerRegistration userData) {
			
			this.service.approvedRequest(userData);
			
			return true;
			
		}
		
		
		
		//Deleting Challenger Registration
		
		
		
		public boolean deleteRequest( ChallengerRegistration userData) {
		
		this.service.deleteRequest(userData.getUsername());
		
		return true;
		
		}
		
		
		
		//Fetching Admin Messages
		
		
		public List<Messages> getAdminMessages() {
			
			
			
			
			
			return (List<Messages>) this.messageRepository.findAll();
			
			
		}
		
		
		
		//Fetching Admin Messages
		
			
			public boolean postAdminMessages( Messages message) {
				
				
				
				this.messageRepository.save(message);
				
				return true;
				
				
			}
		
			
			//Fetching all users
			
			public List<User> getAllUsers(){
				
				return (List<User>) this.userRepository.findAll();
			}
		
		
			
			
			
			public boolean changePassword( User user)
			{
				User newUser=this.userRepository.findByUsername(user.getUsername());
				newUser.setPassword(this.passwordEncoder.encode(user.getPassword()));
				this.userRepository.save(newUser);
				
				return true;
				
				
			}
	}
	
	
	
	
	
	
	
	 


