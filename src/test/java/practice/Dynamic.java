package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Dynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--disable-notification");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.sportskeeda.com/go/pro-kabaddi/points-table");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		String Team="Puneri Paltan";
		
		System.out.println(Team);
		
		WebElement Played =driver.findElement(By.xpath("//div[@class='stats-div points-table']//a[text()='"+Team+"']/ancestor::div[contains(@class,'one-table-row')]/descendant::div[@class='matches-played']"));
		
		
		System.out.println("Total matched played: " +Played.getText());

		
		WebElement won=driver.findElement(By.xpath("//div[@class='content-holder']//a[text()='"+Team+"']/ancestor::div[contains(@class,'one-table-row')]/descendant::div[@class='matches-won']"));
		
		System.out.println("Match won: " +won.getText());
			    	    	    ////div[@class='stats-div points-table']//a[text()='"+Team+"']/ancestor::div[contains(@class,'one-table-row')]/descendant::div[@class='matches-played']
		
		
		
	

}
	}


