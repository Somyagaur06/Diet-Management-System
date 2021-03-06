package CapstoneProject.DietManagement.jwtTokens;

import static com.auth0.jwt.algorithms.Algorithm.HMAC512;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.auth0.jwt.JWT;
import com.fasterxml.jackson.databind.ObjectMapper;

import CapstoneProject.DietManagement.LoginAuthentication.MyUserDetails;

public class JwtAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

	@Autowired
	private SecurityConstants constant;
	
	
	private AuthenticationManager authenticationManager;
	
	
	public JwtAuthenticationFilter(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
        
        
	
}
	
	
	//Method to check credentials of user by parsing them from login request
	public Authentication attemptAuthentication(HttpServletRequest req,HttpServletResponse res) throws AuthenticationException {
		
		
		try {
			
			UserDetails creds=new ObjectMapper().readValue(req.getInputStream(),MyUserDetails.class);
			
			return authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(
							creds.getUsername(),creds.getPassword(),new ArrayList()
							)
					);
			
		} catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
			
	
	
	
	
	//On successful Authentication issue jwt token
	
	protected void successfulAuthentication( HttpServletRequest req,HttpServletResponse resp,FilterChain chain,Authentication auth ) throws IOException,ServletException{
		
		
		String token=JWT.create().withSubject(((UserDetails) auth.getPrincipal()).getUsername())
                .sign(HMAC512(constant.getSecret().getBytes()));
        resp.addHeader(constant.getHeaderString(),constant.getTokenPrefix() + token);
        
		
	}
	
			
			
		
		
		
		
		
	}
	
	
	
	
	
	
	

