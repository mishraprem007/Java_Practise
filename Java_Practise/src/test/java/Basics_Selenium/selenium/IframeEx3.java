package Basics_Selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEx3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///C:/Users/Premshankar%20Mishra/OneDrive/Desktop/docs/Notebook/Notes/TekPY_Selenium/html/iframeExam.html");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);

		//switch to frame by WebElement
		
		driver.switchTo().frame(driver.findElement(By.id("FR1")));
		//driver.findElement(By.id("FR1") - add of iframe not webelement
		
		driver.findElement(By.xpath("//input[@id='newsletter-email']")).sendKeys("sanjayh98027@gmail.com");
		driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']")).click();
		
		
	}

}
