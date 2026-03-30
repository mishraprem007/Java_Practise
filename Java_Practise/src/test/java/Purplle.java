import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Purplle {
	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.purplle.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Actions act = new Actions(driver);
		// Hover on SHOP CATEGORIES
		Thread.sleep(3000);
		List<WebElement> shopsCategorie = driver.findElements(By.xpath("((//div[@class='item'])[1]/descendant::a)[1]"));

		for (WebElement categories : shopsCategorie) {
			act.moveToElement(categories).click().perform();

			// Get all sub-category / product names
			List<WebElement> products = driver.findElements(By.xpath(
					"//div[@class='menu-box']/descendant::div[@class='submenu']/descendant::a[@data-evcat='MegaMenu']"));

			// Print
			for (WebElement product : products) {

				String text = product.getText();
				System.out.println(text);
				List<WebElement> datas = driver.findElements(By.xpath(
						"//p[@class='mb-1 cursor-pointer ng-star-inserted']/descendant::a[@data-evact='Link Click']"));
				// WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
				for (WebElement data : datas) {

					
					Thread.sleep(2000);
					
					System.out.println("1"+data.getText());
				}
			}
		}

	}

}