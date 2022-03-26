package Selenium.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class indica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\work\\chrome\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.indiabookstore.net/");
		driver.findElement(By.xpath("//*[@id='searchBox']")).sendKeys("selenium"); //*[@id="searchBox"]
		driver.findElement(By.xpath("//*[@id='searchButtonInline']")).click();
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//WebElement Category_Book = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Selenium testing tools Cookbook']"))).click();
		//driver.findElement(By.xpath("//*[@id='searchButtonInline']")).click();
		//driver.findElement(By.xpath("//img[@alt='Selenium testing tools Cookbook']")).click();
		//driver.findElement(By.xpath("//*[@id='bookInfoWindow']/div/div/div[2]/div[2]/div[2]/div[3]/a"));
	}//*[@id="bookInfoWindow"]/div/div/div[2]/div[2]/div[2]/div[3]/a

}
