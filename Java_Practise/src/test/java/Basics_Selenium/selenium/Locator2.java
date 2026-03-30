package Basics_Selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator2 {
//cssSelector
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".search-box-text.ui-autocomplete-input")).sendKeys("Computers");

		//question about multiple class	
		//  input[class='button-1 search-box-button']   - search button
		//  input.search-box-text.ui-autocomplete-input 
		
		driver.findElement(By.cssSelector("input[class='button-1 search-box-button']")).click();
		
		//    tagName
		
		
		
		
	
	}

}
