package Basics_Selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

//		driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(By.xpath("//input[@type='submit']")))
//				.sendKeys("mobiles");

//	driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(By.id("small-searchterms"))).click();	

//	driver.findElement(RelativeLocator.with(By.name("pollanswers-1")).above(By.id("pollanswers-2"))).click();

//	driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.id("pollanswers-1"))).click();

		// click on register link near () locator

		driver.findElement(RelativeLocator.with(By.tagName("a")).near(By.linkText("Log in"))).click();

	}

}
