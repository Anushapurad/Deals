package TestScript;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class DealsdryUI extends General{
	@Test
	public void deal() throws IOException
	{

		driver.findElement(By.linkText("https://www.getcalley.com/")).click();		
		Dimension d=new Dimension(1920,1080);
		driver.manage().window().setSize(d);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screen=ts.getScreenshotAs(OutputType.FILE);
		File fs=new File("C:\\Users\\anupu\\Pictures\\Screenshots\\dealsUI.jpg");
		FileHandler.copy(screen, fs);
		
		Dimension d1=new Dimension(1366,768);
		driver.manage().window().setSize(d1);
		TakesScreenshot ts1=(TakesScreenshot)driver;
		File screen1=ts.getScreenshotAs(OutputType.FILE);
		File fs1=new File("C:\\Users\\anupu\\Pictures\\Screenshots\\dealsUIa.jpg");
		FileHandler.copy(screen1, fs1);
		
		Dimension d2=new Dimension(1536,864);
		driver.manage().window().setSize(d2);
		TakesScreenshot ts2=(TakesScreenshot)driver;
		File screen2=ts.getScreenshotAs(OutputType.FILE);
		File fs2=new File("C:\\Users\\anupu\\Pictures\\Screenshots\\dealsUIb.jpg");
		FileHandler.copy(screen2, fs2);	
	}
	@Test
	public void second() throws IOException
	{
		driver.findElement(By.linkText("https://www.getcalley.com/calley-lifetime-offer/")).click();		
		Dimension d=new Dimension(1920,1080);
		driver.manage().window().setSize(d);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screen=ts.getScreenshotAs(OutputType.FILE);
		File fs=new File("C:\\Users\\anupu\\Pictures\\Screenshots\\dealsUIc.jpg");
		FileHandler.copy(screen, fs);
		
		Dimension d1=new Dimension(1366,768);
		driver.manage().window().setSize(d1);
		TakesScreenshot ts1=(TakesScreenshot)driver;
		File screen1=ts.getScreenshotAs(OutputType.FILE);
		File fs1=new File("C:\\Users\\anupu\\Pictures\\Screenshots\\dealsUId.jpg");
		FileHandler.copy(screen1, fs1);
		
		Dimension d2=new Dimension(1536,864);
		driver.manage().window().setSize(d2);
		TakesScreenshot ts2=(TakesScreenshot)driver;
		File screen2=ts.getScreenshotAs(OutputType.FILE);
		File fs2=new File("C:\\Users\\anupu\\Pictures\\Screenshots\\dealsUIe.jpg");
		FileHandler.copy(screen2, fs2);	
	}
	@Test
	public void third() throws IOException
	{
		driver.findElement(By.linkText("https://www.getcalley.com/see-a-demo/")).click();		
		Dimension d=new Dimension(1920,1080);
		driver.manage().window().setSize(d);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screen=ts.getScreenshotAs(OutputType.FILE);
		File fs=new File("C:\\Users\\anupu\\Pictures\\Screenshots\\dealsUIf.jpg");
		FileHandler.copy(screen, fs);
		
		Dimension d1=new Dimension(1366,768);
		driver.manage().window().setSize(d1);
		TakesScreenshot ts1=(TakesScreenshot)driver;
		File screen1=ts.getScreenshotAs(OutputType.FILE);
		File fs1=new File("C:\\Users\\anupu\\Pictures\\Screenshots\\dealsUIg.jpg");
		FileHandler.copy(screen1, fs1);
		
		Dimension d2=new Dimension(1536,864);
		driver.manage().window().setSize(d2);
		TakesScreenshot ts2=(TakesScreenshot)driver;
		File screen2=ts.getScreenshotAs(OutputType.FILE);
		File fs2=new File("C:\\Users\\anupu\\Pictures\\Screenshots\\dealsUIh.jpg");
		FileHandler.copy(screen2, fs2);	
	}
	@Test
	public void forth() throws IOException
	{
		driver.findElement(By.linkText("https://www.getcalley.com/calley-teams-features/")).click();		
		Dimension d=new Dimension(1920,1080);
		driver.manage().window().setSize(d);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screen=ts.getScreenshotAs(OutputType.FILE);
		File fs=new File("C:\\Users\\anupu\\Pictures\\Screenshots\\dealsUIi.jpg");
		FileHandler.copy(screen, fs);
		
		Dimension d1=new Dimension(1366,768);
		driver.manage().window().setSize(d1);
		TakesScreenshot ts1=(TakesScreenshot)driver;
		File screen1=ts.getScreenshotAs(OutputType.FILE);
		File fs1=new File("C:\\Users\\anupu\\Pictures\\Screenshots\\dealsUIj.jpg");
		FileHandler.copy(screen1, fs1);
		
		Dimension d2=new Dimension(1536,864);
		driver.manage().window().setSize(d2);
		TakesScreenshot ts2=(TakesScreenshot)driver;
		File screen2=ts.getScreenshotAs(OutputType.FILE);
		File fs2=new File("C:\\Users\\anupu\\Pictures\\Screenshots\\dealsUIk.jpg");
		FileHandler.copy(screen2, fs2);	
	}
	@Test
	public void five() throws IOException
	{
		driver.findElement(By.linkText("https://www.getcalley.com/calley-pro-features/")).click();		
		Dimension d=new Dimension(1920,1080);
		driver.manage().window().setSize(d);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screen=ts.getScreenshotAs(OutputType.FILE);
		File fs=new File("C:\\Users\\anupu\\Pictures\\Screenshots\\dealsUIl.jpg");
		FileHandler.copy(screen, fs);
		
		Dimension d1=new Dimension(1366,768);
		driver.manage().window().setSize(d1);
		TakesScreenshot ts1=(TakesScreenshot)driver;
		File screen1=ts.getScreenshotAs(OutputType.FILE);
		File fs1=new File("C:\\Users\\anupu\\Pictures\\Screenshots\\dealsUIm.jpg");
		FileHandler.copy(screen1, fs1);
		
		Dimension d2=new Dimension(1536,864);
		driver.manage().window().setSize(d2);
		TakesScreenshot ts2=(TakesScreenshot)driver;
		File screen2=ts.getScreenshotAs(OutputType.FILE);
		File fs2=new File("C:\\Users\\anupu\\Pictures\\Screenshots\\dealsUIn.jpg");
		FileHandler.copy(screen2, fs2);	
	}


}
