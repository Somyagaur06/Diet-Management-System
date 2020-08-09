package CapstoneProject.DietManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import CapstoneProject.DietManagement.DataRepository.DailyLogsRepository;
import CapstoneProject.DietManagement.DataRepository.MonthlyLogsRepository;
import CapstoneProject.DietManagement.Pojo.ChallengerMonthlyLogs;
import CapstoneProject.DietManagement.Pojo.challengerDailyLogs;

@Service
public class ChallengerService {
	
	@Autowired
	private DailyLogsRepository  dailyLogs;
	
	
	@Autowired
	private MonthlyLogsRepository monthlyLogs;
	
	
	
	
	//Fetching challenger daily logs
	

	
	public List<challengerDailyLogs> getDailyLogs(){
		
		
		return (List<challengerDailyLogs>)this.dailyLogs.findAll();
				
		
		}
	
	
	
	
	
	//Saving challenger daily logs
	
	
	public boolean saveDailyLogs( challengerDailyLogs record)
	
	{
		
		System.out.println(record.toString());
		this.dailyLogs.save(record);
		
		
		return true;
         
	}

	
	
	
	//Saving challenger Monthly Logs

	
	public boolean saveMonthlyLogs( ChallengerMonthlyLogs record)
	
	{
		
		System.out.println(record.toString());
		this.monthlyLogs.save(record);
		
		
		return true;
         
	}

	
	
	
	
	//Fetching challenger Monthly logs
	

		
		public List<ChallengerMonthlyLogs> getMonthlyLogs(){
			
			
			return (List<ChallengerMonthlyLogs>)this.monthlyLogs.findAll();
					
			
			}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
