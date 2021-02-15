package utils;

import java.util.Base64;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

import pojo.GetCredentials;

public class JavaUtils {
	
	//Username : admin
	//Password : admin123
	//admin:admin123
	
	public static GetCredentials base64Encode(final String username, final String password) {
		String cred = username +":"+password;
		try {
				cred=Base64.getEncoder().encodeToString(cred.getBytes());
				System.out.println(cred);
		} catch (Exception e) {
			// TODO: handle exception
		}
		GetCredentials loginCred= new GetCredentials();
		loginCred.setCredentials(cred);
		
		return loginCred;
	}
	public static String randomNumber() {
		Random random = new Random();
		int randomNumber = random.nextInt(1000);
		String id=Integer.toString(randomNumber);
		return id;
	}
	
	public static String randomString() {
		String randomString=RandomStringUtils.randomAlphabetic(8);
		return randomString;
	}
	
	
}
