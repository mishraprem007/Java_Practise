package Basics_Selenium.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsEx {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demowebshop.tricentis.com/register");

		// get all links
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println("No of links:" + links.size());
		// Iterate over the collection of the links

		for (int i = 0; i <= links.size() - 1; i++) {
			String linkText = links.get(i).getText();
			System.out.println(linkText);
		}

		// iterate on the list of the link and printing attribute href value for them

		for (WebElement element : links) {
			String url = element.getAttribute("href");
			System.out.println(url);
		}
		
		//take the radio button
		
		List<WebElement> radioBtn=	driver.findElements(By.xpath("//input[@type='radio']"));
		//iterate
		for(WebElement element: radioBtn) {
			Thread.sleep(2000);
			element.click();
			System.out.println(element.isSelected());
		}
		driver.close();
	}
}
