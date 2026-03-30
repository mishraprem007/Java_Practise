package basics_Selenium_Screenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotsExample {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
//Take ScreenShot after homePage loads
		// type cast to get the capabilities of TakeScreenshot interface to the driver
		// interface

		// type casting
		// if creating the instance of RemoteWebDriver instead of WebDriver then we
		// don't need to type cast driver
		TakesScreenshot ts = (TakesScreenshot) driver;

		// Temporary location
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		// output type FILE - it will store in temporary location in selenium, then we
		// need to copy paste it where ever we want to store. because as soon as JVM
		// exits the temporary location FILE will be removed

		/*
		 * 1. Create one Folder in project level for screenShots to get the screenshots
		 * saved
		 */

		// Destination file
		// . dot represent current project folder and after/mention the folderName
		// created in Project
		// after FolderName/ give the file name we want to save with, give any
		// meaningful name
		File destFile = new File("./ScreenShots/HomePage.png");

		// copy file from temporary loc (source) to destination

		FileHandler.copy(srcFile, destFile);

		System.out.println("home page lauched sucessfully");

		driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		// screenShots after clicking on search
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/SearchPage.png");
		FileHandler.copy(src, dest);

		driver.close();
	}
}
