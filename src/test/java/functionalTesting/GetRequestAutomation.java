package functionalTesting;

import org.testng.annotations.Test;

import com.aventstack.extentreports.gherkin.model.When;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.response.Response;

public class GetRequestAutomation {
	
	@Test
	public void getRequestAutomation() {
		RestAssured.baseURI="https://reqres.in/api/users";
		Response res = RestAssured.given().param("page", "2").when().get();
		System.out.println(res.getBody().asString());
		System.out.println("getStatusCode :"+res.getStatusCode());
		System.out.println("content-type :"+res.contentType());
		System.out.println("Time :"+res.getTime());
		System.out.println("cookies :"+res.getCookies());
		System.out.println(res.prettyPrint());
		
//		RestAssured.given().param("page", "2")
//		.when()
//		.get()
//		.then()
//		.assertThat()
//		.log().all()
//		.statusCode(200);
	}

}
