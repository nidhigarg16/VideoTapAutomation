package testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import testBase.TestBase;

public class Marker extends TestBase
{
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
	private void EditSuiteFunc() throws InterruptedException 
	{

		System.out.println("WELCOME TO EDIT SUITE ...!!!!!");
		driverwait(3);
		WebElement projectFileButton = driver.findElement(By.xpath("//*[@id=\"btnMediaLib\"]"));
		projectFileButton.click();
		driverwait(2);
		WebElement projectFile = driver.findElement(By.id("5c2c4f9e925cc0b43bcac10e_anchor"));
		projectFile.click();  
		driverwait(3);
	}

	
	@Test(priority=4)
	private void AddMarker() throws InterruptedException
	{
	WebElement MarkerBtn = driver.findElement(By.xpath("//md-whiteframe[@id='accordinToolBar']//div[4]//button[2]//md-icon[1]"));
	MarkerBtn.click();
	driverwait(3);
	
	WebDriverWait Wait = new WebDriverWait(driver, 20);
	Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("playpause")));
	Wait.until(ExpectedConditions.elementToBeClickable(By.id("playpause")));   
	
	WebElement PlayBtn = driver.findElement(By.id("playpause"));
	PlayBtn.click();
	driverwait(3);
	WebElement In = driver.findElement(By.xpath("//a[@ng-click='addin()']"));
	In.click();
	WebElement NameOfInMarker = driver.findElement(By.xpath("//*[@id=\"marker-content\"]/div/div[2]/div[1]/div[3]/span[2]/input"));
	NameOfInMarker.sendKeys("Marker1");
	driverwait(2);
	WebElement SaveBtn = driver.findElement(By.xpath("//*[@id=\"marker-content\"]/div/div[2]/div[1]/div[4]/button"));
	SaveBtn.click();
	driverwait(17);
	WebElement Out = driver.findElement(By.xpath("//*[@id=\"marker-content\"]/div/div[2]/div[3]/div[3]/span[1]/a"));
	Out.click();
	PlayBtn.click();
	WebElement NameOfOutMarker = driver.findElement(By.xpath("//*[@id=\"marker-content\"]/div/div[2]/div[1]/div[3]/span[2]/input"));
	NameOfOutMarker.sendKeys("Marker2");
	SaveBtn.click();	
	driverwait(2);
	}
	
	@Test(enabled=false)
	private void SearchMarker() throws InterruptedException
	{
		WebElement SearchMarkerBtn = driver.findElement(By.xpath("//*[@id=\"markerSearch\"]/input"));
		SearchMarkerBtn.click();
		SearchMarkerBtn.sendKeys("Marker1");
		SearchMarkerBtn.click();
		driverwait(3);
	}
	
	@Test(enabled=false)
     private void DeleteMarker() throws InterruptedException
     {
		WebElement DeleteMarkerBtn = driver.findElement(By.xpath("//md-icon[@class='deshboard-edit-icon-marker-delete']"));
		DeleteMarkerBtn.click();
		driverwait(3);
	//	WebElement YesBtn = driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions/button[2]"));
	//	YesBtn.click();
		
		WebElement NoBtn = driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions/button[1]"));
		NoBtn.click();	
	  }
	
	@Test(priority=5)
	private void CreateSubClipFromMarker() throws InterruptedException
	{
	//	WebElement SubclipINicon = driver.findElement(By.xpath("//a[contains(text(),'-IN')]"));
	//	SubclipINicon.click();
	//	driverwait(10);
	//	WebElement SubclipOUTicon = driver.findElement(By.xpath("//a[contains(text(),'-OUT')]"));
	//	SubclipOUTicon.click();
		
		WebElement MetaData_SaveIcon = driver.findElement(By.xpath("//button[contains(text(),'+ Meta Data & Save')]"));
		MetaData_SaveIcon.click();
		driverwait(3);
	}
	
	@Test(priority=6) 
	private void ContentSelectFunc() throws InterruptedException
	{
		WebElement ContentSelection = driver
				.findElement(By.xpath("//md-radio-button[@id='radio_7']//div[@class='md-off']"));
		ContentSelection.click();
		driverwait(2);
		List<WebElement> radioButton = driver.findElements(By.tagName("md-radio-button"));
		System.out.println(radioButton.size());
		
		// To Select Type of Content Radio Button:-
		driver.findElement(By.xpath("//md-radio-button[@id='radio_7']//div[@class='md-on']")).click();
		WebDriverWait Wait = new WebDriverWait(driver, 20);
		Wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//md-radio-button[@id='radio_7']//div[@class='md-on']"))).click();
		Wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//md-radio-button[@id='radio_7']//div[@class='md-on']"))).click();

		for (int i = 0; i < radioButton.size(); i++) 
			{
				System.out.println(radioButton.get(i).getText());
			}
		// If u want to check whether the radio button is selected or not
		if (driver.findElement(By.xpath("//md-radio-button[@id='radio_7']//div[@class='md-on']")).isSelected()) 
			{
				System.out.println("True");
			} 
		else 
			{
				System.out.println("False");
			}
		}
		
	@Test(priority=7)
	private void GenreSelectFunc() throws InterruptedException
	{
	    // Finding the Check Box element:-
	List<WebElement> chkBx_Genre = driver.findElements(By.xpath("//input[@type='checkbox']"));
	    // This will tell you the number of Check Boxes are present
	int iSize = chkBx_Genre.size();
	System.out.println("No. of checkboxes are:- " + iSize);

	for (int i = 1; i <= iSize; i++) 
		{
			if (i == 4) // number of checkboxes to be selected
			break;
			WebElement value = chkBx_Genre.get(i);
			value.click();
			Thread.sleep(3000);
		}
	Thread.sleep(3000);
	}
		
	 @Test(priority=8)
		private void AddLanguageFunc() throws InterruptedException
		{
		WebElement LanguageField = driver.findElement(By.xpath("//md-select[@ng-model='project.language']"));
		LanguageField.click();
		implicitwait(5);
		Thread.sleep(2000);

		WebElement langSelection = driver.findElement(By.xpath("//div[contains(text(),'English')]"));
		langSelection.click();
		driverwait(2);
		}
	 
	 @Test(priority=9)
		private void AddTags() throws InterruptedException
		{
		 
		WebElement Tags = driver.findElement(By.xpath("//*[@id=\"input-25\"]"));
		Tags.click();
		Tags.sendKeys("Travel");
		Tags.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	
		WebElement OKbutton = driver.findElement(By.xpath("//span[contains(text(),'ok')]"));
		OKbutton.click();
		driverwait(5);
		}
	

	

	@AfterTest
	private void closewebBrowser() throws InterruptedException 
	{
		System.out.println("Yepiiee Test Pass...");
		Thread.sleep(3000);
		driver.quit();

	}
	
}
