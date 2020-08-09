package CapstoneProject.DietManagement.DataRepository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import CapstoneProject.DietManagement.Pojo.Messages;

public interface MessagesRepository extends CrudRepository<Messages,Integer> {

	
	List<Messages> findBysentTo(String username);
}
