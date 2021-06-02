package kodlamaio.hrms.core.utilities.results;

public class Result {
	private boolean success;
	private String message;
	
	//Bool type constructor
	public Result(boolean success) {
		this.success = success;
	}

	//All Args Constructor
	public Result(boolean success, String message) {
		this(success);
		
		this.message = message;
	}


	public boolean isSuccess() {
		return this.success;
	}
	
	public String getMessage() {
		return this.message;
	}
}