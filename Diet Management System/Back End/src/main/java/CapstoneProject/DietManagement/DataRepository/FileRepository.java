package CapstoneProject.DietManagement.DataRepository;

import org.springframework.data.repository.CrudRepository;

import CapstoneProject.DietManagement.Pojo.fileData;


public interface FileRepository extends CrudRepository<fileData,Integer> {
	
	
fileData findByName(String name);  

fileData findBySentTo(String username);

}
