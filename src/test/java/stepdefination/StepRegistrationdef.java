package stepdefination;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageobjects.AccountRegistration;
import pageobjects.HomePage;
import pageobjects.LoginOpencart;
import utility.ReadConfig;


public class StepRegistrationdef extends BaseClass {
 LoginOpencart lo;

@Before
public void setUp()
{
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");	
	 rc=new ReadConfig();
	 if(rc.browserName().equals("chrome"))
	 {
	 driver=new ChromeDriver();
	 }
	 else {
		 System.out.println("check the driver");
	 }
	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 logger=LogManager.getLogger(this.getClass());
	 lo=new LoginOpencart(driver);
	 hp=new HomePage(driver);
	 ar=new AccountRegistration(driver);


	 
}
	
	@Given("user open chrome browser")
	public void user_open_chrome_browser() {
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");	
		   // driver =new ChromeDriver();
	logger.info("succesfully initilize the broweser");

	}

	@When("user open url as {string}")
	public void user_open_url_as(String url) {
		driver.get(url);
		logger.info("user can be entered url");
	    
	}
	@When("user click on MyAccount dropdown")
	public void user_click_on_my_account_dropdown() throws InterruptedException {

		hp.clickMyAccount();
		logger.info("user succesfuuly click on my account");
	    
	}

	@When("user click on register on dropdown")
	public void user_click_on_register_on_dropdown() throws InterruptedException {
		hp.clickRegister();
	    
	}

	@Then("page currenturl should be {string}")
	public void page_currenturl_should_be(String currenturl) throws InterruptedException {
		Thread.sleep(3000);
		if(driver.getCurrentUrl().contains(currenturl)) {
			Assert.assertTrue(true);
			System.out.println("test case pass");
		}
		else {
			Assert.assertTrue(false);
			System.out.println("test case fail");
		}
		
		
	}

	@When("user filling personal information in registration page")
	public void user_filling_personal_information_in_registration_page() {
		
    
    ar.setFirstName("wydyw");
    ar.setLastName("gdugi");
    String email=generateRandomString()+"@gmail.com";
    ar.setEmail(email);
    ar.setpassword("gdiiw");
    
    
    
	}

	@When("user click on privacy policy button")
	public void user_click_on_privacy_policy_button() {
	    ar.clickCheckbox();

	   
	}

	@When("user click on continue")
	public void user_click_on_continue() {
	    ar.clickContinue();

	   
	}

	@Then("user title should be {string}")
	public void user_title_should_be(String title) throws InterruptedException {
		//String acttitle=driver.getTitle();
		//System.out.println(acttitle);
		Thread.sleep(5000);
		
		Assert.assertEquals(title, driver.getTitle());
		

	    
	}
	@After
	public void screenCapture(Scenario sc) throws IOException
	{
		if(sc.isFailed()==true)
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			String path=System.getProperty("user.dir")+"\\Screenshot\\"+"\\opencart.png";
			File dest=new File(path);
			FileHandler.copy(source, dest);
			
		}	
	}
	
	//login scenario method
	
	@When("user click on login   dropdown")
	public void user_click_on_login_dropdown() {
	   hp.clickLogin();
	}

	@When("user enter email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String email, String password)  {
		

	  lo.setEmail(email); 
	  lo.setPassword(password);
	}

	@When("user click on login button")
	public void user_click_on_login_button() {

		lo.clickLogin();
	   
	}

	@Then("page title shuld be {string}")
	public void page_title_shuld_be(String title) throws InterruptedException {
		Thread.sleep(10000);
		Assert.assertEquals(title, driver.getTitle());

	   
	}

	@When("user move to mp3player tab")
	public void user_move_to_mp3player_tab() {
		 LoginOpencart lo=new LoginOpencart(driver);

		lo.moveToMp3();
	    
	}

	@When("click on test16\\({int})")
	public void click_on_test16(Integer int1) {

		lo.clickTest16();
	   
	}

	@When("user click on continue button")
	public void user_click_on_continue_button() {

		lo.clickOnContinuebtn();
	    
	}

	@Then("page titile should be {string}")
	public void page_titile_should_be(String title1) throws InterruptedException {
		
		Thread.sleep(5000);
		Assert.assertEquals(title1, driver.getTitle());

	   
	}

	@When("user click on iphone")
	public void user_click_on_iphone() {

		lo.clickIphoneimg();
	    
	}

	@When("user click on addToCart")
	public void user_click_on_add_to_cart() {

		lo.clickOnAddCart();
	    
	}


	
	
	
	
	
	
	
	
	
	

}
