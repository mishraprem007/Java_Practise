package Basics_Selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldEx {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=2");
		Thread.sleep(5000);
		Actions actions = new Actions(driver);

		WebElement lapCharger = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
//instead of text(), we can mention .
		WebElement lapAcces = driver.findElement(By.xpath("//div[.='Laptop Accessories']"));

		actions.clickAndHold(lapCharger).moveToElement(lapAcces).click().perform();
	}

}
