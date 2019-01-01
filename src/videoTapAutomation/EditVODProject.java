package videoTapAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import testBase.TestBase;

public class EditVODProject extends TestBase{

	@Test (priority=1)
	private void browserSetUp() throws InterruptedException {
		init();
		driverwait(3);
		DRLoginTest obj1 = new DRLoginTest();
		obj1.vtapLogin();
		driverwait(6);
	}
	
	@Test (priority=2)
	private void OpenProject() throws InterruptedException {
		System.out.println("hello");
		String OpenURL = "https://dr3.videotap.com/#/workspace/5c25b1b0925cc0b43bcac007";
		//implicitwait(3);
		driver.get(OpenURL);
		driverwait(8);
	}
	
	@Test (enabled=false)
	private void EditSuiteFunc() throws InterruptedException 
	{

		System.out.println("WELCOME TO EDIT SUITE ...!!!!!");
		driverwait(3);
		WebElement projectFileButton = driver.findElement(By.id("btnMediaLib"));
		projectFileButton.click();
		driverwait(2);
		WebElement projectFile = driver.findElement(By.id("5c25b1a3925cc0b43bcac006"));
		projectFile.click();
		driverwait(3);
		WebElement ElementsButton = driver.findElement(By.xpath("//md-whiteframe[@id='accordinToolBar']//div[10]//button[2]//md-icon[1]"));
		ElementsButton.click();
		driverwait(3);
		WebElement AddElementsButton = driver.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/div[1]/ui-view[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/command-boutique[1]/div[2]/div[1]/div[1]/property-boutique[1]/md-tabs[1]/md-tabs-wrapper[1]/md-tabs-canvas[1]/md-pagination-wrapper[1]/md-tab-item[2]"));
		AddElementsButton.click();
		driverwait(5);
		WebElement Button = driver.findElement(By.xpath("//*[@id=\"menu-option-Container\"]/div[1]/div[2]/div/img"));
		Button.click();
		
		driverwait(3);
	}

	@Test(priority=3)
	private void UploadFileFromDrive() throws InterruptedException{
		
		WebElement UploadFilesBtn = driver.findElement(By.xpath("//div[contains(text(),'Upload Files')]"));
		UploadFilesBtn.click();
	
		implicitwait(4);
	
		WebElement DriveBtn = driver.findElement(By.id("driveuploader"));	
		DriveBtn.sendKeys("C:/Users/Dell/Downloads/Videotap/Around the World in 80 Clips.mp4");
		Thread.sleep(5000);

		WebElement SaveToMediaLib = driver.findElement(By.xpath("//*[@id=\"unique\"]/md-dialog-actions/button[2]"));
		SaveToMediaLib.click();
		driverwait(130);
		WebElement DoneBtn = driver.findElement(By.xpath("/html/body/div[3]/md-dialog/md-dialog-actions/button"));
		DoneBtn.click();
		
	}
	
	
	@Test(enabled=false)
	private void abcde() throws InterruptedException {
		
	}
}
