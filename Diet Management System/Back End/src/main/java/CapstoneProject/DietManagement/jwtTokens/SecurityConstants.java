package CapstoneProject.DietManagement.jwtTokens;

public class SecurityConstants {

	
	public static final String SECRET = "SecretKeyToGenJWTs";
    public static final long EXPIRATION_TIME = 8; // 10 days
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/register";
    
    
    
    
    
    
    
	public static String getSecret() {
		return SECRET;
	}
	public static long getExpirationTime() {
		return EXPIRATION_TIME;
	}
	public static String getTokenPrefix() {
		return TOKEN_PREFIX;
	}
	public static String getHeaderString() {
		return HEADER_STRING;
	}
	public static String getSignUpUrl() {
		return SIGN_UP_URL;
	}
    
    
}
