package CapstoneProject.DietManagement.DataRepository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import CapstoneProject.DietManagement.Pojo.challengerDailyLogs;

public interface DailyLogsRepository extends CrudRepository<challengerDailyLogs,String> {
	
	
	
	challengerDailyLogs findByUsername(String username);

}
