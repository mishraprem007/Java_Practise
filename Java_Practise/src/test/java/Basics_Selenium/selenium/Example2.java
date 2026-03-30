package Basics_Selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();

		// Enter the text in search text field

		// name locator
		// WebElement searchfield = driver.findElement(By.name("q"));
		// searchfield.sendKeys("mobile");

		// id locator
		// driver.findElement(By.id("small-searchterms")).sendKeys("Mobiles");

		// linkText
//		driver.findElement(By.linkText("Register")).click();

//		driver.findElement(By.linkText("Log in")).click();

		// Partial linkText
//		driver.findElement(By.partialLinkText("Shopping")).click();

		// Using id
//		driver.findElement(By.id("newsletter-email")).sendKeys("test123@gmail.com");

		// using class
		driver.findElement(By.className("search-box-text.ui-autocomplete-input")).sendKeys("mobiles");

	}

}
