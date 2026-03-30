package Basics_Selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenShadowRoot {
//Open Shadow Root
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/shadow?sublist=0");
		Thread.sleep(2000);
		// Step-1 - indentify shadow host

		SearchContext shadow_host = driver.findElement(By.xpath("//form/div[1]")).getShadowRoot();

		// Step -2 Shadow root element can't be accessed using xpath locator

		shadow_host.findElement(By.cssSelector("input[type='text']")).sendKeys("testName");

		// shadow host for password
		SearchContext shadow_host_password = driver.findElement(By.xpath("//form/div[2]")).getShadowRoot();
		// acess the root element
		shadow_host_password.findElement(By.cssSelector("input[type='text']")).sendKeys("testLastName");

	}

}
