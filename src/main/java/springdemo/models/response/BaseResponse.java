package springdemo.models.response;

/**
 * common response in every REST call
 * 
 * @author mmantena
 */
public class BaseResponse {

	private boolean status;
	private String message;
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
