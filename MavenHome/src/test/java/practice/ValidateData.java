package practice;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ValidateData extends BaseClass {
	
	@BeforeTest
	
	public void open() throws IOException {
		driver = openBrowser();
		driver.get("http://qaclickAcademy.com");
		
	}

	@Test

	public void validation() {
		
	LoginPage page = new LoginPage(driver);
		Assert.assertEquals(page.title().getText(), "FEATURED COURSES");
		Assert.assertTrue(page.navigation().isDisplayed());
		
		
	}
	
	@AfterTest
	
	public void close() {
		driver.close();
	}
	

}
