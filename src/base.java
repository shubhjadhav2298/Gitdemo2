import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		String[] itemsNeeded= {"Onion","Apple","Beetroot"};
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\jadha\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebDriverWait w =new WebDriverWait(driver, Duration.ofSeconds(5));
      
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        Thread.sleep(3000);
        addItems(driver,itemsNeeded);
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
        
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();
      
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
     
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
        
       
        
        
        
        
        
        
        
        
        
     
	}
	public static void addItems(WebDriver driver,String[] itemsNeeded)
	{
		  int j=0;
		 List<WebElement> product= driver.findElements(By.cssSelector("h4.product-name"));
	      for(int i=0;i<product.size();i++)
	      {
	    	  // Brocolli - 1 Kg  

	    	 String[] name= product.get(i).getText().split("-");
	    	 String formatedName=name[0].trim();
	    	 //Convert array to arraylist for easy search
	    	 //check whether name you extracted is present in the arraylist
	    	 
	    	 List itemsneededList = Arrays.asList(itemsNeeded);
	    	 
	    	 if(itemsneededList.contains(formatedName))
	    	 {
	    		 //click on add cart
	    		 driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
	    		 if(j==itemsNeeded.length)
	    		 {
	    			 break;
	    		 }
	    		 
	    	 }
	      }
	      
	}

}
