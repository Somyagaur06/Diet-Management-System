package CapstoneProject.DietManagement.DataRepository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import CapstoneProject.DietManagement.Pojo.ChallengerRegistration;

public interface ChallengerRegistrationRepository extends CrudRepository<ChallengerRegistration,String> {

	List<ChallengerRegistration> findByStatus(String status);
	
	ChallengerRegistration findByUsername(String username);
	
	
}
