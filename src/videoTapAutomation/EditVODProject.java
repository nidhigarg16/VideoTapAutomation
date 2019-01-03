package videoTapAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testBase.TestBase;

public class EditVODProject extends TestBase {

	@Test(priority=1)
	private void browserSetUp() throws InterruptedException {
		init();
		driverwait(3);
		DRLoginTest obj1 = new DRLoginTest();
		obj1.vtapLogin();
	System.out.println("Class is Setup");
		driverwait(6);
	}

	@Test(priority=2)
	private void OpenProject() throws InterruptedException {
		System.out.println("hello");
		String OpenURL = "https://dr3.videotap.com/#/workspace/5c2c4fac925cc0b43bcac10f";
		driver.get(OpenURL);
		driverwait(8);
	}

	@Test(priority=3)
	private void EditSuiteFunc() throws InterruptedException {

		System.out.println("WELCOME TO EDIT SUITE ...!!!!!");
		driverwait(3);
		WebElement projectFileButton = driver.findElement(By.xpath("//*[@id=\"btnMediaLib\"]"));
		projectFileButton.click();
		driverwait(2);
		WebElement projectFile = driver.findElement(By.id("5c2c4f9e925cc0b43bcac10e_anchor"));
		projectFile.click();
		driverwait(8);
		WebElement ElementsButton = driver
				.findElement(By.xpath("//md-whiteframe[@id='accordinToolBar']//div[10]//button[2]//md-icon[1]"));
		ElementsButton.click();
		driverwait(3);
		WebElement AddElementsButton = driver.findElement(By.xpath(
				"/html[1]/body[1]/ui-view[1]/div[1]/ui-view[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/command-boutique[1]/div[2]/div[1]/div[1]/property-boutique[1]/md-tabs[1]/md-tabs-wrapper[1]/md-tabs-canvas[1]/md-pagination-wrapper[1]/md-tab-item[2]"));
		AddElementsButton.click();
		driverwait(5);

	}

	@Test(priority=4)
	private void AddButtonFunc() throws InterruptedException {
		WebElement Button = driver.findElement(By.xpath("//*[@id=\"menu-option-Container\"]/div[1]/div[2]/div/img"));
		Button.click();
		driverwait(3);
	}

	@Test(priority=5)
	private void AddFormFunc() throws InterruptedException {
		WebElement Form = driver.findElement(By.xpath("//*[@id=\"menu-option-Container\"]/div[1]/div[3]"));
		Form.click();
		driverwait(3);
	}

	@Test(priority=6)
	private void AddTextFunc() throws InterruptedException {
		WebElement Text = driver.findElement(By.xpath("//*[@id=\"menu-option-Container\"]/div[1]/div[4]"));
		Text.click();
		driverwait(3);
	}

	@Test(priority=7)
	private void AddImageFunc() throws InterruptedException {
		WebElement Image = driver.findElement(By.xpath("//*[@id=\"menu-option-Container\"]/div[1]/div[5]"));
		Image.click();
		driverwait(3);
	}

	@Test(priority=8)
	private void AddTimerFunc() throws InterruptedException {
		WebElement Timer = driver.findElement(By.xpath("//*[@id=\"menu-option-Container\"]/div[1]/div[6]"));
		Timer.click();
		driverwait(3);
	}

	@Test(priority=9)
	private void AddMenuFunc() throws InterruptedException {
		WebElement Menu = driver.findElement(By.xpath("//*[@id=\"menu-option-Container\"]/div[1]/div[7]"));
		Menu.click();
		driverwait(3);
	}

	@Test(priority=10)
	private void AddArrowFunc() throws InterruptedException {
		WebElement Arrow = driver.findElement(By.xpath("//*[@id=\"menu-option-Container\"]/div[1]/div[8]/div/img"));
		Arrow.click();

		driverwait(3);
	}

	@Test(priority=11)
	private void AddLineFunc() throws InterruptedException {
		WebElement Line = driver.findElement(By.xpath("//*[@id=\"menu-option-Container\"]/div[1]/div[9]"));
		Line.click();
		driverwait(3);
	}

