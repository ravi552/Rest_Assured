package studentApiTest;

import org.testng.annotations.Test;

import pojo.GetCredentials;
import utils.JavaUtils;

public class LoginTest {
	
	@Test
	public void loginTest() {
		GetCredentials loginCred=JavaUtils.base64Encode("admin", "admin123");
		System.out.println(loginCred);
	}

}
