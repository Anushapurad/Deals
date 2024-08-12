package TestScript;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Dealsdray {
	

	@Test
	public void start() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.dealsdray.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.name("password")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.xpath("//button[.='Login']")).click();
		driver.findElement(By.xpath("//span[.='chevron_right']")).click();
		driver.findElement(By.xpath("//span[.='Orders']")).click();
		WebElement ele = driver.findElement(By.xpath("//button[.='Add Bulk Orders']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform(); ele.click();
		driver.findElement(By.id("mui-7")).sendKeys("C:\\Users\\anupu\\Downloads\\demo-data.xlsx");
		WebElement el = driver.findElement(By.xpath("//button[.='Import']"));el.click();
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(el));el.click();
		WebDriverWait wait1=new WebDriverWait(driver,10);
		wait1.until(ExpectedConditions.alertIsPresent());
		Alert a=driver.switchTo().alert();a.accept();
		String text = el.getText();
		System.out.println(text);
		WebElement id = driver.findElement(By.id("mui-369"));
		Point loc = id.getLocation();
		int x=loc.getX();int y=loc.getY();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screen=ts.getScreenshotAs(OutputType.FILE);
		File fs=new File("C:\\Users\\anupu\\Pictures\\Screenshots\\dealsdry.jpg");
		FileHandler.copy(screen, fs);driver.close();			
	}

}
