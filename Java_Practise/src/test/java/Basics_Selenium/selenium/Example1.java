package Basics_Selenium.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");

		// Navigate to URL
		driver.navigate().to("https://www.google.com/");

		// Get title
		String title = driver.getTitle();
		System.out.println(title);

		// Get Page Source
		String pageSrc = driver.getPageSource();
		System.out.println(pageSrc);

		// Navigate Back
		driver.navigate().back();
		Thread.sleep(2000);
		// Forward
		driver.navigate().forward();

		// Refresh
		driver.navigate().refresh();

		// Maximize
		driver.manage().window().maximize();

		// Minimize
		driver.manage().window().minimize();

		// to close current tab of browser
		driver.close();

		// to close entire browser
		driver.quit();

	}
}
