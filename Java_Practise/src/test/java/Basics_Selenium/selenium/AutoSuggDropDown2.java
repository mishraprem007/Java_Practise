package Basics_Selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggDropDown2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);

		// flipkart search field
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("puma");

		// pause the screen from debugging inspect element to insepct the element
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[contains(text(),'puma')])[2]")).click();
		
	}

}
