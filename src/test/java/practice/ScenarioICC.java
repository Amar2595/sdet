package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScenarioICC {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver1.exe"); 
		WebDriver driver = new ChromeDriver();
		WebElement ele = driver.findElement(By.xpath("(//button[contains(text(),'Rankings')])[1]"));
		Actions a= new Actions(driver);
		a.moveToElement(ele).perform();
		
		driver.findElement(By.xpath("(//a[text()='Team Rankings'])[1]")).click();
		driver.findElement(By.linkText("(//a[@href='/rankings/mens/team-rankings'])[1]")).click();
		
	}
	
}