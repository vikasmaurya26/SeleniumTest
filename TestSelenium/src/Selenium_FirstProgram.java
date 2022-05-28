import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
public class Selenium_FirstProgram {

	public static  void main(String []a)
	{		
	    
	    // declaration and instantiation of objects/variables  
	        System.setProperty("webdriver.chrome.driver", "C:/Users/vikas.maurya/Documents/chromedriver.exe");  
	        WebDriver driver=new ChromeDriver();  
	          
	    // Launch web site  
	        driver.navigate().to("http://www.google.com/");
	    //	Maximize chrome window
	        driver.manage().window().maximize();
	              
	    // Click on the search text box and send value  
	        driver.findElement(By.id("lst-ib")).sendKeys("javatpoint tutorials");  
	              
	    // Click on the search button  
	        driver.findElement(By.name("btnK")).click();  
	          
	       
	      
	    }  
}
