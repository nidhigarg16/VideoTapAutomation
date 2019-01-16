package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// import org.testng.annotations.AfterTest;

import org.testng.annotations.Test;

import testBase.TestBase;

public class EditVODProject extends TestBase {

	@Test
	private void browserSetUp() throws InterruptedException {
		init();
		
	//	DRLoginTest obj1 = new DRLoginTest();
	//	obj1.vtapLogin();
		
		WebElement Username = driver.findElement(By.xpath("//*[@id=\"main-element\"]/div/form/div[8]/input"));
		Username.click();
		Username.sendKeys("nidhi@videotap.com");

		WebElement Password = driver.findElement(By.xpath("//*[@id=\"main-element\"]/div/form/div[11]/input"));
		Password.click();
		Password.sendKeys("123456789");
		driverwait(1);

		WebElement LoginButton = driver.findElement(By.xpath("//img[@ng-click='login(form)']"));
		LoginButton.click();
		driverwait(10);
	
	}

	@Test
	private void OpenProject() throws InterruptedException {
		System.out.println("hello");
		implicitwait(10);
		driver.get("https://qadr.videotap.com:1337/#!/login");
		driverwait(5);
		String OpenURL = "https://qadr.videotap.com:1337/#!/workspace/5c3ee26e8c25d951b673f21e";
		driver.get(OpenURL);
		driverwait(15);
	}

	@Test
	private void EditSuiteFunc() throws InterruptedException 
	{

		System.out.println("WELCOME TO EDIT SUITE ...!!!!!");
		driverwait(3);
		WebElement projectFileButton = driver.findElement(By.xpath("//md-icon[@id='workspaceMark']"));
		projectFileButton.click();
		driverwait(2);
		WebElement projectFile = driver.findElement(By.xpath("//a[@id='5c3ee25f8c25d951b673f21d_anchor']"));
		projectFile.click();
		driverwait(8);
	}
	
