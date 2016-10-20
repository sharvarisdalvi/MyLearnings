package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyMethod {
	
	public static   String getPropertyFrom(String propertyName) throws IOException
	{
		Properties prop= new Properties();
		FileInputStream fs= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Utils\\UserDetails.properties");
		prop.load(fs);
	
	 return prop.getProperty(propertyName);
		
	}

}
