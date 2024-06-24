import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// Invoking browser
		// Chrome Chromedriver >> Methods
		// Webdriver is Iterface
		//Chrome.exe -> Chrome browser.
        //Step to invoke chromebrowser
		//SeleniumManager --on  Beta phase -no need to invoke chrome driver
        WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		System.out.println (driver.getTitle());
		System.out.println (driver.getCurrentUrl());
	   // driver.close();
	  //  driver.quit();
	}

}
