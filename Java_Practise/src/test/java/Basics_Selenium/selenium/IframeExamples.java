package Basics_Selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeExamples {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"file:///C:/Users/Premshankar%20Mishra/OneDrive/Desktop/docs/Notebook/Notes/TekPY_Selenium/html/iframeExam.html");

		Thread.sleep(3000);
		//switch to frame by index
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("mobiles");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		
		//comeback to mainPage (default Page)
		
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Google")).click();
		
	}

}
