import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\jadha\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//Switching window
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> handle= driver.getWindowHandles();
		Iterator<String> it= handle.iterator();
		String parentID=it.next();
		String childID= it.next();
	    driver.switchTo().window(childID);
	    driver.get("https://rahulshettyacademy.com/");
	    String course= driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
	    driver.switchTo().window(parentID);
	    WebElement name=driver.findElement(By.cssSelector("[name='name']"));
	    name.sendKeys(course);
	   // driver.quit();
	    //take screenshot of name only code
	   File file= name.getScreenshotAs(OutputType.FILE);
	   
	   FileUtils.copyFile(file, new File("Logo.png"));
	   System.out.println(name.getRect().getDimension().getHeight());
	   System.out.println(name.getRect().getDimension().getWidth());
	   
		

	}

}
