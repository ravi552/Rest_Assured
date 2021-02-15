package apiConfigs;

import java.util.HashMap;
import java.util.Map;

public class HeaderConfigs {
	
	public Map<String, String> defaultHeader(){
		Map<String, String> defaultHeaders= new HashMap<String, String>();
		defaultHeaders.put("Content-Type", "application/json");
		return defaultHeaders;
	}
	
	public Map<String, String> headersWithToken(){
		Map<String, String> defaultHeaders= new HashMap<String, String>();
		defaultHeaders.put("Content-Type", "application/json");
		defaultHeaders.put("Access_token","asghdgahdgjadvzxXb");
		defaultHeaders.put("jwt_token","asghdgahdgjadvzxXb");
		defaultHeaders.put("Tenet_user","test");
		
		return defaultHeaders;
	}
	
	
}