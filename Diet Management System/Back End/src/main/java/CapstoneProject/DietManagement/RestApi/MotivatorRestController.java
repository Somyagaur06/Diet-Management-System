package CapstoneProject.DietManagement.RestApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import CapstoneProject.DietManagement.Pojo.User;
import CapstoneProject.DietManagement.Service.MotivatorService;

@RestController
@CrossOrigin(origins="*")
public class MotivatorRestController {

	@Autowired
     MotivatorService service;;
	
	
	
	
	
	
	
	
	@PostMapping("/addMotivator")
	public boolean addMotivator(@RequestBody User user) {
		
		this.service.addMotivator(user);
		
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
