package studentApiTest;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import apiConfigs.ApiPath;
import apiVerification.ApiVerification;
import baseTest.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAPITests extends BaseTest{

	@Test
	public void getAPITest() {
		//RestAssured.given().when().get(ApiPath.apiPath.GET_LIST_OF_POSTS).then().log().all().statusCode(200);
		test.log(LogStatus.INFO,"My test is starting..");
		Response res = RestAssured.given().when().get(ApiPath.apiPath.GET_LIST_OF_POSTS);
		ApiVerification.responseCodeValidation(res, 200);
		ApiVerification.responseTimeValidation(res);
		ApiVerification.responseKeyValidationFromArray(res, "title");
		test.log(LogStatus.INFO,"My test is ended..");
	}
	
	
	
}
