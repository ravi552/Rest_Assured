package functionalTesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PostRequestAutomation {
	
	@Test
	public void postApiAutomation() {
		RestAssured.baseURI="https://reqres.in/users";
		
		String json="{\r\n" + 
				"    \"name\": \"ravi\",\r\n" + 
				"    \"job\": \"SDET\"\r\n" + 
				"}";
		
		RestAssured.given().body(json)
		.post().then()
		.log()
		.all()
		.assertThat()
		.statusCode(201);
	}
}
