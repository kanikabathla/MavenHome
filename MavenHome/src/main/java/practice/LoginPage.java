package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public static WebDriver driver;

	By mailId = By.xpath("//input[@id='user_email']");
	By password = By.xpath("//input[@id='user_password']");
	By login = By.name("commit");
	By title= By.xpath("//h2[text( )='Featured Courses']");
	By navigationtitle =By.xpath("//h3[text( )='An Academy to learn Everything about Testing']");

	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	public WebElement getMailId() {
		return driver.findElement(mailId);
	}

	public WebElement getPassword() {
		return driver.findElement(password);

	}

	public WebElement loginPage() {
		return driver.findElement(login);
	}
	public WebElement title() {
		return driver.findElement(title);
	}
	public WebElement navigation() {
		return driver.findElement(navigationtitle);
	}
	
}
