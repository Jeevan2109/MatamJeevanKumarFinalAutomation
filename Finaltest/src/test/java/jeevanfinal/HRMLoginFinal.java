//USING WEB ELEMENTS ORANGE HRM APPLICATON
package jeevanfinal;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMLoginFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Jeevan\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//Able to navigate 
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();

		driver.findElement(By.name("username")).sendKeys("Admin");//username
		driver.findElement(By.name("password")).sendKeys("admin123");//password
		driver.findElement(By.xpath("//button[@type='submit']")).click();//login button
		//driver.findElement(By.linkText("My Info")).click();//
		//driver.findElement(By.linkText("Leave")).click();
		//driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Admin")).click();
	    


}


	}


