package Basics_Selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		//double click URL
				//https://demo.guru99.com/test/simple_context_menu.html
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	Thread.sleep(2000);
	
	Actions actions = new Actions(driver);
	//double click button
	WebElement button=driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
	
	actions.doubleClick(button).build().perform();
	
	
	}

}
