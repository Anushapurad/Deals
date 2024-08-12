package TestScript;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class General {
	public WebDriver driver;
	
	@BeforeMethod
	public void start() {
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.getcalley.com/page-sitemap.xml");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void end() throws IOException
	{
		driver.close();
	}

}
