package Selenium.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\work\\chrome\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		driver.get("http://yahoo.com");
		driver.navigate().back();
	
	}

}
