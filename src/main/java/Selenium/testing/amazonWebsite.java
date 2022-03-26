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

public class amazonWebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\work\\chrome\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.in");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("refrigerator");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.linkText("LG 190 L 4 Star Inverter Direct-Cool Single Door Refrigerator (GL-B201ASPY, Scarlet Plumeria, Moist 'N' Fresh)")).click();
	    System.out.println(driver.getTitle());
	   
	  //  Actions a= new Actions(driver);
	  //  a.moveToElement(driver.findElement(By.xpath("")))
		Set<String>ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
	    String parentid=it.next();
	    String childid=it.next();
	    driver.switchTo().window(childid);
	    System.out.println(driver.findElement(By.xpath("//*[@id='productDetails_techSpec_section_1']/tbody/tr[14]/th")).getText());
	    System.out.println(driver.getTitle());
	    List<WebElement>arryEle=driver.findElements(By.xpath("//table[@id='HLCXComparisonTable']/tbody/tr[21]/td"));
	    List<String> weight=new ArrayList<>();
	    for(int i=0;i<arryEle.size();i++) {
	    
	    weight.add(arryEle.get(i).getText());
	    System.out.println(arryEle.get(i).getText());
	    
	    }
	    Object highest=Collections.max(weight);
	    System.out.println("the highest weignt="+highest);
	    
	   
	     List<WebElement> vtg=driver.findElements(By.xpath("//table[@id='productDetails_techSpec_section_1']/tbody/tr/th"));
	     List<WebElement> value=driver.findElements(By.xpath("//table[@id='productDetails_techSpec_section_1']/tbody/tr/td"));

	     for(int i=0;i<vtg.size();i++) {
       	if(vtg.get(i).getText().equalsIgnoreCase("Voltage")) {
       		System.out.println(value.get(i).getText());
       		break;
       	}
       }
	   
	    
	    
	    
	    
	    
	    
	    

	}

}
