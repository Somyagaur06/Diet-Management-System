package CapstoneProject.DietManagement.RestApi;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import CapstoneProject.DietManagement.DataRepository.ChallengerRegistrationRepository;
import CapstoneProject.DietManagement.DataRepository.UserRepository;
import CapstoneProject.DietManagement.Pojo.BatchDetails;
import CapstoneProject.DietManagement.Pojo.ChallengerRegistration;
import CapstoneProject.DietManagement.Pojo.User;
import CapstoneProject.DietManagement.Service.MailService;
import CapstoneProject.DietManagement.Service.RestControllerService;

@RestController
@CrossOrigin(origins="*")
public class RestController1 {

	@Autowired
	ChallengerRegistrationRepository challengerRegistrationRepository;
	
	@Autowired
	UserRepository userRepository;
	
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private RestControllerService restService;
	 
	
	@Autowired
	private MailService mailService;
	
	private MultipartFile file;
	
	//Api For Registration of Challenger;
	@PostMapping("/challengerRegistration")
	public boolean challengerRegistration(@RequestBody ChallengerRegistration userData)
	{
		
		
		this.restService.challengerRegistration(userData);

		return true;
	}
	
	
	
	
	
	
	//Api for getting User-Role
	
	@GetMapping("/getUserRole/{username}")
	public User getUserRole(@PathVariable("username") String username)
	{
		
		
		User user= this.restService.getUserRole(username);
		return user;
	
	}
	
	
	@PostMapping("/deleteUser")
	public boolean deleteUser(@RequestBody User user) {
		
		this.restService.deleteUser(user);
		
		return true;
	}
	
	
	@PostMapping("/modifyUser")
	public boolean modifyUser(@RequestBody User user)
	{
		
		this.restService.modifyUser(user);
		
		return true;
	}
	
	
	
	
	@PutMapping("/forgotPassword")
	public Boolean forgotPassword(@RequestBody User user) {
		
		boolean value=this.restService.forgotPassword(user);
		
		return value;
	
	}
	
	//Upload file
	
	@PostMapping("/uploadFile")
	public boolean fileUpload(@RequestParam("file") MultipartFile file) throws IOException {
		
		this.file=file;
		this.restService.fileUpload(file);
		
		return true;
		
	}
	
	
	//Download file
   @GetMapping("/downloadFile")
	
   public ResponseEntity<ByteArrayResource>  downloadFiles( HttpServletResponse response){
		
		return this.restService.downloadFiles( this.file.getOriginalFilename(),response);
	}
	
	
	
	
	
   
   //check for user
   
   @PostMapping("/checkUser")
   
  public boolean checkUser(@RequestBody User user )
  {
	   
	   
	 boolean result=  this.restService.checkUser(user);
	   
	   
	   
	   return result;
  }
	
	
   
   
   
   @GetMapping("/saveUser/{sentTo}")
   
   public boolean saveUser(@PathVariable("sentTo") String sentTo )
   {
 	   
	   System.out.println(sentTo);
 	   
 	   
 	   this.restService.saveUser(sentTo);
 	   
 	   
 	   return true;
   }
 	
   
   @PostMapping("/addBatch")
   public boolean addBatch(@RequestBody BatchDetails batch)
   {
	   
	   
	   boolean result=this.restService.addBatch(batch);
	   
	   return result;
   }
	
   
   @GetMapping("/getBatch")
   public BatchDetails getDetails() {
	   
	   return this.restService.getBatch();
   }
	
	
	}
	


