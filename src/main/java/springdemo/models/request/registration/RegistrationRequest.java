package springdemo.models.request.registration;

import com.google.gson.annotations.SerializedName;

public class RegistrationRequest {

	@SerializedName("userName")
	private String userName;
	
	@SerializedName("password")
	private String password;
	
	@SerializedName("firstName")
	private String firstName;
	
	@SerializedName("lastName")
	private String lastName;
	
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
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
