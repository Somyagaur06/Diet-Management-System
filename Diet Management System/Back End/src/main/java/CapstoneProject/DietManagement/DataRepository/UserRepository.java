package CapstoneProject.DietManagement.DataRepository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import CapstoneProject.DietManagement.Pojo.User;

public interface UserRepository extends CrudRepository<User,String> {
	
	

	User findByUsername(String username);
    
	List<User> findByRole(String role);
	
	void deleteByBatchName(String role);
	
}
