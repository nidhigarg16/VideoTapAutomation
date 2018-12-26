package videoTapAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class DRLoginTest 
{

	WebDriver driver;

	@Test(priority = 1)
	private void browserSetUp() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		Thread.sleep(3000);
		driver.manage().window().maximize();

	}

	@Test(priority = 2)
	private void vtapLogin() throws InterruptedException 
	{

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
	private void CreateNewProject() throws InterruptedException 
	{

		WebDriverWait Wait1 = new WebDriverWait(driver, 20);
		Wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#navbar > md-toolbar > div > div.width-40-per.navbar-color-blue.flex > div > condtional > h2")));
		Wait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#navbar > md-toolbar > div > div.width-40-per.navbar-color-blue.flex > div > condtional > h2")));
		WebElement Heading = driver.findElement(By.cssSelector("#navbar > md-toolbar > div > div.width-40-per.navbar-color-blue.flex > div > condtional > h2"));

		String actualTitle = Heading.getText();
		Assert.assertEquals(actualTitle, "Welcome to DESIGN SUITE");

		Thread.sleep(3000);
		WebElement CreateNewProjectButton = driver.findElement(By.cssSelector("#navbar > md-toolbar > div > div:nth-child(2) > condtional > div"));
		CreateNewProjectButton.click();

		Thread.sleep(3000);

        WebElement NameField = driver.findElement(By.xpath("//input[@ng-model='project.name'][@name='name']"));
		//WebElement NameField = driver.findElement(By.name("name"));
	//	WebElement NameField = driver.findElement(By.id("input_51"));
		Thread.sleep(3000);
		//WebDriverWait Wait2 = new WebDriverWait(driver, 20);
		//Wait1.until(ExpectedConditions.visibilityOfElementLocated(By.name("name")));
		//Wait2.until(ExpectedConditions.elementToBeClickable(By.name("name")));
		
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
		
		List<WebElement> radioButton = driver.findElements(By.tagName("md-radio-button"));
        System.out.println(radioButton.size());
        
        // To Select Type of Content Radio Button:- 
       driver.findElement(By.cssSelector("#radio_64 > div.md-container.md-ink-ripple > div.md-on")).click();
       WebDriverWait Wait3 = new WebDriverWait(driver, 20);
       Wait3.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#radio_64 > div.md-container.md-ink-ripple > div.md-on")));
       Wait3.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#radio_64 > div.md-container.md-ink-ripple > div.md-on")));
       
        for(int i=0;i<radioButton.size();i++) 
        {
            System.out.println(radioButton.get(i).getText());
        } 
        //If u want to check whether the radio button is selected or not
        if(driver.findElement(By.cssSelector("#radio_64 > div.md-container.md-ink-ripple > div.md-on")).isSelected()) 
        {
            System.out.println("True");
        }
        else 
        {
            System.out.println("False");
        }
		
        
		// Finding the Check Box element:- 
		List<WebElement> chkBx_Genre = driver.findElements(By.xpath("//input[@type='checkbox']"));		
		// This will tell you the number of Check Boxes are present
		int iSize = chkBx_Genre.size();
		System.out.println("No. of checkboxes are:- " + iSize);
		
		for(int i=1; i<=iSize; i++)
		{
			if(i==4)          // number of checkboxes to be selected
				break;
			WebElement value = chkBx_Genre.get(i);
			
			value.click();
			
			Thread.sleep(3000);
	    }
		Thread.sleep(3000);
		
	 // Adding Thumbnail to Project :- 
		WebElement Thumbnail = driver.findElement(By.xpath("//*[@id=\"dialogContent_createProject\"]/div[2]/div[1]/div/p/span"));
		Thumbnail.click();
		Thread.sleep(5000);
		WebElement AddButton = driver.findElement(By.id("imageuploader_new_proj"));
		AddButton.sendKeys("C:/Users/Dell/Downloads/Videotap/Travel.jpg");
		Thread.sleep(5000);
		WebElement DoneButton = driver.findElement(By.xpath("//*[@id=\"dialogContent_107\"]/div/button"));
		DoneButton.click();
		Thread.sleep(3000);
//		WebElement OKButton = driver.findElement(By.xpath("//*[@id=\"addImage-dig\"]/md-dialog-actions/button"));
//		OKButton.click();
//		Thread.sleep(3000);
//		
	/*	WebElement SearchButton = driver.findElement(By.xpath("//*[@id=\"add_image_toolbar\"]/div/button[1]/ng-md-icon"));
		SearchButton.click();
		WebElement SearchField = driver.findElement(By.xpath("//*[@id=\"addImage-dig\"]/md-toolbar[2]/div/form/input"));
		SearchField.click();
		SearchField.sendKeys("Travel.jpg");
		WebElement checkbox = driver.findElement(By.xpath("#dialogContent_addImage-dig > md-card > md-table-container > table > tbody > tr:nth-child(1) > td.md-cell.md-checkbox-cell > md-checkbox > div.md-container.md-ink-ripple"));
		checkbox.click();
		WebElement OKButton = driver.findElement(By.xpath("//*[@id=\"addImage-dig\"]/md-dialog-actions/button"));
		OKButton.click();
    */
		
		// Adding videoa to media library:- 
		WebElement selectMediaButton = driver.findElement(By.xpath("//*[@id=\"dialogContent_createProject\"]/div[2]/div[3]/div[1]/div"));
		selectMediaButton.click();
		Thread.sleep(3000);
		WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"dialogContent_addMedia-dig\"]/md-card/md-table-container/table/tbody[1]/tr/td[1]/md-checkbox"));
		checkbox.click();
		WebElement importButton = driver.findElement(By.xpath("//*[@id=\"addMedia-dig\"]/md-dialog-actions/button"));
		importButton.click();
		
		driver.findElement(By.xpath("//*[@id=\"dialogContent_createProject\"]/div[2]/md-dialog-actions/button[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"dialogContent_createProject\"]/div[2]/md-dialog-actions/button[1]/span")).click();
		Thread.sleep(8000);
		
    	WebDriverWait Wait4 = new WebDriverWait(driver, 40);
		Wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"navbar\"]/md-toolbar/div/div[4]")));
		Wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"navbar\"]/md-toolbar/div/div[4]")));
		
		WebElement Header = driver.findElement(By.xpath("//*[@id=\"navbar\"]/md-toolbar/div/div[4]"));
		String ActualHeader = Header.getText();
		Assert.assertEquals(ActualHeader, "Welcome to Edit Suite");
		
		Thread.sleep(5000);
	
		driver.quit();

	}

	
	@AfterTest
	private void closewebBrowser() 
	{
		System.out.println("Yepiiee Test Pass...");
		driver.quit();

	}
}
