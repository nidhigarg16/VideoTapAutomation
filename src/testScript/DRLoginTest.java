package testScript;

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
				.findElement(By.xpath("//*[@id=\"main-element\"]/div/form/div[8]/input"));
		Username.click();
		Username.sendKeys("nidhi@videotap.com");

		WebElement Password = driver
				.findElement(By.xpath("//*[@id=\"main-element\"]/div/form/div[11]/input"));
		Password.click();
		Password.sendKeys("123456789");
		driverwait(2);

		WebElement LoginButton = driver.findElement(By.xpath("//img[@ng-click='login(form)']"));
		LoginButton.click();
		
		driverwait(5);
	}

	
}
