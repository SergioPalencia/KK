package Udemy.SDET.KK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.es");
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.id("username")).sendKeys("XXX");
		driver.findElement(By.name("pw")).sendKeys("YYY");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		
		driver.close();		
    }
}
