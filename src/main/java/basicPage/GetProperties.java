package basicPage;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class GetProperties {

	private static Properties PROPERTIES = null;

	static {
		PROPERTIES = new Properties();
		URL props = ClassLoader.getSystemResource("config.properties");
		try {
			PROPERTIES.load(props.openStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getProperty(String key) {
		return PROPERTIES.getProperty(key);
	}
}
