package basics_Selenium_Screenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShots_WebElement {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");

		// take screenshot of search text field
		WebElement searchText = driver.findElement(By.id("small-searchterms"));
		searchText.sendKeys("mobile");

		// Type casting
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = searchText.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./ScreenShots/searchField.png");
		FileHandler.copy(srcFile, destFile);

		System.out.println("ScreenShot on the WebElement searchtxt filed is sucessful");

		// take screenshot of search button
		WebElement searchBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		File scr = searchBtn.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/searchBtn.png");
		FileHandler.copy(scr, dest);
		driver.close();
	}
}
