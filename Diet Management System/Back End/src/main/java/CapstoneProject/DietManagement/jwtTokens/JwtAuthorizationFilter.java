package CapstoneProject.DietManagement.jwtTokens;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

public class JwtAuthorizationFilter extends BasicAuthenticationFilter {
	
	@Autowired
	private SecurityConstants constant;
	

	public JwtAuthorizationFilter(AuthenticationManager authenticationManager) {
		super(authenticationManager);
		
	}
	
	
	
	
	

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		String header=request.getHeader(constant.getHeaderString());
		
		
		if(header==null || !header.startsWith(constant.getTokenPrefix()))
		{
			chain.doFilter(request, response);
            return;
		}
		
		 UsernamePasswordAuthenticationToken authentication = getAuthentication(request);
		 
		 SecurityContextHolder.getContext().setAuthentication(authentication);
	        chain.doFilter(request, response);
	    }
		
		
		
	


private UsernamePasswordAuthenticationToken getAuthentication(HttpServletRequest request) {

	
	String token=request.getHeader(constant.getHeaderString());
	
	//checking if header is null or not
	if(token !=null)
	{
		
		//If header is not null  parse token
		
		String user=JWT.require(Algorithm.HMAC512(constant.getSecret().getBytes())).build().verify(token.replace(constant.getTokenPrefix(),"")).getSubject();
		
		
		if(user!=null) {
			 return new UsernamePasswordAuthenticationToken(user, null, new ArrayList());
	}
	
		return null;
	}
	
	return null;
	
	
}
	
	
	
	
	
}
