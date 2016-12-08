package basicPage;

public interface Variables {
	
	public static final String URL = GetProperties.getProperty("Url").trim();
	public static final String login = GetProperties.getProperty("login").trim();
	public static final String password= GetProperties.getProperty("password").trim();

}