	@Test
	private void ElementsFunction() throws InterruptedException
	{
		
		WebElement ElementsButton = driver.findElement(By.xpath("//md-whiteframe[@id='accordinToolBar']//div[7]//button[2]//md-icon[1]"));
		ElementsButton.click();
		driverwait(3);
		WebElement AddElementsButton = driver.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/div[1]/ui-view[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/command-boutique[1]/div[2]/div[1]/div[1]/property-boutique[1]/md-tabs[1]/md-tabs-wrapper[1]/md-tabs-canvas[1]/md-pagination-wrapper[1]/md-tab-item[2]"));
		AddElementsButton.click();
		driverwait(5);

	}

	@Test
	private void AddButtonFunc() throws InterruptedException {
		WebElement Button = driver.findElement(By.xpath("//*[@id=\"menu-option-Container\"]/div[1]/div[2]/div/img"));
		Button.click();
		driverwait(3);
	}

	@Test
	private void AddFormFunc() throws InterruptedException {
		WebElement Form = driver.findElement(By.xpath("//div[@class='mrg-tp-10 menu-btn-container mouse-pointer backgroung-black']//img[@class='worksapce-menu-icon']"));
		Form.click();
		driverwait(3);
	}

	@Test
	private void AddTextFunc() throws InterruptedException {
		WebElement Text = driver.findElement(By.xpath("//*[@id=\"menu-option-Container\"]/div[1]/div[4]"));
		Text.click();
		driverwait(3);
	}

	@Test
	private void AddImageFunc() throws InterruptedException {
	//	WebElement Image = driver.findElement(By.xpath("//div[@class='toolbar newelement layout-fill layout-wrap layout-align-center-start layout-row']//div[5]//div[1]//img[1]"));
        WebElement Image = driver.findElement(By.xpath("//*[@id=\"menu-option-Container\"]/div[1]/div[5]/div/img"));
		Image.click();
		driverwait(3);
	}

	@Test
	private void AddTimerFunc() throws InterruptedException {
		WebElement Timer = driver.findElement(By.xpath("//*[@id=\"menu-option-Container\"]/div[1]/div[6]"));
		Timer.click();
		driverwait(3);
	}

	@Test
	private void AddMenuFunc() throws InterruptedException {
		WebElement Menu = driver.findElement(By.xpath("//*[@id=\"menu-option-Container\"]/div[1]/div[7]"));
		Menu.click();
		driverwait(3);
	}

	@Test
	private void AddArrowFunc() throws InterruptedException {
		WebElement Arrow = driver.findElement(By.xpath("//*[@id=\"menu-option-Container\"]/div[1]/div[8]/div/img"));
		Arrow.click();

		driverwait(3);
	}

	@Test
	private void AddLineFunc() throws InterruptedException {
		WebElement Line = driver.findElement(By.xpath("//*[@id=\"menu-option-Container\"]/div[1]/div[9]"));
		Line.click();
		driverwait(3);
	}

	@Test
	private void AddSRQquestion() throws InterruptedException {
	//	WebElement QuestionBtn = driver.findElement(By.xpath("//*[@id=\"menu-option-Container\"]/div[1]/div[10]/div/img"));
		WebElement QuestionBtn = driver.findElement(By.xpath("//*[@id=\"menu-option-Container\"]/div/div[11]/div/img"));
		
		QuestionBtn.click();
		driverwait(2);
	//	WebElement SRQBtn = driver.findElement(By.xpath("//md-list-item[@class='_md']//div[1]//button[1]"));
		WebElement SRQBtn = driver.findElement(By.xpath("//md-list-item[@class='md-no-proxy _md']//div[1]//button[1]"));
		
		SRQBtn.click();
		driverwait(2);
	}

	@Test
	private void AddMRQquestion() throws InterruptedException {
		WebElement QuestionBtn = driver.findElement(By.xpath("//*[@id=\"menu-option-Container\"]/div[1]/div[10]/div/img"));
		QuestionBtn.click();
		WebElement MRQBtn = driver.findElement(By.xpath("//md-list-item[@class='_md']//div[2]//button[1]//md-icon[1]"));
		MRQBtn.click();
		driverwait(3);
	}

	@Test
	private void AddMatchTheFollowingQuestion() throws InterruptedException {
		WebElement QuestionBtn = driver.findElement(By.xpath("//*[@id=\"menu-option-Container\"]/div[1]/div[10]/div/img"));
		QuestionBtn.click();
		WebElement MatchQuesBtn = driver.findElement(By.xpath("//md-list-item[@class='_md']//div[3]//button[1]//md-icon[1]"));
		MatchQuesBtn.click();
		driverwait(3);
	}

	@Test
	private void AddSequenceQuestion() throws InterruptedException {
		WebElement QuestionBtn = driver.findElement(By.xpath("//*[@id=\"menu-option-Container\"]/div[1]/div[10]/div/img"));
		QuestionBtn.click();
		WebElement SequenceQuesBtn = driver.findElement(By.xpath("//md-list-item[@class='_md']//div[4]//button[1]//md-icon[1]"));
		SequenceQuesBtn.click();
		driverwait(3);
	}

	@Test
	private void AddFillBlankQuestion() throws InterruptedException {
		WebElement QuestionBtn = driver.findElement(By.xpath("//*[@id=\"menu-option-Container\"]/div[1]/div[10]/div/img"));
		QuestionBtn.click();
		WebElement FillBlankQuesBtn = driver.findElement(By.xpath("//div[@class='card mrg-lft-10 mrg-rght-10']//md-icon[@class='ng-scope']"));
		FillBlankQuesBtn.click();
		driverwait(3);
	}

	@Test
	private void TriggerFunction() throws InterruptedException
	{	
		driverwait(3);
		WebElement TriggerButton = driver.findElement(By.xpath("//md-whiteframe[@id='accordinToolBar']//div[12]//button[2]//md-icon[1]"));
		TriggerButton.click();
		driverwait(3);
		
		WebElement AddTriggerBtn = driver.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/div[1]/ui-view[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/command-boutique[1]/div[2]/div[1]/div[1]/trigger-boutique[1]/md-tabs[1]/md-tabs-wrapper[1]/md-tabs-canvas[1]/md-pagination-wrapper[1]/md-tab-item[2]"));
		AddTriggerBtn.click();
		driverwait(3);
		
		WebElement CurrentMediaBtn = driver.findElement(By.xpath("//select[@ng-model='currentMedia']"));
		CurrentMediaBtn.click();
		driverwait(3);
		
		WebDriverWait Wait = new WebDriverWait(driver, 20);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("playpause")));
		Wait.until(ExpectedConditions.elementToBeClickable(By.id("playpause")));
		WebElement PlayBtn = driver.findElement(By.id("playpause"));
		PlayBtn.click();
		driverwait(15);
		PlayBtn.click();
		
		driverwait(3);
		WebElement TriggerName = driver.findElement(By.xpath("//input[@placeholder='Enter Trigger Name']"));
		TriggerName.click();
		TriggerName.sendKeys("ShowTrigger1");
		driverwait(3);
		
		WebElement ExecuteOnSeek_ChkBx = driver.findElement(By.xpath("//div[@class='layout-row flex']//div//md-checkbox[@type='checkbox']"));
		if ( ! ExecuteOnSeek_ChkBx.isSelected() )
		{
			ExecuteOnSeek_ChkBx.click();
		}
		
		WebElement Once_ChkBx = driver.findElement(By.xpath("//div[@class='layout-row flex-20']//div//md-checkbox[@type='checkbox']"));
		if ( ! Once_ChkBx.isSelected() )
		{
			Once_ChkBx.click();
		}
		driverwait(3);
		WebElement SaveBtn = driver.findElement(By.xpath("//button[@class='create-btn mrg-lft-10']"));
		SaveBtn.click();
		driverwait(3);
	}
	
	@Test
	private void ArrangementFunction()
	{
		WebElement ArrangementBtn = driver.findElement(By.xpath("//md-whiteframe[@id='accordinToolBar']//div[8]//button[2]//md-icon[1]"));
		ArrangementBtn.click();
		
		WebElement AddArrangementIcon = driver.findElement(By.xpath("//span[@class='ng-scope'][contains(text(),'+')]")); 
		AddArrangementIcon.click();
		
		WebElement SearchArrangementField = driver.findElement(By.xpath("//*[@id=\"arrange-container\"]/div[2]/button/span"));
		SearchArrangementField.click();
		
		WebElement EnterArrangementName = driver.findElement(By.xpath("//input[@ng-model='arrangement.name']"));
		EnterArrangementName.sendKeys("My arrangement");
		EnterArrangementName.click();
		
		WebElement ArrangementSaveButton = driver.findElement(By.xpath("//*[@id=\"arrange-container\"]/div[3]/div[3]/button"));
		ArrangementSaveButton.click();
		
	//	WebElement EditArrangementButton = driver.findElement(By.xpath("//div//div[@class='arrangement_accordion']//div//button[1]"));
	//	EditArrangementButton.click();
			
	//	WebElement DeleteArrangementButton = driver.findElement(By.xpath("//command-boutique[@class='ng-scope']//div//div//button[2]//md-icon[1]"));
	//	DeleteArrangementButton.click();
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
	

	@Test
	private void closewebBrowser() throws InterruptedException 
	{
		System.out.println("Yepiiee Test Pass...");
		Thread.sleep(3000);
		driver.quit();

	}

}
