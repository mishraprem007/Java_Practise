package Basics_Selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_ContextClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		Actions actions = new Actions(driver);

		WebElement rightClick = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		actions.contextClick(rightClick).build().perform();

		// perform action on populated options after context click

		actions.moveToElement(driver.findElement(By.xpath("//span[text()='Copy']"))).click().perform();
	
		

	}
}
