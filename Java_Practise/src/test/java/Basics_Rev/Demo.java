package Basics_Rev;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		// driver.findElement(By.xpath("//a[contains(text(),'Regi')]")).click();
		// driver.findElement(By.partialLinkText("Regi")).click();
		// driver.findElement(By.linkText("Register")).click();
		//driver.findElement(By.xpath("//a[text()='Register']")).click();
		
	//	driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
		
		

	}

}
