package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {
	Properties prop;
	String path=".\\config.properties";
	public ReadConfig()
	{
		try {
			FileInputStream fi=new FileInputStream(path);
			 prop=new Properties();
			prop.load(fi);
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		public String browserName()
		{
			String br=prop.getProperty("browser");
			
			return br;
			
		}
		
		
	
	

}
