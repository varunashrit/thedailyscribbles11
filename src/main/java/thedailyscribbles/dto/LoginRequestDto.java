package thedailyscribbles.dto;

/**
 * A data transfer object class that is used to store information about a login request.
 * 
 * @author Puthin Kumar
 */

public class LoginRequestDto {
	
	private String userName;
	private String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
