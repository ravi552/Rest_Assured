package utils;

import org.json.JSONObject;

public class ParseDynamicJson {
	//to parse nested and dynamic Json
	public static void parseObject(JSONObject json,String key) {
		System.out.println(json.has(key));
		System.out.println(json.get(key));
	}
	public static void getKey(JSONObject json,String key) {
		boolean exists=json.has(key);
		if(!exists) {
			
		}else {
			parseObject(json, key);
		}
	}
	public static void main(String[] args) {
		String inputJson="{\r\n" + 
				"  \"date\": \"2020-10-23\",\r\n" + 
				"  \"name\": \"Ravi\",\r\n" + 
				"  \"taskDetails\": [\r\n" + 
				"    {\r\n" + 
				"    \"taskId\" : \"48\",\r\n" + 
				"    \"subTaskId\" : \"1\",\r\n" + 
				"    \"subTaskName\" : \"Added some issues of Join meeting page in JIRA\",\r\n" + 
				"    \"startDate\" : \"2020-10-22\",\r\n" + 
				"    \"percentage\" : \"85\",\r\n" + 
				"    \"hours\" : \"8\",\r\n" + 
				"    \"codeCommitted\" : false,\r\n" + 
				"    \"progressDetail1\" :\"Retested URL validation as new codes were pushed yesterday found out new functional and UI bugs\",\r\n" + 
				"    \"progressDetail2\" :\"Updated all the UI and functional bugs in Google Excel sheet\",\r\n" + 
				"    \"progressDetail3\" :\"Performed end-to-end testing of our application\",\r\n" + 
				"    \"comments\" : \"Performing Regression testing\"\r\n" + 
				"    }\r\n" + 
				"  ]\r\n" + 
				"}";
		JSONObject json = new JSONObject(inputJson);
		getKey(json, "name");
		
	}
}
