package Basics_Selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEx2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"file:///C:/Users/Premshankar%20Mishra/OneDrive/Desktop/docs/Notebook/Notes/TekPY_Selenium/html/iframeExam.html");
//switch to frame by  name
		driver.switchTo().frame("frame1");

		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(3000);
		// comeback to Parent page
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Google")).click();
	}

}
