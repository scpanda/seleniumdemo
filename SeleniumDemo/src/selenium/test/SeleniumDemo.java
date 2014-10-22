package selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://cn.bing.com");
		driver.manage().window().maximize();
		System.out.println("first title is:"+driver.getTitle());
		
		WebElement input_area=driver.findElement(By.name("q"));
		input_area.sendKeys("京东");
		
		WebElement search_buuton=driver.findElement(By.name("go"));
		search_buuton.click();
		System.out.println("now title is:"+driver.getTitle());
		
		//driver.quit();
	}

}
