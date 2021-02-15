package utils;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class FileAndEnvironment {

	public static Map<String, String> fileAndEnv = new HashMap<String, String>();
	public static Properties propMain = new Properties();
	public static Properties propPreset = new Properties();
	
	public static Map<String, String> envAndFile(){
		String environment = System.getProperty("env");
		try {
			if(environment.equalsIgnoreCase("dev")) {
				FileInputStream fisDev= new FileInputStream(System.getProperty("user.dir")+"/Inputs/dev.properties");
				propMain.load(fisDev);
				fileAndEnv.put("ServerUrl", propMain.getProperty("ServerUrl"));
				fileAndEnv.put("portno", propMain.getProperty("portno"));
				fileAndEnv.put("username", propMain.getProperty("username"));
				fileAndEnv.put("password", propMain.getProperty("password"));
				
			}else if (environment.equalsIgnoreCase("qa")) {
				FileInputStream fisQA= new FileInputStream(System.getProperty("user.dir")+"/Inputs/qa.properties");
				propMain.load(fisQA);
				fileAndEnv.put("ServerUrl", propMain.getProperty("ServerUrl"));
				fileAndEnv.put("portno", propMain.getProperty("portno"));
				fileAndEnv.put("username", propMain.getProperty("username"));
				fileAndEnv.put("password", propMain.getProperty("password"));
				
			}else if (environment.equalsIgnoreCase("staging")) {
				FileInputStream fisStaging= new FileInputStream(System.getProperty("user.dir")+"/Inputs/staging.properties");
				propMain.load(fisStaging);
				fileAndEnv.put("ServerUrl", propMain.getProperty("ServerUrl"));
				fileAndEnv.put("portno", propMain.getProperty("portno"));
				fileAndEnv.put("username", propMain.getProperty("username"));
				fileAndEnv.put("password", propMain.getProperty("password"));
				
			}
		}catch(Exception e){
			
		}
		return fileAndEnv;
	}
	
	public static Map<String, String> getConfigReader(){
		if(fileAndEnv==null) {
			fileAndEnv=envAndFile();
		}
		return fileAndEnv;
	}
	
}
