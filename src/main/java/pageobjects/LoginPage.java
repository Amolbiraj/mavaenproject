package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	public  WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		super(driver);
		
	}
	
	@FindBy(name="uid")  WebElement txtemail;
	@FindBy(xpath="//input[@name='password']") WebElement  txtpass;
	@FindBy(xpath="//input[@type='submit']") WebElement btnlogin;
	@FindBy(xpath="//a[text()='Log out']") WebElement btnlogout;
	
	
	public void setEmail(String email1)
	{   
		txtemail.sendKeys(email1);
	}
	public void setPassword(String pass)
	{
		
		txtpass.sendKeys(pass);
		
	}
	public void clickLogin()
	{
		btnlogin.click();
	}
	public void clickLogot()
	{
		btnlogout.click();
	}
	
	
		
	
	

}
