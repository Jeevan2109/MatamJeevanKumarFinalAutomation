package jeevanfinal;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AlertFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Jeevan\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		  driver.switchTo().frame("login_page");
		  //driver.findElement(By.xpath("//a[contains(text(),'CONTINUE')]")).click();
		  driver.findElement(By.linkText("CONTINUE")).click();
		  Alert HdfcAlert=driver.switchTo().alert();
		  // Here we are getting the text message displayed on alert window
		  String actualResult=HdfcAlert.getText();
		  //Thread.sleep(1000);
		 // Here we are clicking on OK button on alert window
		  HdfcAlert.accept();//
		  //HdfcAlert.dismiss();
		  driver.switchTo().defaultContent();// This method will take back to main window mean comes out of the login frame.
		  System.out.println(actualResult);
		  String expectedResult="Customer ID  cannot be left blank.";
		  Assert.assertEquals(actualResult,expectedResult);
		  Assert.assertEquals(actualResult,expectedResult,"actual result and expected results are not matching");
		 SoftAssert softAssert = new SoftAssert();
		 softAssert.assertEquals(actualResult, expectedResult);
		 System.out.println("After assertion");
	}

}
