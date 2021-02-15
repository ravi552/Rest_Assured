package studentApiTest;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import apiBuilders.PostApiBuilder;
import apiConfigs.ApiPath;
import apiConfigs.HeaderConfigs;
import apiVerification.ApiVerification;
import baseTest.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import utils.JavaUtils;

public class PostApiTest extends BaseTest {
	
	@Test
	public void validPostApiTest() {
		
		test.log(LogStatus.INFO, "My test is starting");
		HeaderConfigs header = new HeaderConfigs();
		PostApiBuilder pab = new PostApiBuilder();
		JavaUtils jutils= new JavaUtils();
				
		Response response = RestAssured.given().when().headers(header.defaultHeader()).body(pab.postRequestBody(JavaUtils.randomNumber(),JavaUtils.randomString(),JavaUtils.randomString())).when()
				.post(ApiPath.apiPath.CREATE_POST);
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		
		ApiVerification.responseKeyValidationFromJsonObject(response, "title");
		ApiVerification.responseCodeValidation(response, 201);
		ApiVerification.responseTimeValidation(response);
		test.log(LogStatus.INFO, "My test is ending");
		
	}

}
