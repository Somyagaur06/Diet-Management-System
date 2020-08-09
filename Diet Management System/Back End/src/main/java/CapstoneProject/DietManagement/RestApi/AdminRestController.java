package CapstoneProject.DietManagement.RestApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import CapstoneProject.DietManagement.Pojo.ChallengerRegistration;
import CapstoneProject.DietManagement.Pojo.Messages;
import CapstoneProject.DietManagement.Pojo.User;
import CapstoneProject.DietManagement.Service.AdminService;

@RestController
@CrossOrigin(origins="*")
public class AdminRestController {

	
	
	@Autowired
	private AdminService adminService;
	

	//Fetching Request for admin-approval
	
	@GetMapping("/getApprovalRequest")
	public List<ChallengerRegistration> getRequest() {
		
		
		
		List details=this.adminService.getRequest();
		
		return details;
		
		
	}
	
	//Accepting Challenger Registration
	@PostMapping("/acceptChallengerRequest")
	public boolean acceptRequest(@RequestBody ChallengerRegistration userData) {
		
		this.adminService.acceptRequest(userData);
		
		return true;
		
	}
	
	
	
	//Deleting Challenger Registration
	
	@PostMapping("/deleteChallengerRequest")
	
	public boolean deleteRequest(@RequestBody ChallengerRegistration userData) {
	
	this.adminService.deleteRequest(userData);
	
	return true;
	
	}
	
	
	
	//Fetching Admin Messages
	
	@GetMapping("/getAllMessages")
	public List<Messages> getAdminMessages() {
		
		
		
		
		
		return this.adminService.getAdminMessages();
		
		
	}
	
	
	
	//Fetching Admin Messages
	
		@PostMapping("/postAdminMessage")
		public boolean postAdminMessages(@RequestBody Messages message) {
			
			
			
			this.adminService.postAdminMessages(message);
			
			return true;
			
			
		}
	
		
		//Fetching all users
		
		@GetMapping("/getAllUsers")
		public List<User> getAllUsers(){
			
			return this.adminService.getAllUsers();
		}
	
	
		
		
		@PostMapping("/changePassword")
		public boolean changePassword(@RequestBody User user)
		{
			this.adminService.changePassword(user);
			
			return true;
			
			
		}
}
