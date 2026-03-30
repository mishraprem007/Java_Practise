package Basics_Selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=2");
		// https://codepen.io/EpsilonDeltaCriterion/full/jLoPgE
		Thread.sleep(2000);

		Actions actions = new Actions(driver);

		// Source WebElement
		WebElement source = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));

		// Target WebElement
		WebElement target = driver.findElement(By.xpath("//div[@class='drop-column  min-h-[200px] bg-slate-100']"));

		actions.dragAndDrop(source, target).build().perform();

	}
}
