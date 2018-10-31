package practice;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomePage extends BaseClass {

	@BeforeTest

	public void open() throws IOException {
		driver = openBrowser();
		driver.get("http://qaclickAcademy.com");

	}

	@Test

	public void login() throws IOException {
		driver = openBrowser();
		driver.get("http://qaclickAcademy.com");
		PageObject object = new PageObject(driver);
		object.getLogin().click();
	}

	@Test(dataProvider = "getData")

	public void username(String username, String password) throws IOException {
		LoginPage page = new LoginPage(driver);
		page.getMailId().sendKeys(username);
		page.getPassword().sendKeys(password);
		page.loginPage().click();
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[1][2];
		data[0][0] = "kanikabathla@gmail.com";
		data[0][1] = "bathla123";
		return data;
	}

	@AfterTest
	public void close() {
		driver.close();
		driver=null;
	}

}
