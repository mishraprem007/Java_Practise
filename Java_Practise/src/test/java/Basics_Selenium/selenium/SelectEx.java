package Basics_Selenium.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectEx {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");

		// click on books link

		driver.findElement(By.partialLinkText("Books")).click();

		// sortbyDropDown
		WebElement sort = driver.findElement(By.id("products-orderby"));

		Select objSel = new Select(sort);

//Get Options Methods - to get all  options of dropDown

		List<WebElement> allOptions = objSel.getOptions();

		for (WebElement value : allOptions) {
			System.out.println(value.getText());
		}

		WebElement display = driver.findElement(By.id("products-pagesize"));
		Select display_dropDown = new Select(display);

		List<WebElement> display_Values = display_dropDown.getOptions();

		for (WebElement value : display_Values) {
			System.out.println(value.getText());
		}

		//sortby dropDown
	WebElement sort_by=driver.findElement(By.id("products-viewmode"));
	Select obj_sort = new Select(sort_by);
	
	//isMultiple(); - Returns boolean after checking if the dropDown has multiSelect options
	System.out.println(obj_sort.isMultiple());
	
	
	}

}