	@Test(priority=12)
	private void AddSRQquestion() throws InterruptedException {
		WebElement QuestionBtn = driver.findElement(By.xpath("//*[@id=\"menu-option-Container\"]/div[1]/div[10]/div/img"));
		QuestionBtn.click();
		driverwait(2);
		WebElement SRQBtn = driver.findElement(By.xpath("//md-list-item[@class='_md']//div[1]//button[1]"));
		SRQBtn.click();
		driverwait(2);
	}

	@Test(priority=13)
	private void AddMRQquestion() throws InterruptedException {
		WebElement QuestionBtn = driver.findElement(By.xpath("//*[@id=\"menu-option-Container\"]/div[1]/div[10]/div/img"));
		QuestionBtn.click();
		WebElement MRQBtn = driver.findElement(By.xpath("//*[@id=\"dialogContent_63\"]/md-list/md-list-item/div[2]"));
		MRQBtn.click();
		driverwait(3);
		WebElement Close = driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions/button"));
		Close.click();
	}

	@Test(priority=14)
	private void AddMatchTheFollowingQuestion() throws InterruptedException {
		WebElement QuestionBtn = driver.findElement(By.xpath("//*[@id=\"menu-option-Container\"]/div[1]/div[10]/div/img"));
		QuestionBtn.click();
		WebElement MatchQuesBtn = driver.findElement(By.xpath("//*[@id=\"dialogContent_63\"]/md-list/md-list-item/div[3]"));
		MatchQuesBtn.click();
		driverwait(3);
		WebElement Close = driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions/button"));
		Close.click();
	}

	@Test(priority=15)
	private void AddSequenceQuestion() throws InterruptedException {
		WebElement QuestionBtn = driver.findElement(By.xpath("//*[@id=\"menu-option-Container\"]/div[1]/div[10]/div/img"));
		QuestionBtn.click();
		WebElement SequenceQuesBtn = driver.findElement(By.xpath("//*[@id=\"dialogContent_63\"]/md-list/md-list-item/div[4]"));
		SequenceQuesBtn.click();
		driverwait(3);
		WebElement Close = driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions/button"));
		Close.click();
	}

	@Test(priority=16)
	private void AddFillBlankQuestion() throws InterruptedException {
		WebElement QuestionBtn = driver.findElement(By.xpath("//*[@id=\"menu-option-Container\"]/div[1]/div[10]/div/img"));
		QuestionBtn.click();
		WebElement FillBlankQuesBtn = driver.findElement(By.xpath("//*[@id=\"dialogContent_63\"]/md-list/md-list-item/div[5]"));
		FillBlankQuesBtn.click();
		driverwait(3);
		WebElement Close = driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions/button"));
		Close.click();
	}

	@Test(enabled=false)
	private void UploadFileFromDrive() throws InterruptedException 
	{
		
		  WebElement UploadFilesBtn = driver.findElement(By.xpath("//div[contains(text(),'Upload Files')]"));
		  UploadFilesBtn.click();
		  implicitwait(4);
		
		WebElement DriveBtn = driver.findElement(By.id("driveuploader"));
		DriveBtn.sendKeys("C:/Users/Dell/Downloads/Videotap/Around the World in 80 Clips.mp4");
		Thread.sleep(5000);

		WebElement SaveToMediaLib = driver.findElement(By.xpath("//*[@id=\"unique\"]/md-dialog-actions/button[2]"));
		SaveToMediaLib.click();
		driverwait(150);
		WebElement DoneBtn = driver.findElement(By.xpath("/html/body/div[3]/md-dialog/md-dialog-actions/button"));
		DoneBtn.click();

	}
	

	@Test(priority=17)
	private void closewebBrowser() throws InterruptedException 
	{
		System.out.println("Yepiiee Test Pass...");
		Thread.sleep(3000);
		driver.quit();

	}

}
