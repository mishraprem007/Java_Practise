package ImpSelQues;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Spotify {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://open.spotify.com/");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("mishraprem007@gmail.com");
		driver.findElement(By.xpath("//span[text()='Continue']")).click();

		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@data-testid='search-input']")).sendKeys("arijit singh");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@data-testid='search-input']")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By
				.xpath("(//p[@data-encore-id='listRowTitle']//span[contains(normalize-space(.),'Arijit Singh')])[2]")));

		driver.findElement(
				By.xpath("(//p[@data-encore-id='listRowTitle']//span[contains(normalize-space(.),'Arijit Singh')])[1]"))
				.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@role='row' and @aria-rowindex]")));
		
		List<WebElement> rows = driver.findElements(By.xpath("//div[@role='row']"));
/*
		for (int i = 1; i <= rows.size(); i++) {
			

		    // song name (stable)
		    String songName = driver.findElement(By.xpath(
		        "(//div[@role='row' and @aria-rowindex])[" + i + "]//a[@data-testid='internal-track-link']//span"
		    )).getText();

		    // views (take the first number-like text in the row after the name)
		    String views = driver.findElement(By.xpath(
		        "(//div[@role='row' and @aria-rowindex])[" + i + "]//*[matches(normalize-space(.), '^[0-9,]+$')]"
		    )).getText();

		    // duration (mm:ss format at the end of row)
		    String duration = driver.findElement(By.xpath(
		        "(//div[@role='row' and @aria-rowindex])[" + i + "]//*[matches(normalize-space(.), '^[0-9]+:[0-9]{2}$')]"
		    )).getText();

		    System.out.println(songName + " | " + views + " | " + duration);
		}

		*/

		

		for (WebElement row : rows) {

		    String songName = row
		            .findElement(By.xpath(".//a[@data-testid='internal-track-link']//div[@data-encore-id='text']"))
		            .getText();

		    String views = row
		            .findElement(By.xpath(".//div[@aria-colindex='3']//div[@data-encore-id='text']"))
		            .getText();

		    String duration = row
		            .findElement(By.xpath(".//div[@aria-colindex='4']//div[@data-encore-id='text']"))
		            .getText();

		    System.out.println(songName + " | " + views + " | " + duration);
		}

		driver.close();
	}
}
