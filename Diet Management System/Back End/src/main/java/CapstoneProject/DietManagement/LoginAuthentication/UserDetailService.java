package CapstoneProject.DietManagement.LoginAuthentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import CapstoneProject.DietManagement.DataRepository.UserRepository;
import CapstoneProject.DietManagement.Pojo.User;


@Service
public class UserDetailService implements UserDetailsService{

	@Autowired
	UserRepository userRepository;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user=userRepository.findByUsername(username);
		
		MyUserDetails details=new MyUserDetails(user);
		
		if(user!=null)
		{
			return details;
		}
		
		else
		{
			
			throw new UsernameNotFoundException("User not found");
			
		}
	}
	
	
	

}
