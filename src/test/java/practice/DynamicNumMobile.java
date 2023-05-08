package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicNumMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Productname = "Mobile";
		String NumberOfProduct =" ";
		 System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver1.exe");
		 WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		Actions a = new Actions(driver);
		a.moveByOffset(1008, 45).click().perform();
	   driver.findElement(By.name("q")).sendKeys(""+Productname+"");
		a.sendKeys(Keys.ENTER).perform();
		String element = driver.findElement(By.xpath("//span[text()='Mobile']/ancestor::div[@class='W_R1IA']/descendant::span[@class='_10Ermr']")).getText();
		System.out.println(element);
		NumberOfProduct = NumberOfProduct+ element;
		System.out.println(NumberOfProduct);
	}

}
