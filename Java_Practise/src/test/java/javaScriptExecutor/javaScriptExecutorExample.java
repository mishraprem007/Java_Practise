package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptExecutorExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");

		// TypCasting of javaScriptExecutor with driver instance
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// value to pass the value
		js.executeScript("document.getElementById('small-searchterms').value='mobiles';");

		// Assume if using xpath we can't click but it's working on DOM while inspecting element
		
		WebElement searchBtn = driver.findElement(By.xpath("//input[@type='submit']"));
//arguments[0].click()- 0 args of searchBtn and click it
		js.executeScript("arguments[0].click();", searchBtn);
	}

}
