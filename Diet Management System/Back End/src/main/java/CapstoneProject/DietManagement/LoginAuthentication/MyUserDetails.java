package CapstoneProject.DietManagement.LoginAuthentication;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import CapstoneProject.DietManagement.Pojo.User;

public class MyUserDetails implements UserDetails {
	
	@Autowired
	private User user;
	
	private String username;
	
	private String password;
	
	private String role;
	                    
	public MyUserDetails(User user) {
this.username=user.getUsername();
    	
    	this.password=user.getPassword();
    	
    	this.role=user.getRole();
	                    	
	                    }
	
	                    
	
    public MyUserDetails() {
	                   	
    	
	                    }
	
    
	
	
	
	
	
	
	
	
	

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		return Arrays.asList(new SimpleGrantedAuthority(this.role));
	}

	@Override
	public String getPassword() {
		
		return this.password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.username;
	}

	@Override
	public boolean isAccountNonExpired() {
		
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
