package Selenium.testing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\work\\chrome\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("refrigerator");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.linkText("LG 190 L 4 Star Inverter Direct-Cool Single Door Refrigerator (GL-B201ASPY, Scarlet Plumeria, Moist 'N' Fresh)")).click();
	   
	   
	  //  Actions a= new Actions(driver);
	  //  a.moveToElement(driver.findElement(By.xpath("")))
		//Set<String>ids=driver.getWindowHandles();
		//Iterator<String> it=ids.iterator();
	    //String parentid=it.next();
	    //String childid=it.next();
	   // driver.switchTo().window(childid);
	   // System.out.println(driver.findElement(By.xpath("//*[@id='productDetails_techSpec_section_1']/tbody/tr[14]/th")).getText());
	    System.out.println(driver.getTitle());
	   //System.out.println(driver.findElement(By.xpath("//th[@class='a-color-secondary a-size-base prodDetSectionEntry']")).getText());
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
	    
	     List<WebElement> tablehead=driver.findElements(By.xpath("//table[@id='productDetails_techSpec_section_1']/tbody/tr/th"));
	     List<WebElement> tabledata=driver.findElements(By.xpath("//table[@id='productDetails_techSpec_section_1']/tbody/tr/td"));

	     for(int i=0;i<tablehead.size();i++) {
        	if(tablehead.get(i).getText().equalsIgnoreCase("Voltage")) {
        		System.out.println(tabledata.get(i).getText());
        		break;
        	}
        }
	   
			driver.findElement(By.linkText("LG 190 L 4 Star Inverter Direct-Cool Single Door Refrigerator (GL-B201ASPY, Scarlet Plumeria, Moist 'N' Fresh)")).click();
            driver.getWindowHandle();
            for(String winHandle1:driver.getWindowHandles()) {
            	driver.switchTo().window(winHandle1);
            	
    
            }
            System.out.println(driver.getCurrentUrl());
            List<WebElement> myList=driver.findElements(By.xpath("//table[@id='HLCXComparisonTable']/tbody/tr[21]/td"));
            List<String> all_elements_text=new ArrayList<>();
            for(int i=0;i<myList.size();i++) {
            	all_elements_text.add(myList.get(i).getText());
            	System.out.println(myList.get(i).getText());
            }
            Object obj=Collections.max(all_elements_text);
            System.out.println("the highest item weight is"+obj);
	}
	
	
}
