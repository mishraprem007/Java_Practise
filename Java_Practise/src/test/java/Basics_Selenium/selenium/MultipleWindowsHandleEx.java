package Basics_Selenium.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsHandleEx {

	// When clicking on some link and it opens in different tab/window the control
	// of driver doesn't switch automatically
	// 1. Identify parent window
	// 2. execute the functionality which will opens child window
	// 3. perform actions on child window
	// 4. identify all the windows opened
	// 5. switch back to parent window

	/*
	 * tasK: 1. Open Demo web shop webPage 2. click on facebook link on the homepage
	 * 3. Enter email in the email id text field on facebook page - close the
	 * facebook window 4. Enter mobiles in the searchtext field on demo web shop
	 * page and click on search button 5. close browser
	 */

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);

		// Identify parent window
		String parentWindow = driver.getWindowHandle();

		driver.findElement(By.linkText("Facebook")).click();
		Thread.sleep(2000);

		// Identify all the windows
		Set<String> childWindows = driver.getWindowHandles();

		for (String window : childWindows) {
			driver.switchTo().window(window);
			if (driver.getTitle().contains("Facebook")) {
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("test123@gmail.com");
				Thread.sleep(2000);

				driver.close();
			}
		}
//switch back to parent window
		driver.switchTo().window(parentWindow);
		Thread.sleep(2000);
		driver.findElement(By.id("small-searchterms")).sendKeys("Mobiles");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);

		driver.close();
	}

}
