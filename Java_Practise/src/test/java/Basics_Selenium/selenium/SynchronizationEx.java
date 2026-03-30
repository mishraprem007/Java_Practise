package Basics_Selenium.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationEx {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		// Thread.sleep(2000);
		WebElement searchTxt = driver.findElement(By.id("small-searchterms"));

		// max wait is 15 sec, if operation is done before 15 secs it will not wait till
		// 15 secs
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(searchTxt));

		driver.findElement(By.id("small-searchterms")).sendKeys("computers");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement searchPage = driver.findElement(By.xpath("//h1[text()='Search']"));
		wait.until(ExpectedConditions.visibilityOf(searchPage));

		// Thread.sleep(2000);
		driver.quit();
	}

}
