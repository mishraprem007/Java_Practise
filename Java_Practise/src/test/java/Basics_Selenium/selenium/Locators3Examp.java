package Basics_Selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3Examp {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		// driver.findElement(By.xpath("//a[@class='ico-register']")).click();

		// driver.findElement(By.xpath("//input[@id='pollanswers-1']")).click();

		// driver.findElement(By.xpath("//input[@id='vote-poll-1']")).click();

		// driver.findElement(By.xpath("//a[text()='Register']")).click();

		// driver.findElement(By.xpath("//a[text()='Log in']")).click();

		// driver.findElement(By.xpath("(//a[contains(text(), 'Books')])[1]")).click();

		// driver.findElement(By.xpath("//input[contains(@id,'search')]")).sendKeys("computers");

		// driver.findElement(By.xpath("(//input[contains(@class,button)])[1]")).click();

		// driver.findElement(By.xpath("(//a[starts-with(text(),'Electro')])[1]")).click();

		// driver.findElement(By.xpath("//input[starts-with(@name,'News')]")).sendKeys("test");
		// driver.findElement(By.xpath("//input[starts-with(@value,'Subscr')]")).click();
	//
	
	
	}

}
