package ImpSelQues;

import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShow {
	public static <upcomingMovies> void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://in.bookmyshow.com/explore/home/bengaluru");
		driver.findElement(By.xpath("//a[text()='Movies']")).click();
		driver.findElement(By.xpath("//img[@alt='Coming Soon']")).click();
		List<WebElement> upcomingMovies = driver.findElements(By.xpath("//div[@class='sc-7o7nez-0 elfplV']"));
		List<WebElement> movieDtls = driver.findElements(By.xpath("//div[@class='sc-7o7nez-0 bsZIkT']"));

		for (int i = 0; i < upcomingMovies.size(); i++) {
			System.out.println(upcomingMovies.get(i).getText() + "  " + movieDtls.get(i).getText());
		}
	}
}
