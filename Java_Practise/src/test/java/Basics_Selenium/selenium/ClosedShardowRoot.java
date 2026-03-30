package Basics_Selenium.selenium;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClosedShardowRoot {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/shadow/closed?sublist=1");
		Thread.sleep(3000);

		// in HTML code there will me mentioned shadow root closed
		// Step1 - identify the nearest element which is outside of shadow root, for ex-
		// userName nearby is Login, userName is closed shadow root element here

		// Login Attached text
		driver.findElement(By.xpath("//h1[text()='Login']")).click();

		Actions actions = new Actions(driver);

		// by pressing tab we can move to shadow root element
		actions.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		actions.sendKeys("testName").perform();

		actions.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		actions.sendKeys("testPasssword").perform();

	}

}

