package Basics_Selenium.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWaitEx {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Implicit Wait
		//implicit wait holds both findElement and findElements methods. 
		//we can declare once and can use for the entire session of WebDriver instance
		//We can also use combination of implicit and explicit wait, preference will be given to implicit wait because control goes to implicit wait first and then explicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement searchTxt = driver.findElement(By.id("small-searchterms"));

	


		driver.findElement(By.id("small-searchterms")).sendKeys("computers");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		WebElement searchPage = driver.findElement(By.xpath("//h1[text()='Search']"));
		
		
	
		driver.quit();
	}


}
