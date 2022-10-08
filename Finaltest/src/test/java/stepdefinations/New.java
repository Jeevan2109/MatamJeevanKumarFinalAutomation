package stepdefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class New {
	private static WebDriver driver = null;
	
		// TODO Auto-generated method stub
		@Given("browser is open and application is in login page")
		public void browser_is_open_and_application_is_in_login_page() {
			System.setProperty("webdriver.chrome.driver", "C:\\Jeevan\\chromedriver.exe");
		driver= new ChromeDriver();
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}
		@When("user enters user name and password")
		public void user_enters_user_name_and_password() {
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		}
		@Then("home page is displayed")
		public void home_page_is_displayed() {
			String actualresult, expectedresult;
		    expectedresult="PIM";
		    actualresult=driver.findElement(By.xpath("//img[@alt='client brand banner']")).getText();	    
		}
		@Then("user able logout")
		public void user_able_logout() {
			driver.findElement(By.xpath("//img[@alt='profile picture']")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
				}
		

	}


