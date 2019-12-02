public class PermissionError extends Exception
{
	private String msg;
	
	public PermissionError(String msg)
	{
		super(msg);
		this.msg = String.valueOf(msg);
	}
	public String getMsg(){
		return this.msg;
	}
}
