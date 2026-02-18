package testCase;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObejctModel.GeneratorDetailsPagePom;
import pageObejctModel.GeneratorPagePom;
import pageObejctModel.LoginPagePom;
import pageObejctModel.RouteAssingmentPage;
import testBase.TestBase;

public class TestCase001 extends TestBase
{
	@Test
	public void test()
	{
		//Login
		LoginPagePom lp = new LoginPagePom(driver);
		lp.loginAction("henry@test.com", "Nayan123!@");
		System.out.println("======Login Done======");
		
		//generator
		GeneratorPagePom gpp=new GeneratorPagePom(driver);
		gpp.addGenerator("Moon2", "890890890890");
		WebDriverWait ew = new WebDriverWait(driver, Duration.ofSeconds(30));
		ew.until(ExpectedConditions.elementToBeClickable(gpp.submitBt()));
		System.out.println("============generator clicked===============");
		
		//generator Details
		GeneratorDetailsPagePom gdpp=new GeneratorDetailsPagePom(driver);
		gdpp.selectIndustry();
		gdpp.enterAddressDetails("south kolkata", "kolkata", "700020","raj122@gmail.com", "9808907678");
		gdpp.setLocation("24.3", "98.0");
		gdpp.setOfficeHours();
		System.out.println("=========Generators details Filled==========");
		
		//Route Assingment
		RouteAssingmentPage rap=new RouteAssingmentPage(driver);
		rap.assignRoute();
	}
}
