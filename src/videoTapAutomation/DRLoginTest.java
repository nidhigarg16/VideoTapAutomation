package videoTapAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class DRLoginTest {

	WebDriver driver;

	@Test(priority = 1)
	private void browserSetUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		Thread.sleep(3000);
		driver.manage().window().maximize();

	}

	@Test(priority = 2)
	private void vtapLogin() throws InterruptedException {

		driver.get("https://dr3.videotap.com/#");
		Thread.sleep(3000);

		WebDriverWait Wait = new WebDriverWait(driver, 20);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.cssSelector("#main-element > div > form > div.float-right-login > img")));
		Wait.until(ExpectedConditions
				.elementToBeClickable(By.cssSelector("#main-element > div > form > div.float-right-login > img")));

		String title = driver.getTitle();
		System.out.println(title);

		Assert.assertEquals(title, "VideoTap Design Room");
		System.out.println("TestLaunched");

		WebElement Username = driver
				.findElement(By.cssSelector("#main-element > div > form > div.middle-input-user-box > input"));
		Username.click();
		Username.sendKeys("nidhi@vtap.com");

		WebElement Password = driver
				.findElement(By.cssSelector("#main-element > div > form > div.middle-input-pass-box > input"));
		Password.click();
		Password.sendKeys("123456789");

		WebElement LoginButton = driver.findElement(By
				.cssSelector("#main-element > div > form > div:nth-child(13) > div.middle-right-front-overlay > img"));
		LoginButton.click();
		Thread.sleep(3000);

	}

	@Test(priority = 3)
	private void createAccount() throws InterruptedException {

		WebDriverWait Wait1 = new WebDriverWait(driver, 20);
		Wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
				"#navbar > md-toolbar > div > div.width-40-per.navbar-color-blue.flex > div > condtional > h2")));
		Wait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
				"#navbar > md-toolbar > div > div.width-40-per.navbar-color-blue.flex > div > condtional > h2")));
		WebElement Heading = driver.findElement(By.cssSelector(
				"#navbar > md-toolbar > div > div.width-40-per.navbar-color-blue.flex > div > condtional > h2"));

		String actualTitle = Heading.getText();
		Assert.assertEquals(actualTitle, "Welcome to DESIGN SUITE");

		WebElement CreateNewProjectButton = driver
				.findElement(By.cssSelector("#navbar > md-toolbar > div > div:nth-child(2) > condtional > div"));
		CreateNewProjectButton.click();
		Thread.sleep(2000);

		WebElement NameField = driver.findElement(By.xpath("//input[@ng-model='project.name'][@name='name']"));
		NameField.click();
		NameField.sendKeys("ProjectDemo");

		WebElement LanguageField = driver.findElement(By.xpath("//md-select[@ng-model='project.language']"));
		LanguageField.click();

		Thread.sleep(2000);

		WebElement langSelection = driver.findElement(By.xpath("//div[contains(text(),'English')]"));
		langSelection.click();
		Thread.sleep(2000);

		WebElement ContentSelection = driver.findElement(By.cssSelector("#radio_64 > div.md-container.md-ink-ripple > div.md-off"));
		ContentSelection.click();
		
		driver.quit();

	}

	@AfterTest
	private void closewebBrowser() {
		System.out.println("Yepiiee Test Pass...");
		driver.quit();

	}
}
