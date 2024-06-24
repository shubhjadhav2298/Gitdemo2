import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class UpdateDropdwon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\jadha\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        org.testng.Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
       // System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
       org.testng.Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
       
       System.out.println( driver.findElement(By.id("Div1")).getAttribute("style"));
       driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip")).click();
      System.out.println( driver.findElement(By.id("Div1")).getAttribute("style"));
      
     if( driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
     {
    	 System.out.println("It is enabled");
    	 org.testng.Assert.assertTrue(true);
     }
     else
     {
    	 org.testng.Assert.assertTrue(false);
     }
       // Count the number of checkboxes
      
       
      System.out.println( driver.findElements(By.cssSelector("input[type='checkbox']")).size());
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000L);
        /*int i=1;
        
        while(i<5)
        {
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }*/
        System.out.println( driver.findElement(By.id("divpaxinfo")).getText());
        for(int i=1;i<5;i++)
        {
        	driver.findElement(By.id("hrefIncAdt")).click();
        }
    
        driver.findElement(By.id("btnclosepaxoption")).click();
        org.testng.Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
        System.out.println( driver.findElement(By.id("divpaxinfo")).getText());
	}

}
