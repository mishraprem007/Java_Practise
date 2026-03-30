package ImpSelQues;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//span[text()='Fashion']")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='jqs3Ji']/object/a")));

		List<WebElement> fashion = driver.findElements(By.xpath("//div[@class='jqs3Ji']/object/a"));
		Actions actions = new Actions(driver);
		for (int i = 0; i < fashion.size(); i++) {
			actions.moveToElement(fashion.get(i)).build().perform();
			System.out.println(fashion.get(i).getText());
			System.out.println("Below are the producs name: ");
			List<WebElement> prodsCatlog = driver.findElements(By.xpath("//div[@class='CYk0R7']/object/a"));
			for (WebElement prod : prodsCatlog) {
				System.out.println(prod.getText());
			}

		}
		driver.close();
	}

}
