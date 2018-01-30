package artifactid.gmas;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver;
	
	@BeforeTest
	public void setup() {
		driver = new FirefoxDriver();
	}
	
	@Test
	public void doLogin() {
		driver.get("http://teststore2.getmeashop.com/user/login/");
		driver.findElement(By.xpath("//section/div/div/div/div/div[1]/div/form/p[1]/input")).sendKeys("4mail2amit@gmail.com");
		driver.findElement(By.xpath("//section/div/div/div/div/div[1]/div/form/p[2]/input")).sendKeys("test1");
		//driver.findElement(By.xpath("//section/div/div/div/div/div[1]/div/form/button")).click();
		driver.findElement(By.xpath("//section/div/div/div/div/div[1]/div/form/button")).sendKeys(Keys.ENTER);
	}
	
	@AfterTest
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
