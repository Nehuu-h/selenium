package Selenium.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver", "D:\\work\\chrome\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.in");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("refrigerator");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.linkText("LG 190 L 4 Star Inverter Direct-Cool Single Door Refrigerator (GL-B201ASPY, Scarlet Plumeria, Moist 'N' Fresh)")).click();
	    System.out.println(driver.getTitle());
	   
    	driver.getWindowHandle();
 	    WebElement a=driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[3]"));
 	    String text1=a.getText();
 	    System.out.println(text1);
 	    for(String winHandle:driver.getWindowHandles()) {
 	    	driver.switchTo().window(winHandle);
 	    	}
 	    WebElement b=driver.findElement(By.id("acrCustomerReviewTest"));
 	    String text2=b.getText();
 	    System.out.println(text2);
 	    if(text2.indexOf(text1)!=-1) {
 	    	System.out.println("matched");
 	    }
 	    else {
 	    	System.out.println("not matched");
 	    }
    }
}
