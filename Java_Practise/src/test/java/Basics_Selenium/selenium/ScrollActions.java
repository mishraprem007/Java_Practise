package Basics_Selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollActions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();

		Actions actions = new Actions(driver);
		// first arg is for horizontal scroll another is for vertical, both can't be
		// used at a time, any one has to be zero
		actions.scrollByAmount(0, 500).perform();
		
		//scroll till specific element
		WebElement myAccount = driver.findElement(By.linkText("My account"));
		actions.scrollToElement(myAccount).perform();
		
	}

}
