package CapstoneProject.DietManagement.RestApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import CapstoneProject.DietManagement.Pojo.ChallengerMonthlyLogs;
import CapstoneProject.DietManagement.Pojo.challengerDailyLogs;
import CapstoneProject.DietManagement.Service.ChallengerService;

@RestController()
@CrossOrigin(origins="*")
public class ChallengerRestControl {

	
	
	
	
	
	@Autowired
	private ChallengerService service;
	
	
	
	
	//Fetching challenger daily logs
	
	@GetMapping("/getDailyLogs")
	
	public List<challengerDailyLogs> getDailyLogs(){
		
		
		return this.service.getDailyLogs();
				
		
		}
	
	
	
	
	
	//Saving challenger daily logs
	
	@PostMapping("/saveDailyLogs")
	public boolean saveDailyLogs(@RequestBody challengerDailyLogs record)
	
	{
		
		this.service.saveDailyLogs(record);
		
		
		return true;
         
	}

	
	
	
	//Saving challenger Monthly Logs

	@PostMapping("/saveMonthlyLogs")
	public boolean saveMonthlyLogs(@RequestBody ChallengerMonthlyLogs record)
	
	{
		
		this.service.saveMonthlyLogs(record);
		
		
		return true;
         
	}

	
	
	
	
	//Fetching challenger Monthly logs
	
		@GetMapping("/getMonthlyLogs")
		
		public List<ChallengerMonthlyLogs> getMonthlyLogs(){
			
			
			return this.service.getMonthlyLogs();
					
			
			}

}