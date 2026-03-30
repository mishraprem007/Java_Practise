package Basics_Selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		// Create an object of Actions class
		Actions actions = new Actions(driver);

		// move to element
		//build() and perform() is imp to perform any method using actions class, like mouse hovering, click 
		WebElement computers = driver.findElement(By.xpath("//a[contains(text(),'Computers')]"));
		// without build().perform() nothing will happend in below testCase to hover we need to use these 2 methods
		actions.moveToElement(computers).build().perform();

		// move to element under the computers section after hovering the mouse and click(click on subsection of computers)
		WebElement desktop = driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[1]"));
		actions.moveToElement(desktop).click().build().perform();

		
	}

}
