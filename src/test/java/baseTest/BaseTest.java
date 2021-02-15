package baseTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import io.restassured.RestAssured;
import utils.ExtentReportListner;
import utils.FileAndEnvironment;

@Listeners(ExtentReportListner.class)
public class BaseTest extends ExtentReportListner{
	

	@BeforeClass
	public void baseTest() {
		RestAssured.baseURI=FileAndEnvironment.envAndFile().get("ServerUrl");
		
	}
}
