package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject {
	
	public static WebDriver driver;
	By signin=By.xpath("//span[text( )='Login']");
	public PageObject(WebDriver driver) {
		this.driver=driver;
		
	}
	
	
	public WebElement getLogin() {
		return driver.findElement(signin);
	}
	

}
