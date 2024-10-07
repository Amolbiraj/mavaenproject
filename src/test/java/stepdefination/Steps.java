package stepdefination;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageobjects.LoginPage;

public class Steps {

	public WebDriver driver;
	public LoginPage lp;
	
	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");	
		    driver =new ChromeDriver();
		    lp=new LoginPage(driver);
	    
	}

	@When("user open url {string}")
	public void user_open_url(String url) {
		driver.get(url);
	    
	}

	@When("User enter email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String email, String password) {
		
	    lp.setEmail(email);
		lp.setPassword(password);
	    
	}

	@When("click on login")
	public void click_on_login() throws InterruptedException {
		lp.clickLogin();
		Thread.sleep(2000);
		String curenturl=driver.getCurrentUrl();
		System.out.println(curenturl);
		if(curenturl.equals("https://demo.guru99.com/v4/manager/Managerhomepage.php"))
		{
			Assert.assertTrue(true);
			System.out.println("test case pass");
			Thread.sleep(3000);
			lp.clickLogot();
			driver.switchTo().alert().accept();
		}
			
		
		
		else {
			Assert.assertTrue(false);
			Thread.sleep(5000);
			
			driver.switchTo().alert().accept();
		}
		
		
		
		
		
		
		
		
		
	    
	}

	@Then("Page url Should Be {string}")
	public void page_url_should_be(String url1) throws InterruptedException {
		
	//String acturl=driver.getCurrentUrl();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.switchTo().alert().accept();
		
			Assert.assertEquals(url1,driver.getCurrentUrl());
	
	    
	}

//	@When("user click on logout link")
//	public void user_click_on_logout_link() {
//		lp.clickLogot();
//	    
	//}

//	@Then("user title should be \"Your store.Login'")
//	public void user_title_should_be_your_store_login() {
//	  
//	}

//	@Then("close browser")
//	public void close_browser() {
	//	driver.close();
	   
//	}



}
