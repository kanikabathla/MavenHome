package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {
	public static WebDriver driver;
	public Properties prop;

	public WebDriver openBrowser() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Kanika\\MavenHome\\target\\file.properties");
		prop.load(fis);
		String browsername = prop.getProperty("browser");
		System.out.println(browsername);
		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\jars\\others\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browsername.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browsername.equals("IE")) {
			driver = new InternetExplorerDriver();

		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	/*public void Screenshot() {
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.
	}
	*/

	


}
