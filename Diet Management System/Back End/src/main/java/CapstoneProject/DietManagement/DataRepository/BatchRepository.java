package CapstoneProject.DietManagement.DataRepository;

import org.springframework.data.repository.CrudRepository;

import CapstoneProject.DietManagement.Pojo.BatchDetails;

public interface BatchRepository extends CrudRepository<BatchDetails,String> {

	
	BatchDetails findByBatchStatus(String status);
}
