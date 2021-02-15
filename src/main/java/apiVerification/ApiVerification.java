package apiVerification;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import io.restassured.response.Response;
import utils.ExtentReportListner;

public class ApiVerification extends ExtentReportListner {
	
	public static void responseCodeValidation(Response response, int statusCOde) {
		try {
			Assert.assertEquals(statusCOde, response.getStatusCode());
			test.log(LogStatus.PASS, "Successfully validated ststus code and status code is :"+response.getStatusCode());
		}catch (AssertionError e) {
			test.log(LogStatus.FAIL, e.fillInStackTrace());
			test.log(LogStatus.FAIL, "Expected status code is "+statusCOde+"instead of getting "+response.getStatusCode());
		}catch (Exception e) {
			test.log(LogStatus.FAIL, e.fillInStackTrace());
		}
	}
	
	public static void responseKeyValidationFromArray(Response res, String key) {
		try {
			JSONArray array= new JSONArray(res.getBody().asString());
			for(int i=0;i<array.length();i++) {
				
				//System.out.println(array.get(i));
				JSONObject obj = array.getJSONObject(i);
				test.log(LogStatus.PASS, "validated value is :"+obj.get(key));
				//System.out.println(obj.get("author"));
				
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, e.fillInStackTrace());
		}
	}
	
	public static void responseKeyValidationFromJsonObject(Response response, String key) {
		try {
			JSONObject json = new JSONObject(response.getBody().asString());
			if(json.has(key) && json.get(key) !=null) {
				test.log(LogStatus.PASS, "successfully validated the value of ::" +key+ " it is :: "+json.get(key));
			}else {
				test.log(LogStatus.FAIL, "key not available");
			}
		} catch (Exception e) {
			test.log(LogStatus.FAIL, e.fillInStackTrace());
		}
	}
	
	public static void responseTimeValidation(Response res) {
		try {
			long time= res.time();test.log(LogStatus.INFO, "Api response time is ::"+time);
		} catch (Exception e) {
			test.log(LogStatus.FAIL, e.fillInStackTrace());
		}
	}
	
}
