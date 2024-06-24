import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\jadha\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		
		
		//Broken URL
		//Step-1 Is to get all the URL tied up to the link using selenium
		// Java methods will call URL's and gets you the status code
		//if the status code is >400 then that URL or link broken

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        SoftAssert a= new SoftAssert();
        
        List<WebElement> links=  driver.findElements(By.cssSelector("li[class='gf-li'] a"));
        
       for(WebElement link :links )
       {
    	   String url= link.getAttribute("href");
           HttpURLConnection conn =(HttpURLConnection) new URL(url).openConnection();
           conn.setRequestMethod("HEAD");
           conn.connect();
           int respCode= conn.getResponseCode();
           System.out.println(respCode);
           a.assertTrue(respCode<400, "The link with the text" +link.getText()+"The broken with code " +respCode);
          
       }
       a.assertAll();
        
        
        
       
	}

}
