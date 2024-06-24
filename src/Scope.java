import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// To get the count of link present on web page

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\jadha\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footdriver = driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footdriver.findElements(By.tagName("a")).size());
		WebElement columnDriver = footdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		
		for(int i=1;i<columnDriver.findElements(By.tagName("a")).size();i++)
		{
			String clickonLink= Keys.chord(Keys.CONTROL,Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonLink);
			Thread.sleep(5000L);
		}
		Set<String> abc= driver.getWindowHandles();
		Iterator<String> it= abc.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next()) ;
			System.out.println(driver.getTitle());
		}

	}

}
