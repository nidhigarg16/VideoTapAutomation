package videoTapAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DRLoginTest 
{
	
@Test
public void login() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	Thread.sleep(3000);
	driver.manage().window().maximize();
	
	driver.get("https://dr3.videotap.com/#");
	Thread.sleep(3000);
	
	WebDriverWait Wait = new WebDriverWait(driver, 20);
	Wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#main-element > div > form > div.float-right-login > img")));
	Wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#main-element > div > form > div.float-right-login > img")));
	
	String title = driver.getTitle();
	System.out.println(title);
	
	Assert.assertEquals(title, "VideoTap Design Room");

	driver.findElement(By.cssSelector("#main-element > div > form > div.middle-input-user-box > input"));
	
	
	driver.close();
	driver.quit();
	
}

}
