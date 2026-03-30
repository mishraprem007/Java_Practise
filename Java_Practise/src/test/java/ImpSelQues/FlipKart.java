package ImpSelQues;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKart {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		Actions a = new Actions(driver);
		driver.get("https://www.flipkart.com/");

		Thread.sleep(2000);

		WebElement dest = driver.findElement(By.xpath("//div[@aria-label='Fashion']"));

		a.moveToElement(dest).perform();

		Thread.sleep(2000);

		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='jqs3Ji']/object/a"));

		for (int i = 0; i < ele.size(); i++) {

			a.moveToElement(ele.get(i)).perform();
			System.out.println("===============");
			System.out.println(ele.get(i).getText());
			System.out.println("==============");

			List<WebElement> insidess = driver.findElements(By.xpath("//div[@class='CYk0R7']/object/a"));

			for (WebElement aa : insidess) {

				System.out.println(aa.getText());
			}
		}

		// parent //div[@class='jqs3Ji']
		// child //div[@class='CYk0R7']

		driver.quit();

	}

}
