package Selenium.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class brockerage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\work\\chrome\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nobroker.in");
		driver.findElement(By.xpath("//*[@id='app']/div/div/div[1]/div[3]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\'searchCity\']/div/div[1]/div")).click();
		driver.findElement(By.xpath("//*[@id=\'listPageSearchLocality\']")).sendKeys("gateway of india");
		
		//driver.findElement(By.linkText("LG 190 L 4 Star Inverter Direct-Cool Single Door Refrigerator (GL-B201ASPY, Scarlet Plumeria, Moist 'N' Fresh)")).click();
	    System.out.println(driver.getTitle());
	    

	}

}
