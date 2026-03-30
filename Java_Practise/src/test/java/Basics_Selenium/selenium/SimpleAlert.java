package Basics_Selenium.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Steps to handle the alerts:
 * 1. Identify the alerts
 * 2. Switch to the alerts
 * 3. handle the alerts
 */
public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);

		// click on search button without entering text in the search text field
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		// Handle the alerts
		Alert ale = driver.switchTo().alert();
		ale.accept();
		System.out.println("Alert was handled sucessfully");

		driver.findElement(By.id("small-searchterms")).sendKeys("Alert was handled with dismiss method");
	}

}
