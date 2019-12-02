public class FoundError extends Exception{
	private String msg;
	public FoundError(String msg)
	{
		super(msg);
		this.msg = String.valueOf(msg);
	}
}
