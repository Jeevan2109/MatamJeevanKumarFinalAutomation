package jeevanfinal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Jeevan\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		   driver.get("https://dlithe.com/");
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			Actions mouse=new Actions(driver);
			driver.manage().window().maximize();
			//Thread.sleep(1000);
			mouse.moveToElement(driver.findElement(By.linkText("HOME"))).build().perform();
			
	}
}


