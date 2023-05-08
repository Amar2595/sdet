package practice;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class com_freekamaal {
@Test
public void freekamaal(){

		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver1.exe");
		 WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://freekaamaal.com/");
	    driver.findElement(By.linkText("Login/Signup")).click();
	    driver.findElement(By.id("login_email")).sendKeys("chn02051995@gmail.com");
	    driver.findElement(By.name("login_pass")).sendKeys("Amar251995@");
	    //mousover
	    //ro
	  //  driver.findElement(By.xpath())
	    driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
	    driver.findElement(By.xpath("//input[@value='Login']")).click();

	  
}}
