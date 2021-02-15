package studentApiTest;

import org.testng.annotations.Test;

import apiConfigs.ApiPath;
import apiConfigs.HeaderConfigs;
import baseTest.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import pojo.PostAPiPojo;

public class SerializationTest extends BaseTest{
	
	@Test
	public void serilizationTest() {
		HeaderConfigs header = new HeaderConfigs();
		PostAPiPojo pojo= new PostAPiPojo(40, "serTest", "Mr Ravi");
		Response response = RestAssured.given().when().headers(header.defaultHeader()).body(pojo).post(ApiPath.apiPath.CREATE_POST);
		System.out.println(response.body().asString());
		System.out.println(pojo.getAuthor());
		System.out.println(pojo.getTitle());
		System.out.println(pojo.getId());
		System.out.println(pojo.toString());
		
		
	}
}
