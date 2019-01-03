package videoTapAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import testBase.TestBase;

public class DRLoginTest extends TestBase {
	
	// DRLoginTest obj1 = new DRLoginTest();
	

	@Test
	private void browserSetUp() throws InterruptedException {
		init();
	}

		@Test
		public	void vtapLogin() throws InterruptedException {
		
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
		driverwait(2);

		WebElement LoginButton = driver.findElement(By
				.cssSelector("#main-element > div > form > div:nth-child(13) > div.middle-right-front-overlay > img"));
		LoginButton.click();
		
		driverwait(5);
	}

	
}
