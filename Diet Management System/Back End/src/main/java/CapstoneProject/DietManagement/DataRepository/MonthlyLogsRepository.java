package CapstoneProject.DietManagement.DataRepository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import CapstoneProject.DietManagement.Pojo.ChallengerMonthlyLogs;

public interface MonthlyLogsRepository extends CrudRepository<ChallengerMonthlyLogs,String> {

	
	
	ChallengerMonthlyLogs findByUsername(String username);
}
