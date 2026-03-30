package Basics_Selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {
	/*
	 * Launch Chrome Browser 
	 * navigate to web shop application 
	 * Click on register link
	 * Enter the details in Register page 
	 * click on register button close browser
	 */
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();

		// *Click on register link
		driver.findElement(By.linkText("Register")).click();

		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.name("FirstName")).sendKeys("TekPY");

		driver.findElement(By.id("LastName")).sendKeys("TekLast");

		driver.findElement(By.id("Email")).sendKeys("sanjayh698@gmail.com");

		driver.findElement(By.name("Password")).sendKeys("WontDisclose");

		driver.findElement(By.id("ConfirmPassword")).sendKeys("WontDisclose");

		driver.findElement(By.id("register-button")).click();
		
		driver.quit();

	}

}
