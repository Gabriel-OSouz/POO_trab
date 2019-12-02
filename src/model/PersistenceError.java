public class PersistenceError extends Exception{
	private String msg;
	public PersistenceError(String msg)
	{
		super(msg);
		this.msg = String.valueOf(msg);
	}
	public String getMsg(){
		return this.msg;
	}
}
