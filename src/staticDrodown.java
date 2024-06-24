import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticDrodown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\jadha\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        // Dropdown with select tag- Static
        WebElement Selectdropdown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown= new Select(Selectdropdown);
        dropdown.selectByIndex(2);
       System.out.println( dropdown.getFirstSelectedOption().getText());
       dropdown.selectByVisibleText("INR");
       System.out.println( dropdown.getFirstSelectedOption().getText());
       dropdown.selectByValue("USD");
       System.out.println( dropdown.getFirstSelectedOption().getText());
        
	}

}
