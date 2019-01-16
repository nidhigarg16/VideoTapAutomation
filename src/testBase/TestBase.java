package testBase;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {

	public static WebDriver driver;
	String baseURL = "https://qadr.videotap.com:1337/#!/";

	public void init() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");

		DesiredCapabilities caps = DesiredCapabilities.chrome();
        LoggingPreferences logPrefs = new LoggingPreferences();
        logPrefs.enable(LogType.BROWSER, Level.ALL);
        caps.setCapability(CapabilityType.LOGGING_PREFS, logPrefs);
        
        driver = new ChromeDriver(caps);
		
	//	driver = new ChromeDriver();

		driver.get(baseURL);
		driver.manage().window().maximize();
		System.out.println("Test initiated");
		implicitwait(10);
		driverwait(2);
	}

	public void driverwait(int time) throws InterruptedException {
		Thread.sleep(time * 1000);
		System.out.println("Thread wait for "+ time);

	}

	public void implicitwait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		System.out.println("Implicit wait for "+ time);
		
	}
	
	public void waitUntilWebElementIsNotVisible(int time, String xpath) throws Exception {

		WebDriverWait wait = new WebDriverWait(driver, time);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		element.click();

		}
	

}
