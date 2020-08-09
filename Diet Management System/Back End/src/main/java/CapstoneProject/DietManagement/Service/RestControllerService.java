package CapstoneProject.DietManagement.Service;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import CapstoneProject.DietManagement.DataRepository.BatchRepository;
import CapstoneProject.DietManagement.DataRepository.ChallengerRegistrationRepository;
import CapstoneProject.DietManagement.DataRepository.DailyLogsRepository;
import CapstoneProject.DietManagement.DataRepository.FileRepository;
import CapstoneProject.DietManagement.DataRepository.MessagesRepository;
import CapstoneProject.DietManagement.DataRepository.MonthlyLogsRepository;
import CapstoneProject.DietManagement.DataRepository.UserRepository;
import CapstoneProject.DietManagement.Pojo.BatchDetails;
import CapstoneProject.DietManagement.Pojo.ChallengerRegistration;
import CapstoneProject.DietManagement.Pojo.User;
import CapstoneProject.DietManagement.Pojo.fileData;

@Service
@Transactional
public class RestControllerService {
	
	
	
	@Autowired
	ChallengerRegistrationRepository challengerRegistrationRepository;
	
	@Autowired
	UserRepository userRepository;
	
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	
	@Autowired
	private MailService mailService;
	
	
	@Autowired
	private BatchRepository batchRepository;
	
	@Autowired
	private FileRepository fileRepository;
	
	@Autowired
	private MonthlyLogsRepository monthlyRepository;
	
	
	@Autowired
	private DailyLogsRepository dailyRepository;
	
	@Autowired
	private MessagesRepository messageRepository;
	
	
	private fileData file;;
	
	private String username;
	
	
	
	//Save registration data for challenger
	
	public boolean challengerRegistration(ChallengerRegistration userData)
	{
		
		
		
		this.challengerRegistrationRepository.save(userData);
		return true;
	}
	
	
	//Fetching user role
	
	public User getUserRole( String username)
	{
		
		
		User user= this.userRepository.findByUsername(username);
		return user;
	
	}
	
	
	//Delete User
	public boolean deleteUser( User user) {
		
		this.userRepository.delete(user);
		
		return true;
	}
	
	
	//Modifying User
	public boolean modifyUser( User user)
	{
		
		System.out.println(user.toString());
		if(user.getUserStatus().equals("notActive"))
			user.setUserStatus("active");
		
		this.userRepository.save(user);
		
		
		
		
		
		
		return true;
	}
	
	
	
	
	
	public Boolean forgotPassword( User user) {
		
		User u=this.userRepository.findByUsername(user.getUsername());
		
		
		
		if(u.getUsername().equals(user.getUsername()) && u.getMobile().equals(user.getMobile()))
		{	
		
		this.mailService.forgotPassword(u);
		
		return true;
		
		
		}
		else
			
			return false;
	}
	
	
	
	//Upload File
	
	public boolean fileUpload( MultipartFile file) throws IOException {
		
fileData data=new fileData(file.getOriginalFilename(),file.getContentType(),file.getBytes(),null);
		
		this.fileRepository.save(data);
		
		this.file=this.fileRepository.findByName(file.getOriginalFilename());
		
		
		
		return true;
		
		
		
		
	}
	

	
	
	
	
	
	
	//Download File
	
public ResponseEntity<ByteArrayResource>  downloadFiles(  String fileName,HttpServletResponse response){
		
		fileData file=this.fileRepository.findByName(fileName);
		
		
		
		
		return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(file.getType()))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getName() + "\"")
                .body(new ByteArrayResource(file.getFile()));
	}
	





public boolean saveUser(String username)
{
	
	System.out.println(this.file.toString());
	this.file.setSentTo(username);
	this.fileRepository.save(this.file);
	
	return true;
	
}


//Checking files for particular user

public boolean checkUser(User user) {
	
	fileData data=this.fileRepository.findByName(file.getName());
	
	if(user.getUsername().equals(data.getSentTo()) || user.getBatchGroup().equals(data.getSentTo()) || user.getBatchName().equals(data.getSentTo()))
		
	
return true;
	else
		
  return false;
}




//Adding new Batch

public boolean addBatch(BatchDetails batch) {
	
	
	BatchDetails data=this.batchRepository.findByBatchStatus("Ongoing");

	if(data!=null)
	{
	data.setBatchStatus("Ended");
	List<User> u=this.userRepository.findByRole("motivator");
     for(User result:u) {
		
		if(result.getBatchMonth().equals(data.getBatchName()))
			
		{	result.setBatchStatus("Ended");
		result.setUserStatus("notActive");
		
		}
	}
	
	
	}
	
	
	List<User> user=this.userRepository.findByRole("challenger");
	
	
	for(User u:user)
	{
		u.setBatchStatus("Ended");
		u.setUserStatus("notActive");
	}
	
	
	
	this.monthlyRepository.deleteAll();
	this.dailyRepository.deleteAll();
	this.messageRepository.deleteAll();
	
	
	this.batchRepository.save(batch);
	
	
	return true;
}













public BatchDetails getBatch() {
	
	return this.batchRepository.findByBatchStatus("Ongoing");
}





}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


