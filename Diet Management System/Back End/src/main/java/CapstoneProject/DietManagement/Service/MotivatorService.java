package CapstoneProject.DietManagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import CapstoneProject.DietManagement.DataRepository.UserRepository;
import CapstoneProject.DietManagement.Pojo.User;

@Service
public class MotivatorService {
	
	
	@Autowired
	UserRepository userRepository;
	
	
	
	
	
	
	
	
	@PostMapping("/addMotivator")
	public boolean addMotivator(@RequestBody User user) {
		User u=this.userRepository.findByUsername(user.getUsername());
		u.setBatchGroup(user.getBatchGroup());
		u.setBatchName(user.getBatchName());
		u.setRole("motivator");
		u.setBatchMonth(user.getBatchMonth());
		u.setBatchStatus("Ongoing");
		u.setUserStatus("active");
        this.userRepository.save(u);
		
		return true;
	}

}
