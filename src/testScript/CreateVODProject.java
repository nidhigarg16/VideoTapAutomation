package testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import testBase.TestBase;

public class CreateVODProject extends TestBase {

	@Test(priority = 1)
	private void browserSetUp() throws InterruptedException {
		init();
		driverwait(3);
		// DRLoginTest obj1 = new DRLoginTest();
		// obj1.vtapLogin();

		WebElement Username = driver.findElement(By.xpath("//*[@id=\"main-element\"]/div/form/div[8]/input"));
		Username.click();
		Username.sendKeys("nidhi@videotap.com");

		WebElement Password = driver.findElement(By.xpath("//*[@id=\"main-element\"]/div/form/div[11]/input"));
		Password.click();
		Password.sendKeys("123456789");
		driverwait(2);

		WebElement LoginButton = driver.findElement(By.xpath("//img[@ng-click='login(form)']"));
		LoginButton.click();

		implicitwait(10);

		// driver.get("https://qadr.videotap.com:1337/#!/");

		driverwait(5);
	}

	@Test(priority = 2)
	private void DesignProject() throws InterruptedException {

		driverwait(5);

		String actualTitle = driver.findElement(By.xpath("//h2[@class='design-suite-head']")).getText();
		Thread.sleep(1000);
		System.out.println("Driver value ___" + actualTitle);
		Assert.assertEquals(actualTitle, "Welcome to DESIGN SUITE");
	}

	@Test(priority = 3)
	private void CreateNewProjectFunc() throws InterruptedException {

		WebElement CreateNewProjectButton = driver
				.findElement(By.cssSelector("#navbar > md-toolbar > div > div:nth-child(2) > condtional > div > a"));
		CreateNewProjectButton.click();

		driverwait(5);
	}

	@Test(priority = 4)
	private void AddNamefieldFunc() throws InterruptedException {
		WebElement NameField = driver.findElement(By.xpath("//input[@ng-model='project.name'][@name='name']"));

		driverwait(3);
		implicitwait(5);
		NameField.click();
		NameField.sendKeys("First Test Project");
	}

	@Test(priority = 5)
	private void AddLanguageFunc() throws InterruptedException {
		WebElement LanguageField = driver.findElement(By.xpath("//md-select[@ng-model='project.language']"));
		LanguageField.click();
		implicitwait(5);
		Thread.sleep(2000);

		WebElement langSelection = driver.findElement(By.xpath("//div[contains(text(),'English')]"));
		langSelection.click();
		driverwait(2);
	}

	@Test(priority = 6)
	private void ContentSelectFunc() throws InterruptedException {
		WebElement ContentSelection = driver
				.findElement(By.xpath("//md-radio-button[@value='2000']"));
		ContentSelection.click();
		
	}

	@Test(priority = 7)
	private void GenreSelectFunc() throws InterruptedException {
		// Finding the Check Box element:-
		List<WebElement> chkBx_Genre = driver.findElements(By.xpath("//input[@type='checkbox']"));
		// This will tell you the number of Check Boxes are present
		int iSize = chkBx_Genre.size();
		System.out.println("No. of checkboxes are:- " + iSize);

		for (int i = 1; i <= iSize; i++) {
			if (i == 4) // number of checkboxes to be selected
				break;
			WebElement value = chkBx_Genre.get(i);
			value.click();
			Thread.sleep(3000);
		}
		Thread.sleep(3000);
	}

	@Test(priority = 8)
	private void AddThumbnailFunc() throws InterruptedException {
		WebElement Thumbnail = driver.findElement(By.xpath("//span[contains(text(),'Select Horizontal Thumbnails')]"));
		Thumbnail.click();
		Thread.sleep(5000);
		WebElement AddButton = driver.findElement(By.id("imageuploader_new_proj"));
		AddButton.sendKeys("C:/Users/Dell/Downloads/Videotap/Images/dairymilk-cadbury-s-chocolate-bouquet.jpg");
		Thread.sleep(5000);
		WebElement DoneButton = driver.findElement(By.xpath("//button[@type='submit']"));
		DoneButton.click();
		Thread.sleep(3000);
	}

	@Test(priority = 9)
	private void AddVideoMediaFunc() throws InterruptedException {
		WebElement selectMediaButton = driver
				.findElement(By.xpath("//*[@id=\"dialogContent_createProject\"]/div[2]/div[3]/div[1]/div"));
		selectMediaButton.click();
		Thread.sleep(3000);
		WebElement checkbox = driver.findElement(By.xpath(
				"//*[@id=\"dialogContent_addMedia-dig\"]/md-card/md-table-container/table/tbody[1]/tr/td[1]/md-checkbox"));
		checkbox.click();
		WebElement importButton = driver.findElement(By.xpath("//*[@id=\"addMedia-dig\"]/md-dialog-actions/button"));
		importButton.click();
		Thread.sleep(8000);
	}

	@Test(priority = 10)
	private void AddTags() throws InterruptedException {
		WebElement MediaName = driver.findElement(By.xpath("//input[@ng-model='selectedMedia.originalname']"));
		MediaName.click();
		MediaName.clear();
		MediaName.sendKeys("TestMedia File");

		WebElement EnterTag = driver
				.findElement(By.xpath("//md-list-item[@role='listitem']//md-chips[@ng-model='selectedMedia.tags']"));
		EnterTag.sendKeys("Test");

		EnterTag.sendKeys(Keys.ENTER);

		Thread.sleep(3000);
	}

	@Test(priority = 11)
	private void ClickNextFunc() throws InterruptedException {
		WebElement clickOnNext = driver
				.findElement(By.xpath("//*[@id=\"dialogContent_createProject\"]/div[2]/md-dialog-actions/button[1]"));
		clickOnNext.click();
		Thread.sleep(1000);
	}

	@Test(priority = 12)
	private void ClickCreateFunc() throws InterruptedException {
		WebElement clickOnCreate = driver.findElement(By.xpath("//button[contains(text(),'Create')]"));
		clickOnCreate.click();
		Thread.sleep(8000);
	}

	@Test(priority = 13)
	private void WaitForElement() throws InterruptedException {

		WebDriverWait Wait4 = new WebDriverWait(driver, 40);
		Wait4.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"navbar\"]/md-toolbar/div/div[4]")));
		Wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"navbar\"]/md-toolbar/div/div[4]")));

		WebElement Header = driver.findElement(By.xpath("//*[@id=\"navbar\"]/md-toolbar/div/div[4]"));
		String ActualHeader = Header.getText();
		Assert.assertEquals(ActualHeader, "Welcome to Edit Suite");

		Thread.sleep(5000);
	}

	@Test(priority = 14)
	private void closewebBrowser() throws InterruptedException {
		System.out.println("Yepiiee Test Pass...");
		Thread.sleep(3000);
		// driver.quit();

	}

}
