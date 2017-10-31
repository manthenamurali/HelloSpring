package springdemo.models.response.login;

import springdemo.models.response.BaseResponse;

public class LoginResponse {
	
	private String userName;
	private BaseResponse result;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public BaseResponse getResult() {
		return result;
	}
	public void setResult(BaseResponse result) {
		this.result = result;
	}
}
