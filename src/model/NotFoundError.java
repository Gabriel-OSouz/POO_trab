public class NotFoundError extends Exception{
	private String msg;
	public NotFoundError(String msg)
	{
		super(msg);
		this.msg = String.valueOf(msg);
	}
	public String getMsg(){
		return this.msg;
	}
}
