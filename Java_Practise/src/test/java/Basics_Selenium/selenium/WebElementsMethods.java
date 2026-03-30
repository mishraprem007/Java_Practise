package Basics_Selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

//		  driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
//		  Thread.sleep(2000); driver.findElement(By.id("small-searchterms")).clear();
//		  driver.findElement(By.xpath("//input[@type='submit']")).submit();

		// Getters
		String text = driver.findElement(By.linkText("Register")).getText();
		System.out.println(text);

//		driver.findElement(By.id("small-searchterms")).sendKeys("Books");

//		driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();

		// get the text from search page
//		String searchPage = driver.findElement(By.xpath("//h1[text()='Search']")).getText();
//		System.out.println("The text is displayed: " + searchPage);

		// getAttribute - returns the value of the passed attribute

//		String subscribe_val = driver.findElement(By.id("newsletter-subscribe-button")).getAttribute("value");

		// value is the attribute name
//		System.out.println(subscribe_val);
//		String atrVal = driver.findElement(By.id("small-searchterms")).getAttribute("class");
//		System.out.println(atrVal);

		// get css Value for
//		String cssColor = driver.findElement(By.linkText("Register")).getCssValue("color");
//		System.out.println(cssColor); // rgba(175, 3, 4, 1)

//		String fontFamily_css = driver.findElement(By.linkText("Register")).getCssValue("font-family");
//		System.out.println(fontFamily_css);
		
		
		// verification methods
		
//		if(driver.findElement(By.id("small-searchterms")).isDisplayed()){
//			driver.findElement(By.id("small-searchterms")).sendKeys("Books");
//		}
//		
//		//check if search button is enabled and then click
		
//		if(driver.findElement(By.xpath("(//input[@type='submit'])[1]")).isEnabled()) {
//			driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		
		//Check if radio button excellent is enabled or not
		
		driver.findElement(By.id("pollanswers-1")).click();
		if(driver.findElement(By.id("pollanswers-1")).isSelected()) {
			System.out.println("The excellent radio button was selected sucessfully");
		
		}

	}

}
