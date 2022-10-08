package jeevantesttng;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testexample {
	WebDriver driver;

@Test
public void HRMLoginFinal() {
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
@Test
public void hrmleave_application() {
System.setProperty("webdriver.chrome.driver", "C:\\Jeevan\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
driver.findElement(By.xpath("//div/input[@name = 'username']")).sendKeys("Admin");
driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("admin123");
driver.findElement(By.xpath("//button[@type = 'submit']")).click();
driver.findElement(By.linkText("Leave")).click();
driver.findElement(By.linkText("Apply")).click();
driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']/div[2]/i")).click();
driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
driver.findElement(By.xpath("//div/div[2]/div/div/input")).sendKeys("2022-10-25");
driver.findElement(By.xpath("//button[@type='submit']")).click();
}


	}
	

